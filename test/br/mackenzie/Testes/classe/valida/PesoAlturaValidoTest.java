/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.Testes.classe.valida;

import br.mackenzie.dominio.Pessoa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Guilherme
 */
public class PesoAlturaValidoTest {

    @Test
    public void testaLimiteInferiorPesoAltura() {
        Pessoa p = new Pessoa();
        p.setPeso(25.0);
        p.setAltura(0.44);
        p.calcularImc();
        Assert.assertEquals(129.13223140495867, p.getImc(), 0.00);

        p.setPeso(25.1);
        p.setAltura(0.455);
        p.calcularImc();
        Assert.assertEquals(121.2413959666707, p.getImc(), 0.00);

        p.setPeso(25.011);
        p.setAltura(0.455);
        p.calcularImc();
        Assert.assertEquals(120.81149619611156, p.getImc(), 0.00);

    }

    @Test
    public void testaLimiteSuperiorPesoAltura() {
        Pessoa p = new Pessoa();
        p.setPeso(700.0);
        p.setAltura(2.70);
        p.calcularImc();
        Assert.assertEquals(96.02194787379972, p.getImc(), 0.00);

        p.setPeso(699.9);
        p.setAltura(2.69);
        p.calcularImc();
        Assert.assertEquals(96.723373087713, p.getImc(), 0.00);
    }
}
