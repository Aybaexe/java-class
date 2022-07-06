/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package used;

import src.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Ayba
 */
public class App {

    public static void main(String[] args) {
        Student st1 = new Student("0001");
        st1.setFirstName("John");
        st1.setLastName("Doe");
        st1.setCohort("Java - August 2014");
        Student st2 = new Student("0002");
        st2.setFirstName("Sally");
        st2.setLastName("Smith");
        st2.setCohort("Java - August 2014");
        Student st3 = new Student("0003");
        st3.setFirstName("John");
        st3.setLastName("Jones");
        st3.setCohort(".NET - Jan 2014");
        Student st4 = new Student("0004");

        createFile("student.txt");
        readFile("student.txt");
        writeFile("student.txt", st1);
        writeFile("student.txt", st2);
        writeFile("student.txt", st3);
        writeFile("student.txt", st4);
        readFile("student.txt");
        st4.setFirstName("Test");
        st4.setLastName("Scot");
        st4.setCohort(".NET - Jan 2022");
        writeFile("student.txt", st4);
        readFile("student.txt");
    }

    public static void writeFile(String name, Student st) {
        try {
            FileWriter myWriter = new FileWriter(name, true);
            myWriter.write(st.getStudentID()+"::"+st.getFirstName()+"::"+st.getLastName()+"::"+st.getCohort()+"\n");
            myWriter.flush();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void createFile(String name) {
        try {
            File myObj = new File(name);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile(String name) {
        try {
            File myObj = new File(name);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
