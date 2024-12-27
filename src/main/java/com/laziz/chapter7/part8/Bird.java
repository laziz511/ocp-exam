package com.laziz.chapter7.part8;

public interface Bird {

    String name();
}

record Crane(int numberEggs, String name) implements Bird {
    public String name() {
        return name + " at method";
    }
}

class BirdUsage {
    public static void main(String[] args) {
        var crane = new Crane(4, "Molly");
        String name = crane.name();
        System.out.println(name);       // prints: Molly at method
    }
}
