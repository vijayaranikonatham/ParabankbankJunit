package CQGenerated.utilities;

// Various utilities for data manipulation at test execution time.
// TODO: Now this file is just copied to utilities but in the later versions
// of JUnitScripter the idea is that the code that is now written manually
// into the harness that _uses_ this class is also generated automatically.
import java.lang.Integer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

public class CQData {
	public static String resolveCQSymbol(String symbol) {
		if (symbol.startsWith("${monthYYYYMM(")) {
			String argStart = symbol.substring("${monthYYYYMM(".length());
			int monOffset = Integer.parseInt(argStart.substring(0, argStart.length() - 2));
			return renderMonthYYYYMM(monOffset);

		} else if (symbol.startsWith("${monthMMMYYYY(")) {
			String argStart = symbol.substring("${monthMMMYYYY(".length());
			int monOffset = Integer.parseInt(argStart.substring(0, argStart.length() - 2));
			return renderMonthMMMYYYY(monOffset);
		} else if (symbol.startsWith("${dateYYYYMMDD(")) {
			String argStart = symbol.substring("${dateYYYYMMDD(".length());
			int dayOffset = Integer.parseInt(argStart.substring(0, argStart.length() - 2));
			return renderDateYYYYMMDD(dayOffset);
		} else if (symbol.startsWith("${UUID(")) {
			return replaceUUID(symbol);
		} else if (symbol.startsWith("${properties.")) {
			return replacePropertyValue(symbol);
		}
		// NOTE: we use contains here instead of startsWith because
		// "system-generated values" can be embedded in a strign, not
		// just at the beginning.
		else if (symbol.contains("${SYSTEMGENERATED_")) {
			return replaceSystemGenerated(symbol);
		} else {
			return symbol;
		}
	}

	private static String renderMonthYYYYMM(int monOffset) {
		Date theDate = dateNMonthsFromNow(monOffset);
		SimpleDateFormat yyyymmFmt = new SimpleDateFormat("yyyy-MM");
		return yyyymmFmt.format(theDate);
	}

	private static String renderMonthMMMYYYY(int monOffset) {
		Date theDate = dateNMonthsFromNow(monOffset);
		SimpleDateFormat mmmyyyyFmt = new SimpleDateFormat("MMM yyyy");
		return mmmyyyyFmt.format(theDate);
	}

	private static String renderDateYYYYMMDD(int dayOffset) {
		Date theDate = dateNDaysFromNow(dayOffset);
		SimpleDateFormat yyyymmddFmt = new SimpleDateFormat("yyyy-MM-dd");
		return yyyymmddFmt.format(theDate);
	}

	private static Date dateNMonthsFromNow(int monthOffset) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, monthOffset);
		return cal.getTime();
	}

	private static Date dateNDaysFromNow(int dayOffset) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, dayOffset);
		return cal.getTime();
	}

	private static HashMap<String, String> uuids;

	private static String replaceUUID(String symbol) {
		if (!uuids.containsKey(symbol)) {
			String uuid = UUID.randomUUID().toString();
			uuids.put(symbol, uuid);
			return uuid;
		} else {
			return uuids.get(symbol);
		}
	}

	private static HashMap<String, String> sysGenToRealValue;

	private static Properties properties = null;

	// This needs to be called at the "harness test setup time" to make
	// sure this class gets properly initialized.
	public static void setUp() {
		sysGenToRealValue = new HashMap<String, String>();
		uuids = new HashMap<String, String>();
	}

	public static void setProperties(Properties props) {
		properties = props;
	}

	public static String replacePropertyValue(String symbol) {
		String propName = symbol.substring("${properties.".length(), symbol.length() - 1);
		if (properties != null && properties.containsKey(propName)) {
			return properties.getProperty(propName);
		} else {
			return symbol;
		}
	}

	public static String replaceSystemGenerated(String withSysGen)
	// throws Exception
	{
		String replaced = withSysGen;
		// How to do it? This is not efficient but just go through all
		// values in sysGenToRealValue and do a raw String.replace().
		Set<String> keys = sysGenToRealValue.keySet();
		for (String key : keys) {
			String v = sysGenToRealValue.get(key);
			replaced = replaced.replace(key, v);
		}
		/*
		 * if (replaced.contains("${SYSTEMGENERATED_")) { throw new
		 * Exception("System generated value after all " + "substitutions in " +
		 * replaced); }
		 */
		return replaced;
	}

	public static String processSystemGenerated(String expected, String received) {
		if (expected.startsWith("${SYSTEMGENERATED_")) {
			// if it is, then if this value is not in the store, store
			// received and return received.
			if (!sysGenToRealValue.containsKey(expected)) {
				sysGenToRealValue.put(expected, received);
				return received;
			} else {
				// if the value _is_ in store, then just return that
				// value. In that case received value _should be_
				// identical with the stored value but we don't test it
				// here. If it's identical then there's an error either
				// in the model or in the SUT be we don't need to test
				// it here because the comparisons in test harness
				// will take care of that!
				return sysGenToRealValue.get(expected);
			}
		}
		// if expected is _not_ system-generated, return it as is
		return expected;
	}
}
