package com.example.xmlprocessor

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {
    @GetMapping("/")
    fun xmlProcessor(model: Model): String {
        model["title"] = "XmlProcessor"
        return "xmlProcessor"
    }
}