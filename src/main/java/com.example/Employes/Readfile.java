package com.example.Employes;

import com.example.Employes.objectModels.Emloyes;
import com.example.Employes.objectModels.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Readfile {
    public static void main(String[]args) {
        List<Emloyes> employees = read();
        for (Emloyes employee : employees) {
            System.out.println(employee);
        }
    }

    public static List<Emloyes> read() {
        String fileName = "file.txt";
        File file = new File(fileName);
        List<Emloyes> employees = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] elements = line.split(",");
                if (line == null) {
                    return null;
                }
                String id = elements[0];
                OtherData otherData = new OtherData(elements[0], elements[2]);
                PerformanceEvaluatuionAndFeedback performanceEvaluationAndFeedback = new PerformanceEvaluatuionAndFeedback(elements[3], elements[4]);
                WorkBook workBook = new WorkBook(elements[5], elements[6], elements[7]);
                PersonalData personalData = new PersonalData(elements[8], elements[9], elements[10]);
                Emloyes employee = new Emloyes(id, otherData, performanceEvaluationAndFeedback, workBook, personalData);

                employees.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}