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
            int a = Integer.parseInt(value);
            int b = Integer.parseInt(value1);
            int sum = a + b;
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }
}