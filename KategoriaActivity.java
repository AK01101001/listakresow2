package com.example.kres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class KategoriaActivity extends AppCompatActivity {

    ListView lista;
    TextView kategoriaW;

    ArrayList<kresy> listakresow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoria);
        lista = findViewById(R.id.kresylista);
        kategoriaW = findViewById(R.id.kategoriatext);
        String kategoria = getIntent().getExtras().get(MainAc.KATEGORIA).toString();
        kategoriaW.setText(kategoria);
        listakresow = Irepozytorium.kresyL;
        ArrayAdapter <kresy> przepisArrayAdapter=
                new ArrayAdapter<kresy>(
                        this,
                        android.R.layout.simple_list_item_1,
                        Irepozytorium.getprzepisyatkategoria(kategoria)
                );
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                klik(i);
            }
        });

    }

    private void klik(int i)
    {
        Intent intent = new Intent(KategoriaActivity.this, KresActivity.class);
        intent.putExtra(MainAc.ID,i);

        startActivity(intent);
    }
}