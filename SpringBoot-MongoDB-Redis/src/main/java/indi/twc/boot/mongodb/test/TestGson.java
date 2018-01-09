package indi.twc.boot.mongodb.test;

import java.util.Date;

public class TestGson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Date date = new Date();
        System.out.println(date);

        String str = gson.toJson(date);
        System.out.println(str);
    }
}
