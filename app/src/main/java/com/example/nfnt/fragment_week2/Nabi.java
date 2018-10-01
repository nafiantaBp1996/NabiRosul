package com.example.nfnt.fragment_week2;

/**
 * Created by NFNT on 9/17/2018.
 */

public class Nabi {
    private String nama_nabi,deskripsi;
    public static final Nabi[]kisahnabi={
            new Nabi("1. Nabi Adam","Nabi pertama " +
                    "\n Allah Subhanahu wa Ta’ala memberitahukan kepada para malaikat tentang penciptaan Adam ‘alaihis salam, Dia berfirman:\n" +
                    "\n" +
                    "“Sesungguhnya aku hendak menjadikan seorang khalifah di muka bumi.” (QS. Al Baqarah: 30)\n" +
                    "\n" +
                    "Yakni makhluk yang satu dengan yang lain saling menggantikan. Demikianlah Allah Subhanahu wa Ta’ala memberitahukan kepada para malaikat tentang penciptaan Adam sebagaimana Dia memberitahukan perkara besar sebelum terwujud.\n" +
                    "\n" +
                    "\n" +
                    "\n" ),
            new Nabi("2. Nabi Idris","Nabi kedua " +
                    "\n Nabi Idris adalah keturunan keenam dari Nabi Adam as. Dia adalah putra dari Qabil dan Iqlima (putra dan putri Nabi Adam as).\n" +
                    "\n" +
                    "Saat itu, Allah memerintahkan Nabi Idris untuk mengajak seluruh manusia agar berjalan pada kebenaran. Saat itu dia adalah manusia pertama yang menerima wahyu lewat Malaikat Jibril ketika dirinya berusia 82 tahun.\n" +
                    "\n" +
                    "Sebagai seorang nabi, dia memiliki mukjizat atau kelebihan, yaitu:\n" +
                    "\n" +
                    "1. Manusia pertama yang pandai baca tulis dengan pena.\n" +
                    "\n" +
                    "2. Nabi Idris diberi macam-macam pengetahuan mulai dari merawat kuda, ilmu perbintangan (falaq), hingga ilmu berhitung yang sekarang dikenal dengan matematika.\n" +
                    "\n" +
                    "3. Nama Idris berasal dari kata Darasa yang artinya belajar. Nabi Idris pun kenal sangat senang belajar, dan tekun mengkaji fenomena alam semesta.\n" +
                    "\n" +
                    "4. Nabi Idris adalah orang pertama yang pandai memotong dan menjahit pakaiannya. Orang-orang sebelumnya konon hanya mengenakan kulit binatang sebagai penutup aurat."),
            new Nabi("3. Nabi Nuh",""),
            new Nabi("4. Nabi Hud",""),
            new Nabi("5. Nabi Shaleh",""),
            new Nabi("6. Nabi Ibrahim",""),
            new Nabi("7. Nabi Luth",""),
            new Nabi("8. Nabi Ismail",""),
            new Nabi("9. Nabi Ishaq",""),
            new Nabi("10. Nabi Yakub",""),
            new Nabi("11. Nabi Yusuf",""),
            new Nabi("12. Nabi Syu'aib",""),
            new Nabi("13. Nabi Ayub",""),
            new Nabi("14. Nabi Zulkifli",""),
            new Nabi("15. Nabi Musa",""),
            new Nabi("16. Nabi Harun",""),
            new Nabi("17. Nabi Daud",""),
            new Nabi("18. Nabi Sulaiman",""),
            new Nabi("19. Nabi Ilyas",""),
            new Nabi("20. Nabi Ilyasa",""),
            new Nabi("21. Nabi Yunus",""),
            new Nabi("22. Nabi Zakaria",""),
            new Nabi("23. Nabi Yahya",""),
            new Nabi("24. Nabi Isa",""),
            new Nabi("25. Nabi Muhammad ","Nabi terakhir dan rasul terakhir"),


    };

    private Nabi(String name, String description) {
        this.nama_nabi = name;
        this.deskripsi = description;
    }

    public String getNama_nabi() {
        return nama_nabi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    public String toString(){
        return this.nama_nabi;
    }
}
