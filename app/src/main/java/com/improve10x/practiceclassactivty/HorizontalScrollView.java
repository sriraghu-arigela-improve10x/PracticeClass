package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.practiceclassactivty.databinding.ActivityHorizentalScrollViewBinding;

public class HorizontalScrollView extends AppCompatActivity {

    private ActivityHorizentalScrollViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHorizentalScrollViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}