package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.practiceclassactivty.databinding.ActivityMultiAutoCompleteTextViewBinding;

public class MultiAutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityMultiAutoCompleteTextViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMultiAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("MultiAutoCompleteTextView");
    }
}