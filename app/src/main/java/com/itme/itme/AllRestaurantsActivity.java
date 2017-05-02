package com.itme.itme;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AllRestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_restaurants);

        ConstraintLayout restaurant1 = (ConstraintLayout) findViewById(R.id.constraintLayout0);
        restaurant1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AllRestaurantsActivity.this, RestaurantPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
