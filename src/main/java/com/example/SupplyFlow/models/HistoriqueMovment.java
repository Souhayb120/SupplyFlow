package com.example.SupplyFlow.models;


import jakarta.persistence.*;

@Entity
@Table(name = "movement")
public class HistoriqueMovment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private int produitId;
    private String type;
    private int quantite;

    public HistoriqueMovment() {
    }

    public HistoriqueMovment(int id, int produitId, String type, int quantite) {
        this.id = id;
        this.produitId = produitId;
        this.type = type;
        this.quantite = quantite;
    }

    public HistoriqueMovment(int produitId, String type, int quantite) {
        this.produitId = produitId;
        this.type = type;
        this.quantite = quantite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
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
