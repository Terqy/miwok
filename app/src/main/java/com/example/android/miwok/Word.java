package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation, mDefaultTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = defaultTranslation;
        mDefaultTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
