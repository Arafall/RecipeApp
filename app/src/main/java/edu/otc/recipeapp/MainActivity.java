package edu.otc.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button openRecipeDetails = findViewById(R.id.btn_viewRecipe);
        openRecipeDetails.setOnClickListener(v -> {
            Intent activity = new Intent(MainActivity.this, RecipeDetails.class);
            startActivity(activity);
        });

    }
}