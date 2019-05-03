package task4;

import console.ConsoleHelper;

public class App {
    public static void main(String[] args) {

        switch (args.length) {
            case 2: {
                FileService fileService = new FileService(args[0]);
                String content = fileService.getContentFromFile();
                int count = fileService.countOfStringInFile(content, args[1]);
                ConsoleHelper.print("Count of " + args[1] + " is: " + count);
                break;
            }
            case 3: {
                FileService fileService = new FileService(args[0]);
                String content = fileService.getContentFromFile();
                fileService.replaceString(content, args[1], args[2]);
                break;
            }
            default: {
                ConsoleHelper.print("Instructions: run class with two or three arguments!");
            }
        }
    }
}
