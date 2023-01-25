package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivitySeekbarBinding;

public class SeekbarActivity extends AppCompatActivity {
    
    private ActivitySeekbarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekbarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showSeekBar();
    }

    private void showSeekBar() {
        binding.submitBtn.setOnClickListener(view -> {
            int progress = binding.seekBar.getProgress();
            Toast.makeText(this, String.valueOf(progress), Toast.LENGTH_SHORT).show();
        });
    }
}