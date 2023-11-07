package com.rudoy.travellingcompanion.controller;

import com.rudoy.travellingcompanion.model.Driver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

    @PostMapping(value = "/driver", consumes = {"application/x-www-form-urlencoded"})
    public String create(@RequestBody Driver driver) {
        return "/mainPage";
    }

    @GetMapping("/driver")
    public String formRegistration(Model model) {
        model.addAttribute("driver", new Driver());
        return "/registrationDriver";
    }

}
