package com.synrgy.aplikasikatakata.data

val alphabets = ('A'..'Z').toList().map { it.toString() }

enum class Words( val char: String, val wordsList: ArrayList<String>) {
    A("A", arrayListOf("Anoa", "Aligator", "Antelop")),
    B("B", arrayListOf("Baboon", "Beaver", "Bee")),
    C("C", arrayListOf("Camel", "Caterpillar", "Cheetah")),
    D("D", arrayListOf("Dolphin", "Dove", "Duck")),
    E("E", arrayListOf("Eagle", "Elephant", "Eel")),
    F("F", arrayListOf("Fox", "Frog", "Flamingo")),
    G("G", arrayListOf("Giraffe", "Goat", "Gorilla")),
    H("H", arrayListOf("Hippo", "Horse", "Hawk")),
    I("I", arrayListOf("Ibex", "Iguana", "Ibiza")),
    J("J", arrayListOf("Jaguar", "Jellyfish", "Jacana")),
    K("K", arrayListOf("Kangaroo", "Koala", "Komodo")),
    L("L", arrayListOf("Lion", "Leopard", "Llama")),
    M("M", arrayListOf("Moose", "Mantis", "Mongoose")),
    N("N", arrayListOf("Narwhal", "Naga", "Nuri")),
    O("O", arrayListOf("Ostrich", "Owl", "Octopus")),
    P("P", arrayListOf("Parrot", "Penguin", "Panda")),
    Q("Q", arrayListOf("Quail", "Quetzal", "Quokka")),
    R("R", arrayListOf("Rat", "Raven", "Rhinoceros")),
    S("S", arrayListOf("Snake", "Squirrel", "Sea turtle")),
    T("T", arrayListOf("Tiger", "Turtle", "Toucan")),
    U("U", arrayListOf("Uakari", "Unicorn", "Uromastyx")),
    V("V", arrayListOf("Viper", "Vulture", "Vaquita")),
    W("W", arrayListOf("Whale", "Wombat", "Wolf")),
    X("X", arrayListOf("Xerus", "Xenops", "X-Ray")),
    Y("Y", arrayListOf("Yak", "Yellowthroat", "Yeti crab")),
    Z("Z", arrayListOf("Zebra", "Zebu", "Zorilla"))
}