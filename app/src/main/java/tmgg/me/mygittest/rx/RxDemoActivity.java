package tmgg.me.mygittest.rx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;

import java.util.concurrent.TimeUnit;

import tmgg.me.mygittest.R;

public class RxDemoActivity extends AppCompatActivity{

    private static final String TAG = "tag";
    /**
     * btn_noDoubleClick
     */
    private Button mBtnNoDoubleClick;
    private AppCompatEditText mEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx);
        initView();
        processLogic();
        initListen();
    }

    private void initListen() {
        RxView.clicks(mBtnNoDoubleClick).throttleFirst(2000, TimeUnit.MILLISECONDS)
                .subscribe(unit -> Log.e(TAG, "accept: click button" ));
        RxTextView.textChanges(mEt)
                .map(charSequence -> charSequence+"___")
                .subscribe(charSequence -> showToast(charSequence.toString()));
    }

    private void processLogic() {

    }

    private void initView() {
        mBtnNoDoubleClick = (Button) findViewById(R.id.btn_noDoubleClick);
        mEt = findViewById(R.id.et);
    }

    private void showToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

 }
