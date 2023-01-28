package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.practiceclassactivty.databinding.ActivitySpinnerBinding;

public class SpinnerActivity extends AppCompatActivity {

    private ActivitySpinnerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Spinner");
        handleSpinner();
    }

    private void handleSpinner() {
    }
}