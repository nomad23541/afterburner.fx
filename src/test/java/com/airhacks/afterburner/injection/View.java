/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.afterburner.injection;

import jakarta.inject.Inject;

/**
 *
 * @author adam-bien.com
 */
public class View {

    @Inject
    Boundary boundary;

    public Boundary getBoundary() {
        return boundary;
    }
}
