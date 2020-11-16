package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import androidx.annotation.Nullable;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        // left, top, right, bottom is the oval
        // Draw the arc from the center of the oval
        // useCenter: false -> arc, true -> fan
        // startAngle: x-right: 0
        canvas.drawArc(250, 200, 650, 500, -180, 55, false, paint);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(250, 200, 650, 500, -110, 100, true, paint);
        canvas.drawArc(250, 200, 650, 500, 160, -140, false, paint);
    }
}
