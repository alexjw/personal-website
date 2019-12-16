package org.alexjw.personalwebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {

    @GetMapping({"","/","/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/linkedin")
    public RedirectView linkedIn() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://www.linkedin.com/in/abel-alexander-ji%C3%B1es-b8bb23182/");
        return redirectView;
    }

    @GetMapping("/github")
    public RedirectView gitHub() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://github.com/alexjw");
        return redirectView;
    }

    @GetMapping("/codepen")
    public RedirectView codePen() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://codepen.io/alex-jines");
        return redirectView;
    }

    @GetMapping("/glitch")
    public RedirectView glitch() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://glitch.com/@abel.oalex");
        return redirectView;
    }

    @GetMapping("/salesforce")
    public RedirectView salesForce() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://trailblazer.me/id/alexjw ");
        return redirectView;
    }

}
