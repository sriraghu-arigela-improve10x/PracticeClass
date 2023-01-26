package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.improve10x.practiceclassactivty.databinding.ActivityProgressBarBinding;

public class ProgressBarActivity extends AppCompatActivity {
    
    private ActivityProgressBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleProgressBtn();
    }

    private void handleProgressBtn() {
            binding.downloadingBtn.setOnClickListener(view -> {
                binding.progressbarGroup.setVisibility(View.VISIBLE);
            });
            binding.progressbarGroup.setVisibility(View.GONE);
    }
}