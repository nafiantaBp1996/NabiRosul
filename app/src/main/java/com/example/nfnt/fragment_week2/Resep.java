package com.example.nfnt.fragment_week2;

import android.media.Image;

/**
 * Created by NFNT on 9/17/2018.
 */

public class Resep {
    private String nama_makanan;
    private String detail_makanan;
    private int gambar_makanan;

    public static final Resep[] resepmakanan = {
            new Resep("Asparagus", "Asparagus, Santan, Cinta",R.drawable.asparagus),
            new Resep("Tenderloin Steak", "Tenderloin Beef, Mentega, Rindu, Kasih",R.drawable.tender),
            new Resep("Pasta Gigi", "Pasta Makaroni, Bawang, Cheese, Ckrek",R.drawable.asparagus),
    };
    public Resep(String nama, String detail,int gambar){
        this.nama_makanan = nama;
        this.detail_makanan = detail;
        this.gambar_makanan = gambar;
    }

    public String getDetail_makanan() {
        return detail_makanan;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }
    public int getGambar_makanan() {
        return gambar_makanan;
    }

    @Override
    public String toString() {
        return this.nama_makanan;
    }
}
