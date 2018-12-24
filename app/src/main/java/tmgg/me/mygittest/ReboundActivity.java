package tmgg.me.mygittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringSystem;
import com.tumblr.backboard.performer.Performer;

public class ReboundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rebound);
        ImageView imageView = findViewById(R.id.iv);
        Spring spring = SpringSystem.create().createSpring();
        Performer performer = new Performer(imageView, View.TRANSLATION_X);
        spring.addListener(performer);


    }
}
