package com.example.SupplyFlow.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {

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
        return "stock";
    }

    @RequestMapping("/fournisseurs")
    public String displayFornisseurs(){
        return "fournisseur";
    }


}