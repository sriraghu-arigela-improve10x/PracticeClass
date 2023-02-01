package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.practiceclassactivty.databinding.ActivityCustomCheckBoxBinding;

public class CustomCheckBoxActivity extends AppCompatActivity {

    private ActivityCustomCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CustomCheckBox");
    }
}