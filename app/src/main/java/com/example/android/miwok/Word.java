package com.example.android.miwok;

public class Word {

    //Default translation of a word
    private String mDefaultTranslation;
    //Miwok translation of a word
    private String mMiwokTranslation;
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}