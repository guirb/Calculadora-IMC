/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.dominio;

import br.mackenzie.exception.AlturaInvalidaException;
import br.mackenzie.exception.PesoInvalidoException;
import br.mackenzie.exception.SexoInvalidoException;

/**
 *
 * @author 31400329
 */
public class Pessoa {

    private double peso;
    private double altura;
    private String sexo;
    private String descricao;
    private String mensagem;
    private double imc;

    public Pessoa() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 25.0 || peso > 700.0) {
            throw new PesoInvalidoException("Peso " + peso + "Kg está fora do limites.");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0.44 || altura > 2.7) {
            throw new AlturaInvalidaException("Altura " + altura + "m está fora do limites.");
        }
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.toUpperCase().equals("HOMEM") || sexo.toUpperCase().equals("MULHER")) {
            this.sexo = sexo;
        } else {
            throw new SexoInvalidoException("Sexo selecionado é inválido. Escolha entre Homem ou Mulher.");
        }
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void calcularImc() {
        this.imc = this.peso / (Math.pow(this.altura, 2));
        validarImc();
    }

    public void validarImc() {
        if (imc < 18.5) {
            this.descricao = "Abaixo do Peso";
            this.mensagem = "Você está abaixo do peso recomendado.";
        } else if (imc < 25.0) {
            this.descricao = "Peso Normal";
            this.mensagem = "Você está muito bem! Continue assim!";
        } else if (imc < 30.0) {
            this.descricao = "Acima do Peso";
            this.mensagem = "Você está acima do peso recomendado. Cuidado!";
        } else {
            this.descricao = "Obeso";
            this.mensagem = "Você está Obeso. Procure o acompanhamento de um "
                    + "nutricionista e realizar mais atividades físicas!";
        }
    }

}
