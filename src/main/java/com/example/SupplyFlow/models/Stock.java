package com.example.SupplyFlow.models;


import jakarta.persistence.*;

@Entity
@Table(name = "movement")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String type;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
    public Stock() {
    }

    public Stock(int id, String type, int quantite, Produit produit) {
        this.id = id;
        this.type = type;
        this.quantite = quantite;
        this.produit = produit;
    }

    public Stock( String type, int quantite, Produit produit) {
        this.id = id;
        this.type = type;
        this.quantite = quantite;
        this.produit = produit;
    }



    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
