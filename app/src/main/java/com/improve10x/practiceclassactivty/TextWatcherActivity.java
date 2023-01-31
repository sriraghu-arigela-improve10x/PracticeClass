package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivityTextWatcherBinding;

import java.util.ArrayList;

public class TextWatcherActivity extends AppCompatActivity {

    private ActivityTextWatcherBinding binding;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Text Watcher");
        arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Pineapple");
        arrayList.add("Orange");
        arrayList.add("Papaya");
        arrayList.add("Melon");
        arrayList.add("Grapes");
        arrayList.add("Water Melon");
        arrayList.add("Lychee");
        arrayList.add("Guava");
        arrayList.add("Mango");
        arrayList.add("Kivi");
        handleFruitsTextWatcherLv();
    }

    private void handleFruitsTextWatcherLv() {
        adapter = new ArrayAdapter<>(this, R.layout.text_watcher_item, arrayList);
        binding.listView.setAdapter(adapter);
        binding.editTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adapter.getFilter().filter(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(),"before text change",Toast.LENGTH_LONG).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(getApplicationContext(),"after text change",Toast.LENGTH_LONG).show();
            }
        });
    }
}