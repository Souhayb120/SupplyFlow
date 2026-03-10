package com.example.SupplyFlow.controllers;

import com.example.SupplyFlow.models.Fornisseur;
import com.example.SupplyFlow.services.FornisseurService;
import com.example.SupplyFlow.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/produits") // all URLs start with /produits
public class FornisseurController {

    @Autowired
    private FornisseurService fornisseurService;

    @PostMapping("/add")
    @ResponseBody // return plain text for testing without HTML
    public String addFornisseur(@RequestParam String nom, @RequestParam String ville, @RequestParam String phone) {
        Fornisseur f = new Fornisseur();
     f.setNom(nom);
     f.setVille(ville);
     f.setPhone(phone);
        fornisseurService.addFornisseur(f);
        return "Fournisseur added successfully!";
    }}