package com.example.pacpl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button profilebutton = (Button) findViewById(R.id.profilebutton); //user

        Button searchbutton = (Button) findViewById(R.id.searchbutton); //service provider

        Button occupationbutton = (Button) findViewById(R.id.AdminButton);


        occupationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent1 = new Intent(getApplicationContext(), occupationActivity.class);
                startActivity(startintent1);
            }
        });

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), profileActivity.class);
                startActivity(startintent);
            }
        });

        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent2 = new Intent(getApplicationContext(), searchActivity.class);
                startActivity(startintent2);
            }
        });
        ArrayList list = new ArrayList(10);






    }
}
