package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ToggleButton;

import com.improve10x.practiceclassactivty.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sumBtn();
        toastBtn();
        customToast();
        toggleButton();
        radioButton();
    }

    private void radioButton() {
        binding.radioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioActivity.class);
            startActivity(intent);
        });
    }

    private void toggleButton() {
        binding.toggleBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });
    }

    private void customToast() {
        binding.customToastBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });
    }

    private void toastBtn() {
        binding.toastBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToastActivity.class);
            startActivity(intent);
        });
    }

    private void sumBtn() {
        binding.sumBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SumActivity.class);
            startActivity(intent);
        });
    }
}