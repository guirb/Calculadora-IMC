/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.exception;

/**
 *
 * @author Guilherme
 */
public class SexoInvalidoException extends RuntimeException {

    public SexoInvalidoException(final Throwable cause) {
        super(cause);
    }

    public SexoInvalidoException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

    public SexoInvalidoException(final String msg) {
        super(msg);
    }
}
