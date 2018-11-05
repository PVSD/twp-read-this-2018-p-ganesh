package com.company;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String fileName = "Imports.txt";
        String line = null;

        File students = new File("C:\\Users\\prgan\\IdeaProjects\\twp-read-this-2018-p-ganesh\\src\\Imports.txt");

        try {
            FileReader fileReader = new FileReader(students);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
    }

}
