package com.chen.cay.vitamioplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.chen.cay.vitamioplayer.R.id.btn_l;

public class MainActivity extends AppCompatActivity {
    private EditText edl;
    private EditText edh;
    private Button btnl;
    private Button btnh;
    private Button btnW;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayActivity.actionStart(MainActivity.this,edl.getText().toString());
            }
        });
        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayActivity.actionStart(MainActivity.this,edh.getText().toString());
            }
        });
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        edl = (EditText) findViewById(R.id.et_l);
        edh = (EditText) findViewById(R.id.et_h);
        btnl = (Button) findViewById(btn_l);
        btnh = (Button) findViewById(R.id.btn_h);
        btnW = (Button) findViewById(R.id.btn_web);
    }

}
