package com.jackchen.view_day26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private LoveLayout love_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        love_layout = (LoveLayout) findViewById(R.id.love_layout);
    }

    public void start(View view){
        love_layout.addLove();
    }
}
