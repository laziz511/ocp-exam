package com.laziz.chapter6.part8;

class Carnivore {
    protected boolean hasFur = false;
}

public class Meerkat extends Carnivore {
    protected boolean hasFur = true;

    public static void main(String[] args) {
        Meerkat m = new Meerkat(2);

        short a = 123;
        Meerkat m2 = new Meerkat(a);

        Carnivore c = m;
        System.out.println(m.hasFur); // true
        System.out.println(c.hasFur); // false
    }

    public Meerkat(short a) {
        //
    }

    public Meerkat(int a) {
        //
    }
}
