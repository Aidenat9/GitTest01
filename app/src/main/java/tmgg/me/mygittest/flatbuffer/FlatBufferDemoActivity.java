package tmgg.me.mygittest.flatbuffer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.io.IOException;
import java.nio.ByteBuffer;

import tmgg.me.mygittest.R;
import tmgg.me.mygittest.flatbuffer.CustomerResultData.CustomerItem;
import tmgg.me.mygittest.flatbuffer.CustomerResultData.ResultData;
import tmgg.me.mygittest.flatbuffer.CustomerResultData.RootType;

public class FlatBufferDemoActivity extends AppCompatActivity {
    private static final String TAG = "flatbuffer";
    String url = "https://apis.youtoo365.com/v4/StewadMember/listNew?memberId=1000000000061679&pageSize=2000&pageIndex=0";
    private long startT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_buffer_demo);
        try {
            processFlatBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processFlatBuffer() throws IOException {
        startT = System.currentTimeMillis();

        OkGo.<String>get(url).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                byte[] bytes = response.body().getBytes();
                Log.e(TAG, "onSuccess: "+bytes.length );
                ByteBuffer wrap = ByteBuffer.wrap(bytes);
                decodeByte(wrap);
            }
        });

    }

    private void decodeByte(ByteBuffer byteBuffer) {
        long endT = System.currentTimeMillis();
        Log.e(TAG, "onSuccess: flatbuffer " + (endT - startT));
        Log.e(TAG, "onSuccess: byteBuffer  length : " + byteBuffer);
        if (null == byteBuffer) return;
        RootType rootAsRootType = RootType.getRootAsRootType(byteBuffer);
        boolean success = rootAsRootType.isSuccess();
        if (success) {
            ResultData resultData = rootAsRootType.resultData();
            for (int i = 0; i < resultData.contentLength(); i++) {
                CustomerItem content = resultData.content(i);
                String memberName = content.memberName();
                Log.e(TAG, "onSuccess: memberName  " + memberName);
            }
        }

    }
}
