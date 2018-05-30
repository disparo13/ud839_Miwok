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

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Sound resource id for the word
     */

    private int mSoundResourceId;

    /**
     * @param defaultTranslation - a word with user is familiar with
     * @param miwokTranslation   - a miwok word translation
     * @param soundResourceId    - a sound resource id for the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * @param defaultTranslation - a word with user is familiar with
     * @param miwokTranslation   - a miwok word translation
     * @param imageResourceId    - an image resource id for the word
     * @param soundResourceId    - a sound resource id for the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return do we have an image for the word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
