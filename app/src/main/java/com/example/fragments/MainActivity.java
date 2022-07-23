package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Fragment 1 call ke liye
        Button button1call = findViewById(R.id.button1);
        button1call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()           // yaha par jis class par jana hai us call ka name.class likhana
                        .replace(R.id.fragmentContainerViewid,Fragment1.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();

            }
        });

         //Fragment 2 call ke liye
        Button button2call = findViewById(R.id.button2);
        button2call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()          // yaha par jis class par jana hai us call ka name.class likhana
                        .replace(R.id.fragmentContainerViewid,Fragment2.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();

            }
        });

        //Fragment 3 call ke liye

        Button button3call = findViewById(R.id.button3);
        button3call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()          // yaha par jis class par jana hai us call ka name.class likhana
                        .replace(R.id.fragmentContainerViewid,Fragment3.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();

            }
        });


    }
}