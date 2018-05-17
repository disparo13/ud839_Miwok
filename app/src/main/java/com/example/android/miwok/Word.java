package com.example.android.miwok;

/**
 * No setters in this method. Once created - word and its translation couldn't be changed
 */
public class Word {

    /**
     * Default translation for the word
     * A private variable is setting with 'm'
     * at the start of its name.
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;

    /**
     * @param defaultTranslation - a word with user is familiar with
     * @param miwokTranslation   - a miwok word translation
     */

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * @param defaultTranslation - a word with user is familiar with
     * @param miwokTranslation   - a miwok word translation
     * @param imageResourceId    - an image resource id for the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
