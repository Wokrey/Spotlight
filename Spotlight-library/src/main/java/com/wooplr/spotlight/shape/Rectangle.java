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
        canvas.drawRect(circlePoint.x-radius, circlePoint.y-(target.getViewHeight()/2),circlePoint.x+radius, circlePoint.y + (target.getViewHeight()/2), eraser);
    }

    protected void calculateRadius(int padding) {
        int side = target.getRect().width() / 2;
        radius = side + padding;
    }
}
