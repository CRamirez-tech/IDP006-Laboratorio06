package com.crm.idnplab06.graphs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.crm.idnplab06.models.LegendEntity;

import java.util.List;

public class LegendChart extends View {
    private List<LegendEntity> legend;
    private Paint paintText = new Paint();
    private Paint paint = new Paint();
    private static final float width_box = 40;
    private static final float height_box = 40;
    private static final float vertical_separation = 10;

    public LegendChart(Context context) {
        super(context);
    }

    public LegendChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setLegendData(List<LegendEntity> legend) {
        this.legend = legend;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (legend == null)
            return;

        paintText.setTextSize(34f);

        float x = 0;
        float y = 0;

        for (LegendEntity legendEntity : legend) {

            String category = legendEntity.getCategory();
            Color value = legendEntity.getColor();
            paint.setColor(value.toArgb());
            canvas.drawRect(x, y, x + width_box, y + height_box, paint);
            canvas.drawText(category, x + width_box + 5, y + height_box, paintText);
            y += height_box + vertical_separation;
        }

    }
}

