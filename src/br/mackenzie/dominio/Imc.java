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
public class Imc {

    private double imc;
    private String descricao;

    public Imc(double imc, String descricao) {
        this.imc = imc;
        this.descricao = descricao;
    }

    public Imc() {
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void calcularImc(double peso, double altura) {
        this.imc = peso / (Math.pow(altura, 2));
    }

    public void validarImc() {
        if (imc > 18.5) {
            this.descricao = "Abaixo do Peso";
        } else if (imc > 25.0) {
            this.descricao = "Peso Normal";
        } else if (imc > 30.0) {
            this.descricao = "Acima do Peso";
        } else {
            this.descricao = "Obeso";
        }
    }

}
