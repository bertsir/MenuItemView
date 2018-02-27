package cn.bertsir.menuitemlibary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
/**
 * Created by Bert on 2018/2/27.
 */

public class RedPointView extends View {


    private int pointColor ;
    private int measuredHeight;
    private int measuredWidth;

    public RedPointView(Context context) {
        super(context);
    }

    public RedPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.RedPointView);
        pointColor = array.getColor(R.styleable.RedPointView_ponitColor, Color.RED);
        array.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measuredHeight = getMeasuredHeight();
        measuredWidth = getMeasuredWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(pointColor);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        canvas.drawCircle(measuredWidth/2,measuredHeight/2,measuredWidth/2,paint);
    }


    public void setPointColor(int color){
        this.pointColor = color;
        invalidate();
    }
}
