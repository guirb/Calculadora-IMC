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
    private Pessoa pessoa;
    private String mensagem;

    public Imc(double imc, String descricao, Pessoa pessoa, String mensagem) {
        this.imc = imc;
        this.descricao = descricao;
        this.pessoa = pessoa;
        this.mensagem = mensagem;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void calcularImc() {
        this.imc = pessoa.getPeso() / (Math.pow(pessoa.getAltura(), 2));
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
