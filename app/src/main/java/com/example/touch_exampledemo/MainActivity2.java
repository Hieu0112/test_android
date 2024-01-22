package com.example.touch_exampledemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements
        GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener,
        View.OnTouchListener{
    private TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12;
    private ImageView img;
    private GestureDetector detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }
    private void initView() {
        e1=findViewById(R.id.txt1);
        e2=findViewById(R.id.txt2);
        e3=findViewById(R.id.txt3);
        e4=findViewById(R.id.txt4);
        e5=findViewById(R.id.txt5);
        e6=findViewById(R.id.txt6);
        e7=findViewById(R.id.txt7);
        e8=findViewById(R.id.txt8);
        e9=findViewById(R.id.txt9);
        e10=findViewById(R.id.txt10);
        e11=findViewById(R.id.txt11);
        e12=findViewById(R.id.txt12);
        img=findViewById(R.id.img);
        img.setOnTouchListener(this);
        detector=new GestureDetector(this,this);
        detector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onDown(@NonNull MotionEvent e) {
        e1.setText("Down touch");
        e2.setText("X: "+e.getX()+" - Y: "+e.getY());
        return true;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent e) {
        e3.setText("Show press");
        e4.setText("X: "+e.getX()+" - Y: "+e.getY());
    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent e) {
        e5.setText("Single Tap up");
        e6.setText("X: "+e.getX()+" - Y: "+e.getY());
        return true;
    }

    @Override
    public boolean onScroll(@Nullable MotionEvent event, @NonNull MotionEvent event2, float distanceX, float distanceY) {
        e7.setText("Show scroll");
        e8.setText("X: "+event.getX()+" - Y: "+event.getY());
        return true;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent e) {

    }

    @Override
    public boolean onFling(@Nullable MotionEvent event, @NonNull MotionEvent event2, float velocityX, float velocityY) {
        e9.setText("Show Fling");
        e10.setText("X: "+event.getX()+" - Y: "+event.getY());
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(@NonNull MotionEvent e) {
        e11.setText("Show DoubleTap");
        e12.setText("X: "+e.getX()+" - Y: "+e.getY());
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(@NonNull MotionEvent e) {
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        detector.onTouchEvent(event);
        return true;
    }
}