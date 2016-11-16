package com.asiatravel.atscrollerstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private Button scrollerToButton;
    private Button scrollerByButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        linearLayout = (LinearLayout) findViewById(R.id.layout);
//        scrollerToButton = (Button) findViewById(R.id.scroller_to_button);
//        scrollerByButton = (Button) findViewById(R.id.scroller_by_button);
//
//        initListener();
    }

//    private void initListener() {
//        scrollerToButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                linearLayout.scrollTo(-80, -100);
//            }
//        });
//        scrollerByButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                linearLayout.scrollBy(-80, -100);
//            }
//        });
//    }
}
