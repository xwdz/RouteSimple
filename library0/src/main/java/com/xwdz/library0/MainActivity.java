package com.xwdz.library0;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


@Route(path = "/test0/main")
public class MainActivity extends AppCompatActivity {


    @Autowired
    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);

        TextView textView = new TextView(this);
        textView.setText("Module:Library0\nFrom:" + key);
        textView.setTextColor(Color.RED);
        textView.setGravity(Gravity.CENTER);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/test1/main")
                        .withString("key", "library0")
                        .navigation();
            }
        });
        setContentView(textView);


    }
}
