package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import androidx.annotation.Nullable;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint paint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float start_x = 150;
        float start_y = 50;
        float histogram_width = 100;
        int numberOfHistogram = 7;
        int distance = 20;
        float end_x = start_x + histogram_width*numberOfHistogram + (numberOfHistogram+1)*distance;
        float end_y = 600;

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(start_x, start_y, start_x, end_y, paint);
        canvas.drawLine(start_x, end_y, end_x, end_y, paint);

        float temp_x = start_x;
        float[] heights = new float[] {2, 10, 10, 300, 500, 550, 250};
        String[] labels = new String[] {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
        for (int i=0; i<numberOfHistogram; i++) {
            paint.setColor(Color.GREEN);
            float temp_end_x = temp_x+distance+histogram_width;
            canvas.drawRect(temp_x+distance, end_y-heights[i], temp_end_x, end_y, paint);
            paint.setColor(Color.WHITE);
            paint.setTextSize(25);
            float textLength = paint.measureText(labels[i]);
            canvas.drawText(labels[i], temp_x+distance+(histogram_width-textLength)/2, end_y+25, paint);
            temp_x = temp_end_x;
        }
    }
}
