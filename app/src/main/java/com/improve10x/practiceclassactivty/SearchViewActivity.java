package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivitySearchViewBinding;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {

    private ActivitySearchViewBinding binding;
    ArrayList<String> list;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("SearchView");
        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");
        list.add("Lychee");
        list.add("Gavava");
        list.add("Peech");
        list.add("Melon");
        list.add("Watermelon");
        list.add("Papaya");
        handleSearchView();
    }

    private void handleSearchView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        binding.listView.setAdapter(arrayAdapter);
        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (list.contains(query)) {
                    arrayAdapter.getFilter().filter(query);
                } else {
                    Toast.makeText(SearchViewActivity.this, "No Match Found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }
}