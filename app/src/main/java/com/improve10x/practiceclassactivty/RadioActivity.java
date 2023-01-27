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
        handleRadioButton();
    }

    private void handleRadioButton() {
        binding.submitBtn.setOnClickListener(view -> {
            boolean isCricketChecked = binding.cricketBtn.isChecked();
            boolean isVolleyBallChecked = binding.volleyballBtn.isChecked();
            boolean isKabaddiChecked = binding.kabaddiBtn.isChecked();
            boolean isShuttleChecked = binding.shuttleBtn.isChecked();
            String result = getSelectedHobbyName(isCricketChecked, isVolleyBallChecked, isKabaddiChecked, isShuttleChecked);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }

    private String getSelectedHobbyName(boolean isCricketChecked, boolean isVolleyBallChecked, boolean isKabaddiChecked, boolean isShuttleChecked) {
        String result = "Select Hobby :";
        if(isCricketChecked) {
            result += "Cricket";
        }
        if(isVolleyBallChecked) {
            result += "Volly Ball";
        }
        if(isKabaddiChecked) {
            result += "Kabaddi";
        }
        if (isShuttleChecked) {
            result += "shuttle";
        }
        return result;
    }
}

