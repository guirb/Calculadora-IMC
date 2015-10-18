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
public class testaSexoValidoTest {

    @Test
    public void testaSexo() {
        Pessoa p = new Pessoa();
        p.setSexo("HOMEM");
        Assert.assertEquals("HOMEM", p.getSexo());

        p.setSexo("MULHER");
        Assert.assertEquals("MULHER", p.getSexo());
    }
}
