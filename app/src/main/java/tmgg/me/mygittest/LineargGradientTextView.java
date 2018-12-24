package tmgg.me.mygittest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;


/**
 * @author sunwei
 *         邮箱：tianmu19@gmail.com
 *         时间：2018/12/23 20:43
 *         包名：tmgg.me.mygittest
 *         <p>description:            </p>
 */

public class LineargGradientTextView extends android.support.v7.widget.AppCompatTextView {


    private TextPaint mPaint;
    private Matrix matrix;
    private float translateX;
    private float deltaX = 22;
    private LinearGradient linearGradient;

    public LineargGradientTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mPaint = getPaint();
        String text = getText().toString();
        float textWidth = mPaint.measureText(text);
        int gradientWidth =(int) (2*textWidth/text.length());
        linearGradient = new LinearGradient(-gradientWidth, 0, 0, 0, new int[]{0x33ffffff, 0xffffffff, 0x33ffffff}, new float[]{0, 0.5f, 1}, Shader.TileMode.CLAMP);
        mPaint.setShader(linearGradient);
        matrix = new Matrix();
    }

    private static final String TAG = "tag";
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float textWidth = getPaint().measureText(getText().toString());
        DisplayMetrics displayMetrics =
                getResources().getDisplayMetrics();
        int widthPixels = displayMetrics.widthPixels;
        translateX += deltaX;
        Log.e(TAG, "onDraw: "+widthPixels );
        if(widthPixels<textWidth){
            textWidth = widthPixels;
        }
        if (translateX > textWidth + 1 || translateX < 1) {
            deltaX = -deltaX;
        }
        matrix.setTranslate(translateX, 0);
        linearGradient.setLocalMatrix(matrix);
        postInvalidateDelayed(50);
    }
}
