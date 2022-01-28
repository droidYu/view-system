package com.droidyu.viewsystem._2_scroll;

import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.droidyu.viewsystem.R;

public class ScrollActivity extends AppCompatActivity {

    MyScrollView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        view = findViewById(R.id.my_scroll_view);

//        way5();
//        way6();
    }

    private void way6() {
        view.smoothScrollTo(200, 300);
    }

    private void way5() {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", 400);
        animator.setDuration(2000);
        animator.start();
    }


}