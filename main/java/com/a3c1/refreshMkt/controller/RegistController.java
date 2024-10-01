package com.a3c1.refreshMkt.controller;

import com.a3c1.refreshMkt.entity.Product;
import com.a3c1.refreshMkt.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class RegistControllerTest {

    @Autowired
    private RegistService registService;

    @GetMapping("/regist") //localhost:8080/regist
    public String RegistForm() {
        return "register";
    }

}
