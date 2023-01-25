package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivityToastBinding;

public class ToastActivity extends AppCompatActivity {

    private ActivityToastBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToastBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("toast");
        showToastMessage();
    }

    private void showToastMessage() {
        Toast.makeText(this, "Hello Android", Toast.LENGTH_SHORT).show();
    }
}