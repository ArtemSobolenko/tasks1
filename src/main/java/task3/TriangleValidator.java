package task3;

import exception.AppException;

public class TriangleValidator {

    public String[] validationParams(String params) throws AppException {
        int requiredNumberOfArguments = 4;
        String[] args = params.split(",");
        for (int i = 1; i < args.length; i++) {
            args[i] = args[i].replaceAll("\\s+", "");
        }

        if (args.length != requiredNumberOfArguments) {
            throw new AppException("The number of arguments must be 4!");
        }
        return args;
    }
}
