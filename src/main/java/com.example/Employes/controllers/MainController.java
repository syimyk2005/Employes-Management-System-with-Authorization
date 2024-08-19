package com.example.Employes.controllers;

import com.example.Employes.Readfile;
import com.example.Employes.WriteFile;
import com.example.Employes.objectModels.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @GetMapping("/ReadDataFromFileGet")
    public ResponseEntity<List<Emloyes>> readFile() {
        List<Emloyes> employees = Readfile.read();
        return ResponseEntity.ok(employees);
    }
    @PostMapping("/addDataToFilePost")
    public static ResponseEntity<String> addDataToFile(@RequestBody List<Emloyes> emloyes) {
        return WriteFile.addDataToFile((Emloyes) emloyes);
    }
}
