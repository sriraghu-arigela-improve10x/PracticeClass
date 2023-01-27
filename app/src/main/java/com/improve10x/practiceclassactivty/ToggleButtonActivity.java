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
            String result = gettingTheData(status1, status2);
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });
    }

    private String gettingTheData(String status1, String status2) {
        String statusCheck = "button1 :" + status1 + "\n";
        String statusCheck2 = "button2 :" + status2;
        String data = statusCheck += statusCheck2;
        return data;
    }
}