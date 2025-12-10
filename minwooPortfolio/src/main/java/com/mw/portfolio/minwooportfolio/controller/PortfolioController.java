package com.mw.portfolio.minwooportfolio.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PortfolioController {


    @GetMapping({"/index"})
    public String index(Model model) {
        return "main";
    }


    @GetMapping
    public String portfolio(Model model) {
        return "main";
    }
}


