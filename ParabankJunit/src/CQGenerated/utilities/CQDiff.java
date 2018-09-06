package CQGenerated.utilities;

import java.io.BufferedReader;
import java.io.StringReader;

public class CQDiff {
	// This method pretty-prints expected and actual side-by-side into
	// a string for easy "human-inspection" of the differences between
	// the expected and actual values.
	//
	// This relies on the expected and actual themselves being in a
	// "human-readable line-by-line format" and it will then diff those
	// line by line. The idea here is that this is independent of the actual
	// kind of th expected/actual data as long as it's:
	// a) human-readable text
	// b) in a line-by-line format such that each "leaf piece of data" is on
	// a line of its own.
	// This allow using "known diff-techniques" to do the diff if we want
	// regardless of expected and actual are originally produced (separation
	// of concerns).
	//
	// For now the diff is based just simple homegrown stuff but we might
	// switch e.g. to http://code.google.com/p/java-diff-utils/ but not
	// just yet because this just generates another dependencey on 3rd party
	// stuff + we have no idea at this point if this is actually something
	// that users want... it might be that our homegrown simple stuff is
	// actually all they need because in most cases the "silhouette" of
	// expected and actual are the same and then this works just fine. Also,
	// the diffs in this case can be of a only a specific kinds (a) leaf-diff
	// b) different arrays sizes c) optionals missing) as there's no point in
	// diffing expected and actual which are totally of different types
	// (this is a problem in its own category) so rather than using a generic
	// diff we may get better results by just applying something that takes
	// into account the specifics of the problem.
	public static String diffSideBySide(String expected, String actual) {
		try {
			final String NEWLINE = System.getProperty("line.separator");
			// First read expected through once to know the length of the
			// longest string and based on that adjust how far appart the
			// expected and actual are on each line of the side-by-side diff:
			// offset 0 for the
			// actual will be set at <length of longest expectes string>+5
			// (surplus of 5 allows us to have " =/= " to indicate the lines
			// with differences.
			BufferedReader expReader = new BufferedReader(new StringReader(expected));
			String line;
			int len = 0;
			while ((line = expReader.readLine()) != null) {
				if (line.length() > len) {
					len = line.length();
				}
			}
			int actualOffset = len + 5;
			StringBuffer diff = new StringBuffer();
			expReader = new BufferedReader(new StringReader(expected));
			BufferedReader actReader = new BufferedReader(new StringReader(actual));
			String expLine = expReader.readLine();
			String actLine = actReader.readLine();
			diff.append("expected:" + spaces(actualOffset - "expected:".length()) + "actual:" + NEWLINE);
			while (expLine != null || actLine != null) {
				if (expLine == null)
					expLine = "";
				if (actLine == null)
					actLine = "";
				diff.append(expLine);
				if (expLine.equals(actLine)) {
					diff.append(spaces(actualOffset - expLine.length()));
				} else {
					diff.append(spaces(actualOffset - expLine.length() - 4));
					diff.append("=/= ");
				}
				diff.append(actLine);
				diff.append(NEWLINE);
				expLine = expReader.readLine();
				actLine = actReader.readLine();
			}
			return diff.toString();
		} catch (Exception e) {
			// Nothing else for us to return but then we should nevel really
			// come here...
			return "";
		}
	}

	private static String spaces(int count) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < count; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
}
