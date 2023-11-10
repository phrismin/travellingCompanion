package com.rudoy.travellingcompanion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainPage")
public class DriverController {

    @GetMapping
    public String mainPage() {
        return "mainPage";
    }
}
