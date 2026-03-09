package com.example.SupplyFlow.models;

import jakarta.persistence.*;

@Entity
@Table(name = "fornisseur")
public class Fornisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String ville;
    private String phone;

    public Fornisseur() {
    }

    public Fornisseur(int id, String nom, String ville, String phone) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.phone = phone;
    }

    public Fornisseur(String nom, String ville, String phone) {
        this.nom = nom;
        this.ville = ville;
        this.phone = phone;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
