package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
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
        handleOrder();
    }

    private void handleOrder() {
        binding.orderBtn.setOnClickListener(view -> {
            CheckBox pizzaCb = findViewById(R.id.pizza_cb);
            CheckBox coffeeCb = findViewById(R.id.coffee_cb);
            CheckBox burgerCb = findViewById(R.id.burger_cb);
            boolean isPizzaChecked = pizzaCb.isChecked();
            boolean isCoffeeChecked = coffeeCb.isChecked();
            boolean isBurgerChecked = burgerCb.isChecked();
            String orderDetails = placeOrder(isPizzaChecked, isCoffeeChecked, isBurgerChecked);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();
        });
    }

    private String placeOrder(boolean isPizzaChecked, boolean isCoffeeChecked, boolean isBurgerChecked) {
        int totalAmount = 0;
        String result= ("Select Items:");
        if (isPizzaChecked) {
            result +="\nPizza 100Rs";
            totalAmount += 100;
        }
        if (isCoffeeChecked) {
            result +="\nCoffee 50Rs";
            totalAmount += 50;
        }
        if (isBurgerChecked) {
            result +="\nBurger 120Rs";
            totalAmount += 120;
        }
        result += "\nTotal: " + totalAmount + "Rs";
        return result;
    }
}


