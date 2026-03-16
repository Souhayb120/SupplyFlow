package com.example.SupplyFlow.controllers;

import com.example.SupplyFlow.models.Fornisseur;
import com.example.SupplyFlow.services.FornisseurService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/fornisseurs")
public class FornisseurController {

    private final FornisseurService fornisseurService;

    public FornisseurController(FornisseurService fornisseurService) {
        this.fornisseurService = fornisseurService;
    }


    @GetMapping
    public String listFornisseurs(Model model) {
        model.addAttribute("fornisseur", new Fornisseur()); // for the form
        model.addAttribute("fornisseurs", fornisseurService.displayFornisseurs()); // for table
        return "fornisseurs";
    }


    @PostMapping("/save")
    public String saveFornisseur(@ModelAttribute Fornisseur fornisseur) {
        fornisseurService.addFornisseur(fornisseur);
        return "redirect:/fornisseurs";
    }

}