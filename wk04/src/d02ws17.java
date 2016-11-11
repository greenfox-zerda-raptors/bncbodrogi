import java.io.*;
import java.util.Scanner;

public class d02ws17 {
    static String filePath, parentDirectory;

    static File randomDir, randomFile, filename;

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String strDirectoryPath = "D:\\Greenfox\\ExampleDir";
        String strFilename = "random";
        String strFilename2 = "randomCopy";
        String strExtension = ".txt";

        randomDir = new File(strDirectoryPath);
        randomDir.mkdirs();

        randomFile = new File(strDirectoryPath + "\\" + strFilename + strExtension);


        try {
            randomFile.createNewFile();

        } catch (IOException e) {
            System.out.println("No file path specified");
        }

        filename = new File(getUserInput());

        if (filename.exists() == true) {
            System.out.println("Enter target file name:");
        } else {
            String[] filesInDir = randomDir.list();
            System.out.println("Files in Random Directory\n");
            for(String fileName : filesInDir) {
                System.out.println(fileName + "\n");
            }

        }

    }

    public static String getUserInput() {
        System.out.println("Enter source file name:");
        String filename = userInput.next();
        return filename;
    }
}

