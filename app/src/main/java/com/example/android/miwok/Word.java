package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation, mDefaultTranslation;
    private int mImageResourceID = NO_RESOURCE_ID;
    private int mSoundResourceID = NO_RESOURCE_ID;

    private static final int NO_RESOURCE_ID = -1;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int soundResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation =  defaultTranslation;
        mImageResourceID = imageResourceID;
        mSoundResourceID = soundResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundResourceID = soundResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getmSoundResourceID() {
        return mSoundResourceID;
    }

    public boolean hasImage() {
       return mImageResourceID != NO_RESOURCE_ID;
    }
}
