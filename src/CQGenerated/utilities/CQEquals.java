package CQGenerated.utilities;

import java.util.Arrays;

// This class only exists so that it's easier for us to generate
// clean-looking "equals"-code into the model-specific CQRecord-classes.
public class CQEquals {
	public static boolean equals(boolean b1, boolean b2) {
		return b1 == b2;
	}

	public static boolean equals(int i1, int i2) {
		return i1 == i2;
	}

	public static boolean equals(float f1, float f2) {
		if (Float.compare(f1, f2) == 0)
			return true;
		// TODO: we might want this to be configurable!
		if (Math.abs(f1 - f2) <= 0.0001)
			return true;
		return false;
	}

	public static boolean equals(double d1, double d2) {
		if (Double.compare(d1, d2) == 0)
			return true;
		// TODO: we might want this to be configurable!
		if (Math.abs(d1 - d2) <= 0.0001)
			return true;
		return false;
	}

	public static boolean equals(Object o1, Object o2) {
		if (o1 != null) {
			if (!o1.equals(o2)) {
				return false;
			}
		} else if (o2 != null) {
			return false;
		}
		// This is the case where both are null.
		return true;
	}

	public static boolean equals(Object[] a1, Object[] a2) {
		return Arrays.deepEquals(a1, a2);
	}

	public static boolean equals(boolean[] a1, boolean[] a2) {
		return Arrays.equals(a1, a2);
	}

	public static boolean equals(int[] a1, int[] a2) {
		return Arrays.equals(a1, a2);
	}

	public static boolean equals(float[] a1, float[] a2) {
		return Arrays.equals(a1, a2);
	}

	public static boolean equals(double[] a1, double[] a2) {
		return Arrays.equals(a1, a2);
	}
}
