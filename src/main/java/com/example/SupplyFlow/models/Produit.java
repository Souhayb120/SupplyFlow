package com.example.SupplyFlow.models;


import jakarta.persistence.*;

@Entity
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String nom;
    private double prix;
    private String category;

    @ManyToOne
    @JoinColumn(name = "fornisseur_id")
    private Fornisseur fornisseur;

    public Produit() {
    }

    public Produit(int id, String nom, double prix, String category) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.category = category;
    }

    public Produit(String nom, double prix, String category) {
        this.nom = nom;
        this.prix = prix;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
