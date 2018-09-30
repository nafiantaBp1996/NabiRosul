package com.example.nfnt.fragment_week2;

/**
 * Created by NFNT on 9/17/2018.
 */

public class Resep {
    private String nama_makanan;
    private String detail_makanan;

    public static final Resep[] resepmakanan = {
            new Resep("Asparagus", "Asparagus, Santan, Cinta"),
            new Resep("Tenderloin Steak", "Tenderloin Beef, Mentega, Rindu, Kasih"),
            new Resep("Pasta Gigi", "Pasta Makaroni, Bawang, Cheese, Ckrek"),
    };
    public Resep(String nama, String detail){
        this.nama_makanan = nama;
        this.detail_makanan = detail;
    }

    public String getDetail_makanan() {
        return detail_makanan;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    @Override
    public String toString() {
        return this.nama_makanan;
    }
}
