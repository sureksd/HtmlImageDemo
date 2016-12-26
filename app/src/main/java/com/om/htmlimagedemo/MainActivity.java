package com.om.htmlimagedemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.om.html.htmlimage.HtmlImage;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HtmlImage image = (HtmlImage) findViewById(R.id.img);
        image.setSrcUrl("http://www.esa.int/var/esa/storage/images/esa_multimedia/images/2016/03/ultraviolet_image_shows_the_sun_s_intricate_atmosphere/15891756-1-eng-GB/Ultraviolet_image_shows_the_Sun_s_intricate_atmosphere_node_full_image_2.jpg", new HtmlImage.LoadImageListener() {
            @Override
            public void post(Bitmap bitmap, String url) {
                if (bitmap == null) {
                    Log.e(TAG, "post: Bitmap null");
                } else {
                    Log.e(TAG, url + " = " + bitmap);
                }
            }
        });
    }
}
