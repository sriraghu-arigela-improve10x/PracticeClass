package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.improve10x.practiceclassactivty.R;
import com.improve10x.practiceclassactivty.databinding.ActivityProgressDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {

    private ActivityProgressDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("ProgressDialog");
        handleProgressDialog();
    }

    private void handleProgressDialog() {
        binding.button1.setOnClickListener(view -> {
            ProgressDialog builder = new ProgressDialog(this);
            builder.setTitle("This is Title");
            builder.setMessage("This is Message");
            builder.show();
        });
    }
}