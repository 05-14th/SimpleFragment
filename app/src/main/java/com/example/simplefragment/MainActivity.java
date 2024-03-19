package com.example.simplefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fManager = getSupportFragmentManager();
        Fragment frag = fManager.findFragmentById(R.id.fragmentHolder);
        if(frag == null){
            frag = new WebFragment();
            fManager.beginTransaction()
                    .add(R.id.fragmentHolder, frag)
                    .commit();
        }
    }
}