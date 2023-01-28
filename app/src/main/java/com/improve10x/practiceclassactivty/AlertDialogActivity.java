package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivityAlertDialogBinding;

public class AlertDialogActivity extends AppCompatActivity {

    private ActivityAlertDialogBinding binding;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("AlertDialog");
        builder = new AlertDialog.Builder(this);
        handleCloseBtn();
    }

    private void handleCloseBtn() {
        binding.closeAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Welcome to Alert Dialog").setTitle("Alert Dialog");
                builder.setMessage("Do you want to close this application?")
                        .setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                Toast.makeText(AlertDialogActivity.this, "\"You choose yes action for AlertBox\"", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertDialogActivity.this, "you choose no action for alertbox", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("AlertDialogMessage");
                alertDialog.show();
            }
        });
    }
}