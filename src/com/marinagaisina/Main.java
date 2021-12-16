package com.marinagaisina;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    /* one way exception:

    public static void main(String[] args) throws FileNotFoundException {
	    String location = "wholenewfile.txt";
        File file = new File(location);
        Scanner input = new Scanner(file);
    }
    */
    public static void main(String[] args) throws IOException {

        try {
            String location = "file.csv";
            File file = new File(location);
            FileWriter fileWriter = new FileWriter(file, true);
            //fileWriter.write("CourseNumber, CourseName, Instructor\n");
            fileWriter.write("cs1234, Java, someone\n");
            fileWriter.close();

            Scanner input = new Scanner(file);
            //String line = input.nextLine(); ----for reading one line
            //String text = "";
            ArrayList<Course> data = new ArrayList<>();
            while(input.hasNext()) {
                // text+= input.nextLine()+"\n";
                // data.add(input.nextLine());
                String[] line = input.nextLine().split(",");

                Course course = new Course(line[0], line[1], line[2]);
                data.add(course);
            }
            System.out.println(data);
            for (Course course: data) {
                System.out.format("%-15s |%-35s |%-25s \n",course.getCode(), course.getName(), course.getInstructor());
            }
            System.out.println(data);

        } catch (FileNotFoundException e) {
            System.out.println("error: File not found in location main");
            e.printStackTrace();
        }
    }
}
/*
ArrayList<Course> data = new ArrayList<>();
            while (input.hasNext()); {
                String[] line = input.nextLine().split(",");

                System.out.println(line);
            }

            for(Course course: data) {
                System.out.format("%-15s |%-35s |%-15s \n", course.getCode(), course.getName(), course.getInstructor());
            }
And I have this above it:
String location = "file.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);

 */
