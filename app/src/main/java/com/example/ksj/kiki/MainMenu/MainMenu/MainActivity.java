package com.example.ksj.kiki.MainMenu.MainMenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ksj.kiki.MainMenu.Dust.DustActivity;
import com.example.ksj.kiki.MainMenu.Height.UserListActivity;
import com.example.ksj.kiki.R;

public class MainActivity extends AppCompatActivity {

    Button heightBtn, dustBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        btnClickEvent();
    }

    private void initView() {
        // TODO findViewById -> 버터나이프 -> 데이터바인딩
        // hoho
        heightBtn = (Button)findViewById(R.id.heightBtn);
        dustBtn = (Button)findViewById(R.id.dustBtn);
    }

    private void btnClickEvent() {
        heightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UserListActivity.class);
                startActivity(intent);
            }
        });

        dustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DustActivity.class);
                startActivity(intent);
            }
        });
    }
}
