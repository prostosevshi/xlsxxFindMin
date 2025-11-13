package com.example.demo.controller;

import com.example.demo.service.XlsxxService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class XlsxxController {

    private final XlsxxService xlsxxService;


    public XlsxxController(XlsxxService xlsxxService) {
        this.xlsxxService = xlsxxService;
    }

    @GetMapping("/nth-min")
    public int getNthSmallest(
            @RequestParam String path,
            @RequestParam int n
    ) throws Exception {
        return xlsxxService.findNthSmallest(path, n);
    }
}
