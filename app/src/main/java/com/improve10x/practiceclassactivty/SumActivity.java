package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivityMainBinding;
import com.improve10x.practiceclassactivty.databinding.ActivitySumBinding;

public class SumActivity extends AppCompatActivity {

    private ActivitySumBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Sum Activity");
        findSum();
    }

    private void findSum() {
        binding.addBtn.setOnClickListener(view -> {
            String value = binding.sum1Txt.getText().toString();
            String value1 = binding.sum2Txt.getText().toString();
            String result = add(value, value1);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String value, String value1) {
        int a = Integer.parseInt(value);
        int b = Integer.parseInt(value1);
        int sum = a + b;
        return String.valueOf(sum);
    }
}