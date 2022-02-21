package com.example.Brodcast;
public class Brodcast {
    private final int id;
    private final String b1;
    private final String b2;

    public Brodcast(final int id,  final String b1, final String b2) {
        this.id = id;
        this.b1 = b1;
        this.b2 = b2;
    }

    public int getId() {
        return id;
    }

    public String getB1() {
        return b1;
    }
    public String getB2() {
        return b2;
    }
}