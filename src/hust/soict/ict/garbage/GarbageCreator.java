package hust.soict.ict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\hpham\\Code\\OtherProjects\\src\\hust\\soict\\ict\\garbage\\The_Day_the_Moon_Logged_On.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outPutString = "";
        for(byte b : inputBytes) {
            outPutString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        System.out.println(outPutString);
    }

}
