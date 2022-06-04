package com.example.ex2jsondb;

public class Stagiaire {
    private String nom;
    private int age;
    private String filiere;

    public Stagiaire(String nom, int age, String filiere) {
        this.nom = nom;
        this.age = age;
        this.filiere = filiere;
    }

    public Stagiaire() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}
