package CQGenerated.utilities;

// This class only exists so that it's easier for us to generate
// clean-looking "jzonizer"-code into the model-specific CQRecord-classes.
public class CQJSONize {
    public static String jsonize(boolean value, String indent) {
        return "" + value;
    }

    public static String jsonize(byte value, String indent) {
        return "" + value;
    }

    // NOTE: because chars outside optionals are treated as ints, for the
    // sake of consistence we must treat the char value here as int!
    public static String jsonize(char value, String indent) {
        return "" + (int) value;
    }

    public static String jsonize(short value, String indent) {
        return "" + value;
    }

    public static String jsonize(int value, String indent) {
        return "" + value;
    }

    public static String jsonize(float value, String indent) {
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.0000");
        df.setRoundingMode(java.math.RoundingMode.HALF_UP);
        return df.format((double) value);
    }

    public static String jsonize(double value, String indent) {
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.0000");
        df.setRoundingMode(java.math.RoundingMode.HALF_UP);
        return df.format(value);
    }

    public static String jsonize(String value, String indent) {
        return (value != null ? ("\"" + value + "\"") : "null");
    }

    public static String jsonize(Object value, String indent) {
        // NOTE: when there are optional primitives in records, the type
        // inside the Optional-generic is _not_ the primitive but the
        // corresponding class that that's why we need this:
        if (null == value) {
            return "null";
        }
        Class<?> c = value.getClass();
        if (c.isArray()) {
            if (c.getComponentType() == int.class) {
                return jsonize((int[]) value, indent);
            } else if (c.getComponentType() == boolean.class) {
                return jsonize((boolean[]) value, indent);
            } else if (c.getComponentType() == char.class) {
                return jsonize((char[]) value, indent);
            } else if (c.getComponentType() == byte.class) {
                return jsonize((byte[]) value, indent);
            } else if (c.getComponentType() == long.class) {
                return jsonize((long[]) value, indent);
            } else if (c.getComponentType() == double.class) {
                return jsonize((double[]) value, indent);
            } else if (c.getComponentType() == short.class) {
                return jsonize((short[]) value, indent);
            } else {
                return jsonize((Object[]) value, indent);
            }
        }else if (c == java.lang.Boolean.class) {
            return jsonize((boolean) (Boolean) value, indent);
        } else if (c == java.lang.Byte.class) {
            return jsonize((byte) (Byte) value, indent);
        } else if (c == java.lang.Character.class) {
            return jsonize((char) (Character) value, indent);
        } else if (c == java.lang.Float.class) {
            return jsonize((float) (Float) value, indent);
        } else if (c == java.lang.Integer.class) {
            return jsonize((int) (Integer) value, indent);
        } else if (c == java.lang.Short.class) {
            return jsonize((short) (Short) value, indent);
        } else if (c == java.lang.String.class) {
            return jsonize((String) value, indent);
        } else {
            // Otherwise: it's a "true jsonizeable"
            return ((CQJSONizeable) value).jsonize(indent);
        }
    }

    public static String jsonize(Object[] values, String indent) {
        if (values == null) {
            return "null";
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append("\n" + indent + "[\n");
            for (int i = 0; i < values.length; i++) {
                Object o = values[i];
                sb.append(jsonizeDispatchArrayElement(o, indent + "    "));
                if (i < (values.length - 1)) {
                    sb.append(",\n");
                } else {
                    sb.append("\n");
                }
            }
            sb.append(indent + "]");
            return sb.toString();
        }
    }

    public static String jsonize(boolean[] values, String indent) {
        if (values == null) {
            return "null";
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append("\n" + indent + "[\n");
            for (int i = 0; i < values.length; i++) {
                sb.append(indent + "    " + jsonize(values[i], indent));
                if (i < (values.length - 1)) {
                    sb.append(",\n");
                } else {
                    sb.append("\n");
                }
            }
            sb.append(indent + "]");
            return sb.toString();
        }
    }

    public static String jsonize(int[] values, String indent) {
        if (values == null) {
            return "null";
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append("\n" + indent + "[\n");
            for (int i = 0; i < values.length; i++) {
                sb.append(indent + "    " + jsonize(values[i], indent));
                if (i < (values.length - 1)) {
                    sb.append(",\n");
                } else {
                    sb.append("\n");
                }
            }
            sb.append(indent + "]");
            return sb.toString();
        }
    }

    public static String jsonize(float[] values, String indent) {
        if (values == null) {
            return "null";
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append("\n" + indent + "[\n");
            for (int i = 0; i < values.length; i++) {
                sb.append(indent + "    " + jsonize(values[i], indent));
                if (i < (values.length - 1)) {
                    sb.append(",\n");
                } else {
                    sb.append("\n");
                }
            }
            sb.append(indent + "]");
            return sb.toString();
        }
    }

    public static String jsonize(double[] values, String indent) {
        if (values == null) {
            return "null";
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append("\n" + indent + "[\n");
            for (int i = 0; i < values.length; i++) {
                sb.append(indent + "    " + jsonize(values[i], indent));
                if (i < (values.length - 1)) {
                    sb.append(",\n");
                } else {
                    sb.append("\n");
                }
            }
            sb.append(indent + "]");
            return sb.toString();
        }
    }

    private static String jsonizeDispatchArrayElement(Object o, String indent) {
        Class<?> c = o.getClass();
        if (c.isPrimitive()) {
            if (c == java.lang.Boolean.TYPE) {
                return indent + jsonize((boolean) (Boolean) o, indent);
            } else if (c == java.lang.Integer.TYPE) {
                return indent + jsonize((int) (Integer) o, indent);
            } else if (c == java.lang.Float.TYPE) {
                return indent + jsonize((float) (Float) o, indent);
            } else if (c == java.lang.Double.TYPE) {
                return indent + jsonize((double) (Double) o, indent);
            }
        } else if (c.getCanonicalName().equals("java.lang.String")) {
            return indent + jsonize((String) o, indent);
        } else if (!c.isArray()) {
            // Must be a "jsonizeable" object
            return jsonize(o, indent);
        } else if (c.getComponentType().isPrimitive()) {
            Class<?> ct = c.getComponentType();
            if (ct == java.lang.Boolean.TYPE) {
                return jsonize((boolean[]) o, indent);
            } else if (ct == java.lang.Integer.TYPE) {
                return jsonize((int[]) o, indent);
            } else if (ct == java.lang.Float.TYPE) {
                return jsonize((float[]) o, indent);
            } else if (ct == java.lang.Double.TYPE) {
                return jsonize((double[]) o, indent);
            }
        } else {
            // Finally, it's yet another array layer for us to recurse into
            return jsonize((Object[]) o, indent);
        }
        // We should never come here
        return "";
    }
}
