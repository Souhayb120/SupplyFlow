package com.example.SupplyFlow.controllers;



import com.example.SupplyFlow.models.Produit;
import com.example.SupplyFlow.services.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;



@Controller
public class ProduitController {

    private final ProduitService produitService ;
    List<Produit> produitList = new ArrayList<>();
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/produit/{id}")
    @ResponseBody
    public String getProduit(@PathVariable int id) {
      Produit produit =  produitService.findProduitById(id);
        return "User ID : " + id;
    }


    @GetMapping("/produit")
    public String listProduits(Model model) {
        model.addAttribute("produits", produitService.displayProduits());
        return "produit";
    }


}