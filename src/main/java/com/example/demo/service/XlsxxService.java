package com.example.demo.service;

import com.example.demo.util.QuickSelect;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class XlsxxService {

    public int findNthSmallest(String filepath, int n) throws Exception {
        List<Integer> numbers = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(new File(filepath));
             Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                Cell cell = row.getCell(0);
                if(cell != null && cell.getCellType() == CellType.NUMERIC) {
                    numbers.add((int) cell.getNumericCellValue());
                }
            }
        }

        if(n<=0 || n>numbers.size()){
            throw new IllegalArgumentException("Incorrect value");
        }

        int[] arr = numbers.stream().mapToInt(i -> i).toArray();
        return QuickSelect.findNthSmallest(arr, n);
    }
}
