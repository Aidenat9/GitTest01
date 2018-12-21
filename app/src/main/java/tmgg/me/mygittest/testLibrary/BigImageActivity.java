package tmgg.me.mygittest.testLibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

import java.util.ArrayList;

import me.grantland.widget.AutofitTextView;
import tmgg.me.mygittest.R;

public class BigImageActivity extends AppCompatActivity implements ObservableScrollViewCallbacks {

    private SubsamplingScaleImageView mSsiv;
    private AutofitTextView mAutoTv;
    private EditText mEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_image);
        initView();
    }

    private void initView() {
        mSsiv = (SubsamplingScaleImageView) findViewById(R.id.ssiv);
        mSsiv.setImage(ImageSource.asset("test_big_img.jpg"));
        mAutoTv = (AutofitTextView) findViewById(R.id.autoTv);
        mEt = (EditText) findViewById(R.id.et);
        mEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mAutoTv.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
         ObservableListView listview = (ObservableListView) findViewById(R.id.list_view);
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            items.add("数据 " + i);
        }
        //为listview设置Adapter
        listview.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items));
        //为listview设置滚动回调观察者
        listview.setScrollViewCallbacks(this);
    }

    //Activity实现了ObservableScrollViewCallbacks接口，
    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {
        Log.i("onScrollChanged","Y轴的坐标："+scrollY);

    }

    @Override
    public void onDownMotionEvent() {

    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
        if(scrollState==ScrollState.DOWN){
            Log.i("onUpOrCancelMotionEvent","向下滚动");
        }else if(scrollState==ScrollState.UP){
            Log.i("onUpOrCancelMotionEvent","向上滚动");
        }else {
            Log.i("onUpOrCancelMotionEvent","停止滚动");
        }
    }
}
