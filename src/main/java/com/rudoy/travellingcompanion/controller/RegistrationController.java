package com.rudoy.travellingcompanion.controller;

import com.rudoy.travellingcompanion.model.Driver;
import com.rudoy.travellingcompanion.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/registration")
@RequiredArgsConstructor
public class RegistrationController {
    private final UserService userService;

    @PostMapping(value = "/driver")
    public String create(Driver driver) {
        boolean b = userService.createDriver(driver);
        return "/mainPage";
    }

    @GetMapping("/driver")
    public String formRegistration(Model model) {
        model.addAttribute("driver", new Driver());
        return "/registrationDriver";
    }
}
