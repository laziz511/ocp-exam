package com.laziz.chapter6.part6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Reptile {
    protected void sleep() throws IOException {
    }

    protected void hide() {
    }

    protected void exitShell() throws FileNotFoundException {
    }
}

class GalapagosTortoise extends Reptile {
    public void sleep() throws FileNotFoundException {
    }

    public void hide() throws FileNotFoundException {
    } // DOES NOT COMPILE

    public void exitShell() throws IOException {
    } // DOES NOT COMPILE
}

