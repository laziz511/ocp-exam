package com.laziz.chapter6.part4;

/**
 * - in both Seal and Elephant, there is a call super() to the no-argument constructor of the parent class, which is
 * inserted by the compiler. Since, there is no such constructor in the parent class, the code calls the
 * constructor that does not actually exist. That's why, the code does not compile.
 */
public class Mammal {

    public int age;

    public Mammal(int age) {
        this.age = age;
    }
}

class Seal extends Mammal {  // DOES NOT COMPILE
}

class Elephant extends Mammal {
    public Elephant() {     // DOES NOT COMPILE
    }
}

class Seal2 extends Mammal {
    public Seal2() {
        super(6); // Explicit call to parent constructor
    }
}

class Elephant2 extends Mammal {
    public Elephant2(int age) {
        super(age); // Explicit call to parent constructor
    }
}
