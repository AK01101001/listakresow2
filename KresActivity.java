package com.example.kres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class KresActivity extends AppCompatActivity {

    Button powiadomienie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kres);
        int id = (int)(getIntent().getExtras().get(MainAc.ID));
        powiadomienie = findViewById(R.id.powiadom);
    }
}