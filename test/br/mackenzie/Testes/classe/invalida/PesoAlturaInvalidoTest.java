/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.Testes.classe.invalida;

import br.mackenzie.dominio.Pessoa;
import br.mackenzie.exception.AlturaInvalidaException;
import br.mackenzie.exception.PesoInvalidoException;
import org.junit.Test;

/**
 *
 * @author Guilherme
 */
public class PesoAlturaInvalidoTest {

    @Test
    public void testaLimiteInferiorPeso() {
        Pessoa p = new Pessoa();
        try {
            p.setPeso(24.999);
        } catch (PesoInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testaLimiteSuperiorPeso() {
        Pessoa p = new Pessoa();
        try {
            p.setPeso(700.001);
        } catch (PesoInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testaLimiteInferiorAltura() {
        Pessoa p = new Pessoa();
        try {
            p.setAltura(0.4399);
        } catch (AlturaInvalidaException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testaLimiteSuperiorAltura() {
        Pessoa p = new Pessoa();
        try {
            p.setAltura(2.701);
        } catch (AlturaInvalidaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
