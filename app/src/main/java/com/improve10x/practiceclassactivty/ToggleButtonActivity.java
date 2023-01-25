package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.improve10x.practiceclassactivty.databinding.ActivityToggleButtonActiviyBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    private ActivityToggleButtonActiviyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleButtonActiviyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        toggleButton();
    }

    private void toggleButton() {
        binding.submitBtn.setOnClickListener(view -> {
            String status1 = binding.toggle1Btn.getText().toString();
            String status2 = binding.toggle2Btn.getText().toString();
            Toast.makeText(this, "toggleButton1 " + status1 + "\ntoggleButton2 " + status2, Toast.LENGTH_LONG).show();
        });
    }
}