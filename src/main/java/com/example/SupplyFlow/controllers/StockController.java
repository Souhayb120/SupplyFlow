package com.example.SupplyFlow.controllers;

import com.example.SupplyFlow.models.Stock;
import com.example.SupplyFlow.services.StockService;
import com.example.SupplyFlow.services.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/stocks")
public class StockController {

    private final StockService stockService;
    private final ProduitService produitService;

    public StockController(StockService stockService, ProduitService produitService) {
        this.stockService = stockService;
        this.produitService = produitService;
    }

    @GetMapping
    public String listStock(Model model) {

        model.addAttribute("stock", new Stock());
        model.addAttribute("stocks", stockService.displayStock());
        model.addAttribute("produits", produitService.displayProduits());
        return "stocks";
    }

    @PostMapping("/save")
    public String saveStock(@ModelAttribute Stock stock) {
        stockService.addStock(stock);
        return "redirect:/stocks";
    }
}