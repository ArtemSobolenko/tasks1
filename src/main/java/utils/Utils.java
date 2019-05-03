package utils;

import exception.AppException;

public class Utils {

    public static int getIntegerFromParam(String param) throws AppException {
        int intParam;
        try {
            intParam = Integer.parseInt(param);
            if (intParam <= 0) {
                throw new AppException("The parameter must be greater than zero!");
            }
        } catch (NumberFormatException e) {
            throw new AppException("The parameter must be an integer!");
        }
        return intParam;
    }

    public static double getDoubleFromParam(String param) throws AppException {
        double doubleParam;
        try {
            doubleParam = Double.parseDouble(param);
            if (doubleParam <= 0) {
                throw new AppException("The parameter must be greater than zero!");
            }
        } catch (NumberFormatException e) {
            throw new AppException("The parameter must be an integer or double!");
        }
        return doubleParam;
    }
}
