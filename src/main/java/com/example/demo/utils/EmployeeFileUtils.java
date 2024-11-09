package com.example.demo.utils;

import com.example.demo.Employee;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class EmployeeFileUtils {
    private static final ObjectMapper mapper = new ObjectMapper();
    public static List<Employee> readEmployeesFromFile(File file) {
        try {
            if (file.exists()) {
                return mapper.readValue(file, new
                        TypeReference<List<Employee>>() {});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    public static void writeEmployeesToFile(File file, List<Employee>
            employees) {
        try {
            mapper.writeValue(file, employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

