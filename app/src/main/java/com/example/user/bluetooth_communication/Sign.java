package com.example.user.bluetooth_communication;

import java.util.HashMap;

public class Sign {
    /** Name of the sign */
    private String mSignName;

    /** Encoded hand data for the sign
     Thumb, Index, Middle, Ring, Little, Palm
     **/
    private String mEncodedStatus;

    /** Audio resource ID for the sign */
    private int mAudioResourceId;

    /** Image resource ID for the sign */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this sign */
    private static final int NO_IMAGE_PROVIDED = -1;

    public static HashMap<String,Sign> mDatabase = createMap();

    private static HashMap<String,Sign> createMap() {
        HashMap<String,Sign> database = new HashMap<String, Sign>();
        /*//database.put("000000", new Sign("Zero","",R.drawable.o,R.raw.number_zero));
        database.put("020000", new Sign("One","",R.drawable.one,R.raw.number_one));
        database.put("022000", new Sign("Two","",R.drawable.two,R.raw.number_two));
        database.put("222000", new Sign("Three","",R.drawable.three,R.raw.number_three));
        database.put("022220", new Sign("Four","",R.drawable.four,R.raw.number_four));
        database.put("222220", new Sign("Five","",R.drawable.five,R.raw.number_five));
        database.put("022200", new Sign("Six","",R.drawable.six,R.raw.number_six));
        database.put("022020", new Sign("Seven","",R.drawable.seven,R.raw.number_seven));
        database.put("020220", new Sign("Eight","",R.drawable.eight,R.raw.number_eight));
        database.put("012220", new Sign("Nine","",R.drawable.nine,R.raw.number_nine));
        database.put("200000", new Sign("A","",R.drawable.a,R.raw.a));
        //database.put("", new Sign("B","",R.drawable.b,R.raw.b)); //similar to "4"
        database.put("211111", new Sign("C","",R.drawable.c,R.raw.c));
        database.put("021110", new Sign("D","",R.drawable.d,R.raw.d));
        database.put("011110", new Sign("E","",R.drawable.e,R.raw.e));
        //database.put("", new Sign("F","",R.drawable.f,R.raw.f)); //similar to "9"
        database.put("220002", new Sign("G","",R.drawable.g,R.raw.g));
        database.put("222002", new Sign("H","",R.drawable.h,R.raw.h));
        database.put("000020", new Sign("I","",R.drawable.i,R.raw.i));
        //database.put("", new Sign("J","",R.drawable.j,R.raw.j)); // requires motion
        //database.put("", new Sign("K","",R.drawable.k,R.raw.k)); //similar to "3"
        database.put("220000", new Sign("L","",R.drawable.l,R.raw.l));
        //database.put("", new Sign("M","",R.drawable.m,R.raw.m)); // similar to "N"
        //database.put("", new Sign("N","",R.drawable.n,R.raw.n)); // similar to "M"
        //database.put("", new Sign("O","",R.drawable.o,R.raw.o)); // same as Zero
        database.put("221003", new Sign("P","",R.drawable.p,R.raw.p));
        database.put("220003", new Sign("Q","",R.drawable.q,R.raw.q));
        //database.put("", new Sign("R","",R.drawable.r,R.raw.r));
        //database.put("", new Sign("S","",R.drawable.s,R.raw.s));
        //database.put("", new Sign("T","",R.drawable.t,R.raw.t));
        //database.put("", new Sign("U","",R.drawable.u,R.raw.u));
        //database.put("", new Sign("V","",R.drawable.v,R.raw.v));
        //database.put("", new Sign("W","",R.drawable.w,R.raw.w));
        database.put("010000", new Sign("X","",R.drawable.x,R.raw.x));
        database.put("200020", new Sign("Y","",R.drawable.y,R.raw.y));
        //database.put("", new Sign("Z","",R.drawable.z,R.raw.z)); //requires motion*/

        database.put("000000", new Sign("Zero","",R.drawable.o,R.raw.number_zero));
        database.put("020000", new Sign("One","",R.drawable.one,R.raw.number_one));
        database.put("022000", new Sign("Two","",R.drawable.two,R.raw.number_two));
        database.put("222000", new Sign("Three","",R.drawable.three,R.raw.number_three));
        database.put("022220", new Sign("Four","",R.drawable.four,R.raw.number_four));
        database.put("222220", new Sign("Five","",R.drawable.five,R.raw.number_five));
        database.put("022210", new Sign("Six","",R.drawable.six,R.raw.number_six));
        database.put("022020", new Sign("Seven","",R.drawable.seven,R.raw.number_seven));
        database.put("020220", new Sign("Eight","",R.drawable.eight,R.raw.number_eight));
        database.put("012220", new Sign("Nine","",R.drawable.nine,R.raw.number_nine));
        database.put("200000", new Sign("A","",R.drawable.a,R.raw.a));
        //database.put("", new Sign("B","",R.drawable.b,R.raw.b)); //similar to "4"
        database.put("211110", new Sign("C","",R.drawable.c,R.raw.c));
        database.put("021110", new Sign("D","",R.drawable.d,R.raw.d));
        database.put("011110", new Sign("E","",R.drawable.e,R.raw.e));
        database.put("002220", new Sign("F","",R.drawable.f,R.raw.f)); //similar to "9"
        database.put("220002", new Sign("G","",R.drawable.g,R.raw.g));
        database.put("222002", new Sign("H","",R.drawable.h,R.raw.h));
        database.put("000020", new Sign("I","",R.drawable.i,R.raw.i));
        //database.put("", new Sign("J","",R.drawable.j,R.raw.j)); // requires motion
        //database.put("", new Sign("K","",R.drawable.k,R.raw.k)); //similar to "3"
        database.put("220000", new Sign("L","",R.drawable.l,R.raw.l));
        //database.put("", new Sign("M","",R.drawable.m,R.raw.m)); // similar to "N"
        //database.put("", new Sign("N","",R.drawable.n,R.raw.n)); // similar to "M"
        //database.put("", new Sign("O","",R.drawable.o,R.raw.o)); // same as Zero
        database.put("221003", new Sign("P","",R.drawable.p,R.raw.p));
        database.put("220003", new Sign("Q","",R.drawable.q,R.raw.q));
        //database.put("", new Sign("R","",R.drawable.r,R.raw.r));
        //database.put("", new Sign("S","",R.drawable.s,R.raw.s));
        //database.put("", new Sign("T","",R.drawable.t,R.raw.t));
        //database.put("", new Sign("U","",R.drawable.u,R.raw.u));
        //database.put("", new Sign("V","",R.drawable.v,R.raw.v));
        database.put("022200", new Sign("W","",R.drawable.w,R.raw.w));
        database.put("010000", new Sign("X","",R.drawable.x,R.raw.x));
        database.put("200020", new Sign("Y","",R.drawable.y,R.raw.y));
        //database.put("", new Sign("Z","",R.drawable.z,R.raw.z)); //requires motion
        //database.put("002220", new Sign("Nine","",R.drawable.nine,R.raw.number_nine));

        return database;
    }


    /**
     * Create a new Sign object.
     *
     * @param name is the name of the sign
     * @param encodedStatus represents the encoded hand data for the sign
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Sign(String name, String encodedStatus, int audioResourceId) {
        mSignName = name;
        mEncodedStatus = encodedStatus;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Sign object.
     *
     * @param name is the name of the sign
     * @param encodedStatus represents the encoded hand data for the sign
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Sign(String name, String encodedStatus, int imageResourceId,
                int audioResourceId) {
        mSignName = name;
        mEncodedStatus = encodedStatus;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the name of the sign.
     */
    public String getSignName() {
        return mSignName;
    }

    /**
     * Get the encoded status of the sign.
     */
    public String getEncodedStatus() {
        return mEncodedStatus;
    }

    /**
     * Return the image resource ID of the sign.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
