package com.droidyu.viewsystem._3_event;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BaseViewGroup extends FrameLayout {
    public BaseViewGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("ViewEvent", "BaseViewGroup-dispatchTouchEvent-" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("ViewEvent", "BaseViewGroup-onInterceptTouchEvent-" + ev.getAction());
//        return true;
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("ViewEvent", "BaseViewGroup-onTouchEvent-" + event.getAction());
        return super.onTouchEvent(event);
    }
}
