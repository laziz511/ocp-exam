package com.laziz.chapter7.part5;

public sealed class Antelope permits Gazelle {
}

final class Gazelle extends Antelope {
}

class George extends Gazelle {      // DOES NOT COMPILE
}
