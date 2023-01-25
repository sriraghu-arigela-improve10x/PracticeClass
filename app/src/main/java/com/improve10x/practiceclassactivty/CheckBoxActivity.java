package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.practiceclassactivty.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CheckBox");
    }
}