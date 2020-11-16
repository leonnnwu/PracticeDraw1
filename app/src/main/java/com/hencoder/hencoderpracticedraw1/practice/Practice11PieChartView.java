package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import androidx.annotation.Nullable;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    PAN[] pans = new PAN[]{
            new PAN("Lollipop", Color.RED, 120f),
            new PAN("Marshmallow", Color.YELLOW, 50f),
            new PAN("Froyo", Color.BLACK, 1f),
            new PAN("Gingerbread", Color.parseColor("#8A2BE2"), 10f),
            new PAN("Ice Cream Sandwich", Color.GRAY, 10f),
            new PAN("Jelly Bean", Color.GREEN, 60f),
            new PAN("KitKat", Color.BLUE, 96f)
    };


    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);

        float start_x = 300;
        float start_y = 100;
        float end_x = 900;
        float end_y = 700;

        float startAngle = -180;

        paint.setColor(pans[0].color);
        float offset = 15;
        canvas.drawArc(start_x-offset, start_y-offset, end_x-offset, end_y-offset, startAngle, pans[0].size, true, paint);
        startAngle += pans[0].size + 2;

        for(int i=1; i< pans.length; i++) {
            paint.setColor(pans[i].color);
            canvas.drawArc(start_x, start_y, end_x, end_y, startAngle, pans[i].size, true, paint);
            startAngle += pans[i].size + 2;
        }
    }

    private class PAN {
        String name;
        Integer color;
        Float size;

        PAN(String name, Integer color, Float size) {
            this.name = name;
            this.color = color;
            this.size = size;
        }
    }
}
