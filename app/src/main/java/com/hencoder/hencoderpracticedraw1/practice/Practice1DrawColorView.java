package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import androidx.annotation.Nullable;

import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class Practice1DrawColorView extends View {

    public Practice1DrawColorView(Context context) {
        super(context);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.YELLOW);
    }
}
