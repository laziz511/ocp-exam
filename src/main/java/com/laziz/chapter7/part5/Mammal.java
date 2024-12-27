package com.laziz.chapter7.part5;

/**
 * - Despite allowing indirect subclasses not named in Mammal,the list of classes that can inherit Mammal is still fixed.
 *      Now, only Equine and Zebra inherits Mammal.
 *      If you have a reference to a Mammal object, it must be a Mammal, Equine, or Zebra.
 */
public sealed class Mammal permits Equine {
}

sealed class Equine extends Mammal permits Zebra {
}

final class Zebra extends Equine {      // final or non-sealed
}
