package com.marinagaisina;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWrite {

    public static void main(String[] args) {

        try {
            String location = "file.csv";
            File file = new File(location);
            FileWriter writer = new FileWriter(file, true); //True meant that you append your new text to the end of the file.  False means that you overwrite the file entirely.

            writer.write("cs1234, Java, someone\n");
            writer.close();
            Scanner input = new Scanner(file);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }


    }
}