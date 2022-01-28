package com.droidyu.viewsystem._3_event;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TopViewGroup extends FrameLayout {
    public TopViewGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("ViewEvent", "TopViewGroup-dispatchTouchEvent-" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("ViewEvent", "TopViewGroup-onInterceptTouchEvent-" + ev.getAction());
//        return true;
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("ViewEvent", "TopViewGroup-onTouchEvent-" + event.getAction());
//        return true;
        return super.onTouchEvent(event);
    }
}
