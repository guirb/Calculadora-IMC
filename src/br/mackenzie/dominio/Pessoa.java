/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.dominio;

/**
 *
 * @author 31400329
 */
public class Pessoa {
    private double peso;
    private double altura;
    private String nome;
    private int idade;
    private String sexo;
    private Imc imc;

    public Pessoa() {
    }

    public Pessoa(double peso, double altura, String nome, int idade, String sexo, Imc imc) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.imc = imc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Imc getImc() {
        return imc;
    }

    public void setImc(Imc imc) {
        this.imc = imc;
    }
}
