package com.itme.itme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderSeclectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_seclection);

        Button Button_Menu = (Button) findViewById(R.id.button_menu);
        Button_Menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OrderSeclectionActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        Button Button_Dish = (Button) findViewById(R.id.button_dish);
        Button_Dish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OrderSeclectionActivity.this, DishSelectionActivity.class);
                startActivity(intent);
            }
        });

        Button Button_Dessert = (Button) findViewById(R.id.button_dessert);
        Button_Dessert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OrderSeclectionActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        Button Button_Beverage = (Button) findViewById(R.id.button_beverage);
        Button_Beverage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OrderSeclectionActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        Button Button_Terminate = (Button) findViewById(R.id.button_terminate);
        Button_Terminate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OrderSeclectionActivity.this, RecapActivity.class);
                startActivity(intent);
            }
        });
    }
}
