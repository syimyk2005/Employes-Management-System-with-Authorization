package com.example.Employes;
import com.example.Employes.objectModels.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static ResponseEntity<String> addDataToFile(Emloyes employes) {
        try {
            if (employes.getId() != null && employes.getOtherData() != null &&
                    employes.getPerformanceEvaluationAndFeedback() != null && employes.getWorkBook() != null &&
                    employes.getPersonalData() != null &&
                    employes.getOtherData().getInformationAboutMaritalStatus() != null && employes.getOtherData().getContractNumber() != null &&
                    employes.getPerformanceEvaluationAndFeedback().getReport() != null && employes.getPerformanceEvaluationAndFeedback().getAwards() != null &&
                    employes.getWorkBook().getPrivatedata() != null && employes.getWorkBook().getWorkExperiance() != null && employes.getWorkBook().getVacationsAndSickleave() != null &&
                    employes.getPersonalData().getName() != null && employes.getPersonalData().getAdress() != null && employes.getPersonalData().getPhonNumber() != null) {

                FileWriter fileWriter = new FileWriter("file.txt", true);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(employes.getId() + ",");
                writer.write(employes.getOtherData().toString() + ",");
                writer.write(employes.getPerformanceEvaluationAndFeedback().toString() + ",");
                writer.write(employes.getWorkBook().toString() + ",");
                writer.write(employes.getPersonalData().toString() + "\n");


                writer.close();
                return ResponseEntity.ok("Данные успешно добавлены в файл");
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ошибка: одно из значений равно null");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ошибка при добавлении данных в файл");
        }
    }


    public static void main(String[] args){
        OtherData otherData = new OtherData("Marriad", "001");
        PerformanceEvaluatuionAndFeedback performanceEvaluatuionAndFeedback = new PerformanceEvaluatuionAndFeedback("10.03.2024", "1000");
        PersonalData data = new PersonalData("syimyk", "suvorova", "444");
        WorkBook workBook = new WorkBook("1", "12", "j");
        Emloyes employes = new Emloyes("01", otherData, performanceEvaluatuionAndFeedback, workBook, data);
        addDataToFile(employes);
    }
}
