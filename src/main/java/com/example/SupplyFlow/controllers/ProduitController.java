package com.example.SupplyFlow.controllers;

import com.example.SupplyFlow.models.Produit;
import com.example.SupplyFlow.services.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produits")
public class ProduitController {

    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public String listProduits(Model model) {

        model.addAttribute("produits", produitService.displayProduits());
        model.addAttribute("produit", new Produit());

        return "produit";
    }

    @PostMapping("/save")
    public String saveProduit(@ModelAttribute Produit produit){

        produitService.addProduit(produit);

        return "redirect:/produits";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Produit getProduit(@PathVariable int id){

        return produitService.findProduitById(id);

    }

}