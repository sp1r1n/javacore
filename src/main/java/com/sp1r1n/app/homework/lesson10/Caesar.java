package com.sp1r1n.app.homework.lesson10;

/**
 * Created by Denis on 2/23/2017.
 */
public class Caesar {
    String s = "";

    public String doEncrypt(String msg, int shift){
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) + shift);
                if (c > 'z')
                    s += (char)(msg.charAt(x) - (26-shift));
                else
                    s += (char)(msg.charAt(x) + shift);
        }
        return s;
    }

    public String doDecrypt(String msg, int shift){
        int len = msg.length();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) - shift);
            if (c > 'z')
                s += (char)(msg.charAt(x) + (26-shift));
            else
                s += (char)(msg.charAt(x) - shift);
        }
        return s;
    }
}