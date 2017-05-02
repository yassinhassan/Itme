package com.itme.itme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DishSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_selection);

        ImageButton Button_Add = (ImageButton) findViewById(R.id.imageButton_Add);
        Button_Add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DishSelectionActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Button_Info = (ImageButton) findViewById(R.id.imageButton_Info);
        Button_Info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DishSelectionActivity.this, ItemPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
