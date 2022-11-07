package com.cleveroad.androidmanimation;

/**
 * Constants class.
 */
class Constants {

    private Constants() {
    }

    public static final float DEFAULT_SPEED_COEFFICIENT = 1f;

    public static float SPEED_COEFFICIENT;

    public static final int TOTAL_DURATION = 4530;

    public static final int TOTAL_FRAMES = 151;

    public static final int MS_PER_FRAME = 30;

    public static final float FRAME_SPEED = 1f * MS_PER_FRAME / TOTAL_DURATION;

    public static final float FIRST_FRAME_FRACTION = 0;

    public static final float LAST_FRAME_FRACTION = TOTAL_FRAMES * FRAME_SPEED;
}
