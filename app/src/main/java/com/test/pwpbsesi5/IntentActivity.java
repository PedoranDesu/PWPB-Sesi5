package com.test.pwpbsesi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentActivity extends AppCompatActivity {
    Button drown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        drown = findViewById(R.id.btn_drown);

        drown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drowned = new Intent(IntentActivity.this,Activity3.class);
                startActivity(drowned);
            }
        });
    }
}
