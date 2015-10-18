/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.Testes.classe.valida;

import br.mackenzie.dominio.Pessoa;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Guilherme
 */
public class MensagemTest {

    @Test
    public void testaConstrutorPadraoPessoa() {
        Pessoa p = new Pessoa();
        p.setPeso(63.0);
        p.setAltura(1.70);
        p.setSexo("HOMEM");

        Assert.assertEquals(p.getPeso(), 63.0, 0.001);
        Assert.assertEquals(p.getAltura(), 1.70, 0.001);
        Assert.assertEquals("HOMEM", p.getSexo());

        p.setSexo("MULHER");
        Assert.assertEquals("MULHER", p.getSexo());
    }

    @Test
    public void testeCalcularImcAbaixoPeso() {
        Pessoa p = new Pessoa();
        p.setPeso(43.0);
        p.setAltura(1.70);
        p.setSexo("HOMEM");
        p.calcularImc();

        Assert.assertEquals(p.getImc(), 14.8, 0.1);
        Assert.assertEquals("Abaixo do Peso", p.getDescricao());
        Assert.assertEquals("Você está abaixo do peso recomendado.",
                p.getMensagem());
    }

    @Test
    public void testeCalcularImcPesoNormal() {
        Pessoa p = new Pessoa();
        p.setPeso(63.0);
        p.setAltura(1.698);
        p.setSexo("HOMEM");
        p.calcularImc();

        Assert.assertEquals(p.getImc(), 21.850691106144417, 0.01);
        Assert.assertEquals("Peso Normal", p.getDescricao());
        Assert.assertEquals("Você está muito bem! Continue assim!", p.getMensagem());
    }

    @Test
    public void testeCalcularImcAcimaPeso() {
        Pessoa p = new Pessoa();
        p.setPeso(63.0);
        p.setAltura(1.50);
        p.setSexo("HOMEM");
        p.calcularImc();

        Assert.assertEquals(p.getImc(), 28.0, 0.1);
        Assert.assertEquals("Acima do Peso", p.getDescricao());
        Assert.assertEquals("Você está acima do peso recomendado. Cuidado!", p.getMensagem());
    }

    @Test
    public void testeCalcularImcObeso() {
        Pessoa p = new Pessoa();
        p.setPeso(70.0);
        p.setAltura(1.30);
        p.setSexo("HOMEM");
        p.calcularImc();

        Assert.assertEquals(p.getImc(), 41.4, 0.1);
        Assert.assertEquals("Obeso", p.getDescricao());
        Assert.assertEquals("Você está Obeso. Procure o acompanhamento de um "
                + "nutricionista e realizar mais atividades físicas!",
                p.getMensagem());
    }

}
