package com.pn.springbaseproject.m40Benefit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@Slf4j
@RestController()
@RequestMapping("/m40Benefit")
public class M40BenefitController {
    @GetMapping("/")
    public Map<String, Object> greeting() {
        return Collections.singletonMap("message", "Hello, World");
    }

    @PostMapping("/sickValidate")
    public Map<String, Object> sickValidate() {
        return Collections.singletonMap("message", "Validate, Successfully");
    }

    @PostMapping("/sickSave")
    public Map<String, Object> sickSave() {
        return Collections.singletonMap("message", "Save, Successfully");
    }
}

