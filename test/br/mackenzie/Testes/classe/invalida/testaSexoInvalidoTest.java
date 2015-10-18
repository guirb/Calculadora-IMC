/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.Testes.classe.invalida;

import br.mackenzie.dominio.Pessoa;
import br.mackenzie.exception.SexoInvalidoException;
import org.junit.Test;

/**
 *
 * @author Guilherme
 */
public class testaSexoInvalidoTest {

    @Test
    public void testaInvalidoSexo() {
        Pessoa p = new Pessoa();

        try {
            p.setSexo("Honduras");
        } catch (SexoInvalidoException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            p.setSexo("Manga");
        } catch (SexoInvalidoException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            p.setSexo("H0/\\/\\Em");
        } catch (SexoInvalidoException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
