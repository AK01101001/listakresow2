package com.example.kresy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView lista;
public static String KATEGORIA = "kategoria";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lista);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                klik(i);
            }
        });
    }

    private void klik(int i)
    {
        Intent intent = new Intent(MainActivity.this,PrzepisyActivity.class);
        String kategoria = lista.getItemAtPosition(i).toString();
        intent.putExtra(KATEGORIA,kategoria);
        startActivity(intent);
    }
}