package com.itme.itme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.nio.BufferUnderflowException;

public class RestaurantPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_page);

        Button Button_Order = (Button) findViewById(R.id.button_order);
        Button_Order.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(RestaurantPageActivity.this, OrderSeclectionActivity.class);
                startActivity(intent);
            }
        });
    }
}
