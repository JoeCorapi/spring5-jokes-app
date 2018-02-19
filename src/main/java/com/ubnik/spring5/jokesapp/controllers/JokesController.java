package com.ubnik.spring5.jokesapp.controllers;

import com.ubnik.spring5.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    //add model to controller
    @RequestMapping({"/",""})
    public String showJoke(Model model){

        //add attribute "joke" to the model
        model.addAttribute("joke", jokesService.getJoke());

        //return view name
        return "chucknorris";
    }
}
