package task4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileServiceTest {

    private FileService fileService;
    private String path;

    @Before
    public void setUp() throws Exception {
        path = "C:\\java\\Project\\tasks1\\src\\main\\resources\\test.txt";
        fileService = new FileService(path);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getContentFromFileTest() {
        //GIVEN
        String expectedContent = "abcd";
        String actualContent;
        //WHEN
        actualContent = fileService.getContentFromFile();
        //THEN
        assertEquals(actualContent, expectedContent);
    }

    @Test
    public void countOfStringInFileTest() {
        //GIVEN
        String content = "abcd";
        int expectedCount = 1;
        int actualCount;
        //WHEN
        actualCount = fileService.countOfStringInFile(content, "a");
        //THEN
        assertEquals(actualCount, expectedCount);
    }

    @Test
    public void replaceStringTest() {
        //GIVEN
        String content = "abcd";
        boolean actualResult;
        //WHEN
        actualResult = fileService.replaceString(content, "a", "f");
        //THEN
        assertTrue(actualResult);
    }
}