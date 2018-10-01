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
            new Resep("1. Nabi Adam","\n Allah Subhanahu wa Ta’ala memberitahukan kepada para malaikat tentang penciptaan Adam ‘alaihis salam, Dia berfirman:\n"+"\n" + "“Sesungguhnya aku hendak menjadikan seorang khalifah di muka bumi.” (QS. Al Baqarah: 30)\n" + "\n" + "Yakni makhluk yang satu dengan yang lain saling menggantikan. Demikianlah Allah Subhanahu wa Ta’ala memberitahukan kepada para malaikat tentang penciptaan Adam sebagaimana Dia memberitahukan perkara besar sebelum terwujud", R.drawable.asparagus),
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
