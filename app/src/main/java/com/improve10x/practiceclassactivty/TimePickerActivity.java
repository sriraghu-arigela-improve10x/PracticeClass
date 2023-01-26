package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.improve10x.practiceclassactivty.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    private ActivityTimePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("TimePicker");
        timePicker();
    }
    @SuppressLint("NewApi")
    private void timePicker() {
        binding.changeTimeBtn.setOnClickListener(view -> {
            binding.timePicker.setIs24HourView(true);
            int hour = binding.timePicker.getHour();
            int minute = binding.timePicker.getMinute();
            binding.currentTimeTxt.setText("Current Time: " + hour+ ":" + minute);
        });
    }
}