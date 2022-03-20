package com.pau;

public class Lagu {
    private String judullagu;
    private String namapenyanyi;

    public Lagu(String judullagu, String namapenyanyi) {
        this.judullagu = judullagu;
        this.namapenyanyi = namapenyanyi;
    }

    public String getJudullagu() {
        return judullagu;
    }

    @Override
    public  String toString() {
        return namapenyanyi + " - " + judullagu;
    }
}
