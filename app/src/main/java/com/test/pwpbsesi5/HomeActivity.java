package com.test.pwpbsesi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button login;
    Button guest;
    Button forget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        login = findViewById(R.id.tombol_login);
        guest = findViewById(R.id.tombol_guest);
        forget = findViewById(R.id.tombol_lupa_password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMain = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(toMain);
            }
        });

        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMain = new Intent(HomeActivity.this,GuestActivity.class);
                startActivity(toMain);
            }
        });

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toForget = new Intent(HomeActivity.this,ForgetPassword.class);
                startActivity(toForget);
            }
        });
    }
}
