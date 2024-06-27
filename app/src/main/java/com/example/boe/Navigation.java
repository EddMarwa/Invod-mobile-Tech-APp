package com.example.boe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.boe.databinding.ActivityNavigationBinding;

public class Navigation extends AppCompatActivity {
    ActivityNavigationBinding binding;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*binding.bottom_navigation.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){



            }
        });*/


    }
}
