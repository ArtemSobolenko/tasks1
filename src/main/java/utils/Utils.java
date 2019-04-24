package utils;

import exception.AppException;

public class Utils {

    public int getIntegerFromParam(String param) throws AppException {
        int intParam;
        try {
            intParam = Integer.parseInt(param);
            if (intParam <= 0) {
                throw new AppException("The parameter must be greater than zero.!");
            }
        } catch (NumberFormatException e) {
            throw new AppException("The parameter must be an integer.!");
        }
        return intParam;
    }

    public double getDoubleFromParam(String param) throws AppException {
        double doubleParam;
        try {
            doubleParam = Double.parseDouble(param);
            if (doubleParam <= 1) {
                throw new AppException("The parameter must be greater than one.!");
            }
        } catch (NumberFormatException e) {
            throw new AppException("The parameter must be an integer or double.!");
        }
        return doubleParam;
    }
}
