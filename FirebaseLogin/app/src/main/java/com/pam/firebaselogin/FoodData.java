package com.pam.firebaselogin;

import android.content.Context;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context){
        ArrayList<Food> list = new ArrayList<>();
        list.add(new Food("Batagor","Terbuat dari tahu yang dilembutkan lalu diisi dengan adonan berbahan ikan dan ditambah bumbu kacang, makanan ini paling enak disantap hangat di siang hari atau sore hari. ",7000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Cappuccino","Perpaduan kopi hitam, susu, dan krim yang seimbang membuat minuman ini populer untuk kalangan muda, cocok untuk dinikmati kapanpun.", 15000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake","Hidangan ringan ini cocok untuk dessert",10000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Black Salad","Hidangan sehat ini cocok bagi yang ingin diet carbo",15000,context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Donut","Camilan populer ini hadir dengan berbagai macam toping mulai dari cokelat hingga kacang.",12000,context.getDrawable(R.drawable.donut)));
        list.add(new Food("Mie Goreng","Bukan indomie, atau mie kemasan lain ",15000,context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Sparkling Tea","Cocok untuk yang ingin minuman bersoda namun rendah gula",10000,context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Food("Cireng","deskripsi cireng",7000,context.getDrawable(R.drawable.cireng)));
        return list;
    }
}
