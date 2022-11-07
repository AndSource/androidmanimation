package com.cleveroad.androidmanimation;

import android.graphics.Canvas;
import android.graphics.RectF;

import androidx.annotation.NonNull;

/**
 * Interface of drawable shape
 */
interface DrawableObject {

    void update(@NonNull RectF bounds, float dt);

    void draw(@NonNull Canvas canvas);
}
