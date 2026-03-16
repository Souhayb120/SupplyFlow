package com.example.SupplyFlow.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String show(){
     return "index";
 }

    @RequestMapping("/produits")
    public String displayProduits(){
        return "produit";
    }

    @RequestMapping("/stock")
    public String displayStock(){
        return "stocks";
    }

    @RequestMapping("/fournisseurs")
    public String displayFornisseurs(){
        return "fournisseur";
    }


}