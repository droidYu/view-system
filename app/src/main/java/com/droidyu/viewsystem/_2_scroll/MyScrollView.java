package com.droidyu.viewsystem._2_scroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Scroller;

import androidx.annotation.Nullable;

public class MyScrollView extends View {

    int lastX = 0;
    int lastY = 0;
    Scroller scroller;


    public MyScrollView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        scroller = new Scroller(context);
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        if (scroller.computeScrollOffset()) {
            ((View) getParent()).scrollTo(scroller.getCurrX(), scroller.getCurrY());
            invalidate();
        }
    }

    public void smoothScrollTo(int x, int y) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int offsetX = scrollX - x;
        int offsetY = scrollY - y;
        scroller.startScroll(scrollX, scrollY, offsetX, offsetY, 2000);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                int offsetX = x - lastX;
                int offsetY = y - lastY;
//                way1(offsetX, offsetY);
//                way2(offsetX, offsetY);
//                way3_1(offsetX, offsetY);
//                way3_2(offsetX, offsetY);
//                way4(offsetX, offsetY);
                break;
        }

        return true;
    }

    private void way4(int offsetX, int offsetY) {
        ((View) getParent()).scrollBy(-offsetX, -offsetY);
    }


    private void way3_2(int offsetX, int offsetY) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        layoutParams.leftMargin = getLeft() + offsetX;
        layoutParams.topMargin = getTop() + offsetY;
        setLayoutParams(layoutParams);
    }

    private void way3_1(int offsetX, int offsetY) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = getLeft() + offsetX;
        layoutParams.topMargin = getTop() + offsetY;
        setLayoutParams(layoutParams);
    }

    private void way2(int offsetX, int offsetY) {
        offsetLeftAndRight(offsetX);
        offsetTopAndBottom(offsetY);
    }

    private void way1(int offsetX, int offsetY) {
        layout(getLeft() + offsetX,
                getTop() + offsetY,
                getRight() + offsetX,
                getBottom() + offsetY);
    }
}
