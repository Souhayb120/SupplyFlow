package com.example.SupplyFlow.services;

import com.example.SupplyFlow.models.Stock;
import com.example.SupplyFlow.repositories.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }



    public void addStock(Stock stock){
        List<Stock> stockList = stockRepository.findAll();
        List<Stock> matchProductName = stockList.stream().filter(s -> s.getProduit().getNom().equals(stock.getProduit().getNom())).toList();
        if(!matchProductName.isEmpty()){
            Stock existingStock = matchProductName.get(0);
            if(stock.getType().equals("ENTREE")){
                existingStock.setQuantite(existingStock.getQuantite() + stock.getQuantite());
            }else if(stock.getType().equals("SORTIE")){
                existingStock.setQuantite(existingStock.getQuantite() - stock.getQuantite());
            }
            stockRepository.save(existingStock);
        }else{
            stockRepository.save(stock);
        }
    }

    public List<Stock> displayStock(){
        return stockRepository.findAll();
    }
}
