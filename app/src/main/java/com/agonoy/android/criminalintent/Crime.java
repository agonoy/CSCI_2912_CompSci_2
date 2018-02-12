package com.agonoy.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    /** #1 adding suspect to the model layer */
    public String getSuspect() {
        return mSuspect;
    }

    /** #2 adding suspect to the model layer */
    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    /** 16.5 Taking picture w/ Intents -->  Designate a picture location*/
    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }
}
