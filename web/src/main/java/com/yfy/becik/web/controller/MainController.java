package com.yfy.becik.web.controller;

import com.yfy.becik.web.util.ViewMappings;
import com.yfy.becik.web.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(ViewMappings.HOME)
    public String home() {
        return ViewNames.HOME;
    }
}
