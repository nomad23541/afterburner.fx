package com.airhacks.afterburner.injection;

import jakarta.inject.Inject;

/**
 *
 * @author adam-bien.com
 */
public class AnotherView {

    @Inject
    Boundary boundary;

    public Boundary getBoundary() {
        return boundary;
    }
}
