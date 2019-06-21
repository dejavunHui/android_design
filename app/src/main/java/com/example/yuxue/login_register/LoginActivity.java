package com.example.yuxue.login_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yuxue.R;

public class LoginActivity extends AppCompatActivity {

    private TextView goto_rg = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        initCompentent();

        bindLisenter();
    }


    private void initCompentent()
    {
        goto_rg = findViewById(R.id.login_noid_tv);
    }

    private void bindLisenter()
    {

        goto_rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
