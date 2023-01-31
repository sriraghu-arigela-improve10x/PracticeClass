package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import com.improve10x.practiceclassactivty.databinding.ActivitySearchViewToolBarBinding;

import java.util.ArrayList;

public class SearchViewToolBarActivity extends AppCompatActivity {

    private ActivitySearchViewToolBarBinding binding;
    private ArrayList<String> fruitsList;
    private ArrayAdapter<String> adapter;
    private MenuItem searchItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewToolBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        setSearchViewOnToolBar();
    }

    private void setData() {
        fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Pineapple");
        fruitsList.add("Orange");
        fruitsList.add("Lychee");
        fruitsList.add("Gavava");
        fruitsList.add("Peech");
        fruitsList.add("Melon");
        fruitsList.add("Watermelon");
        fruitsList.add("Papaya");
    }

    private void setSearchViewOnToolBar() {
        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,fruitsList);
        binding.dynamicLv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        searchItem = menu.findItem(R.id.search_bar_menu);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                if(fruitsList.contains(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(SearchViewToolBarActivity.this, "No Match Found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}