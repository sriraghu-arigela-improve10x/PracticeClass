package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.practiceclassactivty.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sumBtn();
        toastBtn();
        customToast();
        toggleButton();
        radioButton();
        checkBoxBtn();
        ratingBarBtn();
        seekBarBtn();
        datePickerBtn();
        timePickerBtn();
        progressBarBtn();
        verticalScrollView();
        horizontalScrollView();
        imageSwitcher();
        alertDialog();
        progressDialog();
        webView();
        spinner();
        customAlertDialog();
    }

    private void customAlertDialog() {
        binding.customAlertDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomAlertDialogActivity.class);
            startActivity(intent);
        });
    }

    private void spinner() {
        binding.spinnerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });
    }

    private void webView() {
        binding.webviewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebViewActivity.class);
            startActivity(intent);
        });
    }

    private void progressDialog() {
        binding.progrssDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProgressDialogActivity.class);
            startActivity(intent);
        });
    }

    private void alertDialog() {
        binding.alertDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AlertDialogActivity.class);
            startActivity(intent);
        });
    }

    private void imageSwitcher() {
        binding.imageSwitcherBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ImageSwitcher.class);
            startActivity(intent);
        });
    }

    private void horizontalScrollView() {
        binding.horizontalScrollView.setOnClickListener(view -> {
            Intent intent = new Intent(this, HorizontalScrollView.class);
            startActivity(intent);
        });
    }

    private void verticalScrollView() {
        binding.verticalScrollViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, VerticalScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void progressBarBtn() {
        binding.progressBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProgressBarActivity.class);
            startActivity(intent);
        });
    }

    private void timePickerBtn() {
        binding.timePickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
    }

    private void datePickerBtn() {
        binding.datepickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
    }

    private void seekBarBtn() {
        binding.seekbarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SeekbarActivity.class);
            startActivity(intent);
        });
    }

    private void ratingBarBtn() {
        binding.ratingbarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });
    }

    private void checkBoxBtn() {
        binding.checkBoxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }

    private void radioButton() {
        binding.radioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioActivity.class);
            startActivity(intent);
        });
    }

    private void toggleButton() {
        binding.toggleBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });
    }

    private void customToast() {
        binding.customToastBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });
    }

    private void toastBtn() {
        binding.toastBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToastActivity.class);
            startActivity(intent);
        });
    }

    private void sumBtn() {
        binding.sumBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SumActivity.class);
            startActivity(intent);
        });
    }
}