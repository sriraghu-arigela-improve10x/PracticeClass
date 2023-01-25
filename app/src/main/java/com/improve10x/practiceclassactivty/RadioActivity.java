package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivityRadioBinding;

public class RadioActivity extends AppCompatActivity {

    private ActivityRadioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("RadioButton");
        showRadioButton();
    }

    private void showRadioButton() {
        binding.submitBtn.setOnClickListener(view -> {
            if(binding.radioButton2.isChecked()) {
                Toast.makeText(this, "Cricket", Toast.LENGTH_SHORT).show();
            }
            if(binding.radioButton3.isChecked()) {
                Toast.makeText(this, "Volley Boll ", Toast.LENGTH_SHORT).show();
            }
            if(binding.radioButton4.isChecked()) {
                Toast.makeText(this, "Kabaddi", Toast.LENGTH_SHORT).show();
            }
            if(binding.radioButton5.isChecked()) {
                Toast.makeText(this, "Shuttle", Toast.LENGTH_SHORT).show();
            }
        });
    }
}