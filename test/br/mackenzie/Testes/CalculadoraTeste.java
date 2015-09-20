package br.mackenzie.Testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.mackenzie.dominio.Imc;
import br.mackenzie.dominio.Pessoa;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme
 */
public class CalculadoraTeste {

    @Test
    public void testaConstrutorPadraoPessoa() {
        Pessoa p = new Pessoa();
        Imc i = new Imc();
        p.setPeso(63.0);
        p.setAltura(1.70);
        p.setNome("Guilherme");
        p.setIdade(20);
        p.setSexo("Masculino");
        p.setImc(i);

        Assert.assertEquals(p.getPeso(), 63.0, 0.001);
        Assert.assertEquals(p.getAltura(), 1.70, 0.001);
        Assert.assertEquals("Guilherme", p.getNome());
        Assert.assertEquals(p.getIdade(), 20, 0.001);
        Assert.assertEquals("Masculino", p.getSexo());
        Assert.assertEquals(p.getImc(), i);
    }

    @Test
    public void testaConstrutorPadraoImc() {
        Imc imc = new Imc();
        Pessoa p = new Pessoa();
        imc.setDescricao("Teste");
        imc.setImc(0.0);
        imc.setPessoa(p);

        Assert.assertEquals("Teste", imc.getDescricao());
        Assert.assertEquals(imc.getImc(), 0.0, 0.001);
        Assert.assertEquals(imc.getPessoa(), p);
    }

    @Test
    public void testeCalcularImcAbaixoPeso() {
        Pessoa p = new Pessoa();
        Imc i = new Imc();
        p.setPeso(43.0);
        p.setAltura(1.70);
        p.setNome("Guilherme");
        p.setIdade(20);
        p.setSexo("Masculino");
        p.setImc(i);
        i.setPessoa(p);
        i.calcularImc();

        Assert.assertEquals(i.getImc(), 14.8, 0.1);
        Assert.assertEquals("Abaixo do Peso", p.getImc().getDescricao());
        Assert.assertEquals("Você está abaixo do peso recomendado.",
                p.getImc().getMensagem());
    }

    @Test
    public void testeCalcularImcPesoNormal() {
        Pessoa p = new Pessoa();
        Imc i = new Imc();
        p.setPeso(63.0);
        p.setAltura(1.70);
        p.setNome("Guilherme");
        p.setIdade(20);
        p.setSexo("Masculino");
        p.setImc(i);
        i.setPessoa(p);
        i.calcularImc();

        Assert.assertEquals(i.getImc(), 21.8, 0.01);
        Assert.assertEquals("Peso Normal", i.getDescricao());
        Assert.assertEquals("Você está muito bem! Continue assim!", i.getMensagem());
    }

    @Test
    public void testeCalcularImcAcimaPeso() {
        Pessoa p = new Pessoa();
        Imc i = new Imc();
        p.setPeso(63.0);
        p.setAltura(1.50);
        p.setNome("Guilherme");
        p.setIdade(20);
        p.setSexo("Masculino");
        p.setImc(i);
        i.setPessoa(p);
        i.calcularImc();

        Assert.assertEquals(i.getImc(), 28.0, 0.1);
        Assert.assertEquals("Acima do Peso", i.getDescricao());
        Assert.assertEquals("Você está acima do peso recomendado. Cuidado!", p.getImc().getMensagem());
    }

    @Test
    public void testeCalcularImcObeso() {
        Pessoa p = new Pessoa();
        Imc i = new Imc();
        p.setPeso(70.0);
        p.setAltura(1.30);
        p.setNome("Guilherme");
        p.setIdade(20);
        p.setSexo("Masculino");
        p.setImc(i);
        i.setPessoa(p);
        i.calcularImc();

        Assert.assertEquals(i.getImc(), 41.4, 0.1);
        Assert.assertEquals("Obeso", i.getDescricao());
        Assert.assertEquals("Você está Obeso. Procure o acompanhamento de um "
                + "nutricionista e realizar mais atividades físicas!",
                i.getMensagem());
    }
}
