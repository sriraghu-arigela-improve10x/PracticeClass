package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.improve10x.practiceclassactivty.databinding.ActivityCustomAlertDialogBinding;
import com.improve10x.practiceclassactivty.databinding.CustomItemBinding;

public class CustomAlertDialogActivity extends AppCompatActivity {
    
    private ActivityCustomAlertDialogBinding binding;
    private Dialog dialog;
    private CustomItemBinding customItemBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CustomAlertDialog");
        handleCustomAlertDialog();
    }

    private void handleCustomAlertDialog() {
        binding.alertBtn.setOnClickListener(view -> {
            dialog = new Dialog(this);
            customItemBinding = CustomItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(customItemBinding.getRoot());
            customItemBinding.dismissBtn.setOnClickListener(view1 -> {
                finish();
            });
            customItemBinding.closeBtn.setOnClickListener(view1 -> {
                dialog.dismiss();
            });
            customItemBinding.alertMessageTxt.setText("Alert...!!!!!");
            dialog.show();
        });
    }
}