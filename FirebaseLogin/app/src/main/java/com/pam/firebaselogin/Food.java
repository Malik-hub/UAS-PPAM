package com.pam.firebaselogin;

import android.graphics.drawable.Drawable;

public class Food {
    String title;
    String deskripsi;
    int harga;
    Drawable image;

    Food(String title, String deskripsi, int harga, Drawable image){
        this.title = title;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}
