package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CheckBox");
        showCheckBox();
    }

    private void showCheckBox() {
        binding.orderBtn.setOnClickListener(view -> {
            int totalAmount = 0;
            StringBuilder result = new StringBuilder();
            result.append("Select Items:");
            if(binding.checkBox.isChecked()) {
                result.append("\nPizza 100Rs");
                totalAmount += 100;
            }
            if(binding.checkBox2.isChecked()) {
                result.append("\nCoffe 50Rs");
                totalAmount += 50;
            }
            if(binding.checkBox3.isChecked()) {
                result.append("\nBurger 120Rs");
                totalAmount += 120;
            }
            result.append("\nTotal: "+ totalAmount +"Rs");
            Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();

        });
    }
}