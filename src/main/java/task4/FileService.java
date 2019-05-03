package task4;

import console.ConsoleHelper;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService {

    private String path;

    public FileService(String path) {
        this.path = path;
    }

    public String getContentFromFile() {
        StringBuilder stringBuilder = new StringBuilder();

        int content;

        try (InputStream inputStream = Files.newInputStream(Paths.get(this.path))) {
            do {
                content = inputStream.read();
                if (content != -1) {
                    stringBuilder.append((char) content);
                }
            } while (content != -1);
        } catch (IOException e) {
            ConsoleHelper.print("Exception: " + e);
        }
        return stringBuilder.toString();
    }

    public int countOfStringInFile(String content, String stringForCount) {
        return content.split(stringForCount, -1).length - 1;
    }

    public boolean replaceString(String content, String stringForSearch, String stringForReplace) {

        String replace = content.replaceAll(stringForSearch, stringForReplace);
        System.out.println(replace);

        byte[] bytes = replace.getBytes();

        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get(this.path)))) {
            for (byte eachByte : bytes) {
                outputStream.write(eachByte);
            }
            return true;
        } catch (IOException e) {
            ConsoleHelper.print("Exception: " + e);
            return false;
        }
    }
}
