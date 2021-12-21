package com.example.appnovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilRegis extends AppCompatActivity {

    TextView HName, HEmail, HUser, HPass, HGender, HAge, HGenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_regis);

        HName = (TextView) findViewById(R.id.hasil_name);
        HEmail = (TextView) findViewById(R.id.hasil_email);
        HUser = (TextView) findViewById(R.id.hasil_user);
        HPass = (TextView) findViewById(R.id.hasil_pass);
        HGender = (TextView) findViewById(R.id.hasil_gender);
        HAge = (TextView) findViewById(R.id.hasil_age);
        HGenre = (TextView) findViewById(R.id.hasil_genre);

        Intent i = getIntent();
        HName.setText(i.getExtras().getString("name"));
        HEmail.setText(i.getExtras().getString("email address"));
        HUser.setText(i.getExtras().getString("username"));
        HPass.setText(i.getExtras().getString("password"));
        HGender.setText(i.getExtras().getString("gender"));
        HAge.setText(i.getExtras().getString("age"));
        HGenre.setText(i.getExtras().getString("genre"));
    }


}