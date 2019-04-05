package com.wooplr.spotlight.shape;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.wooplr.spotlight.target.Target;

public class Rectangle extends Shape {

    public Rectangle(Target target, int padding) {
        super(target, padding);
    }

    @Override
    public void draw(Canvas canvas, Paint eraser, int padding) {
        calculateRadius(padding);
        circlePoint = getFocusPoint();
        canvas.drawRect(circlePoint.x-radius, circlePoint.y+radius,circlePoint.x+radius, circlePoint.y - radius, eraser);
    }
}
