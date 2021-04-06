package com.example.recyclerview_parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Example_Item implements Parcelable {

    private int mImageResource;
    private String mText1;
    private String mText2;

    public Example_Item(int mImageResource, String mText1, String mText2) {
        this.mImageResource = mImageResource;
        this.mText1 = mText1;
        this.mText2 = mText2;
    }

    //parcel methods

    protected Example_Item(Parcel in) {
        mImageResource = in.readInt();
        mText1 = in.readString();
        mText2 = in.readString();
    }

    public static final Creator<Example_Item> CREATOR = new Creator<Example_Item>() {
        @Override
        public Example_Item createFromParcel(Parcel in) {
            return new Example_Item(in);
        }

        @Override
        public Example_Item[] newArray(int size) {
            return new Example_Item[size];
        }
    };

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }

    //parcel methods

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResource);
        dest.writeString(mText1);
        dest.writeString(mText2);
    }
}
