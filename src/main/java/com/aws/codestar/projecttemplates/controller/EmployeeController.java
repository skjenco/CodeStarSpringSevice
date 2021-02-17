package com.aws.codestar.projecttemplates.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@CrossOrigin
public class EmployeeController {

    @Value("${com.skjenco.value}")
    private String value;

    @RequestMapping("/employees")
    public ResponseEntity<String> getEmployees() {
        return ResponseEntity.ok().cacheControl(CacheControl.maxAge(30, TimeUnit.SECONDS).cachePrivate()).body(value);
    }

}
