package com.test.pwpbsesi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button expInt;
    Button impInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expInt = findViewById(R.id.btn_expint);
        expInt.setOnClickListener(this);
        impInt = findViewById(R.id.btn_impint);
        impInt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_expint:
                Intent exp = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(exp);
                break;
            case R.id.btn_impint:
                Intent imp = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.duckduckgo.com"));
                startActivity(imp);
                break;
            default:
                break;
        }
    }
}
