/*
 */
package keboola.ares.ex.client;

import keboola.ares.ex.KBCException;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2015
 */
public class ClientException extends KBCException {

    public ClientException(String message) {
        super(message);
    }
}
