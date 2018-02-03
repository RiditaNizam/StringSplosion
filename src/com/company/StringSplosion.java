package com.company;

/**
 * Created by ridita on 2/2/18.
 */
public class StringSplosion {
    public String stringSplosion(String str) {
        String answerString = "";
        for (int i = 0; i < str.length() + 1; i++) {
            answerString += str.substring(0, i);
        }
        return answerString;
    }
}