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

    ArrayList<kres> listakresow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategoria);
        lista = findViewById(R.id.kresylista);
        kategoriaW = findViewById(R.id.kategoriatext);
        String kategoria = getIntent().getExtras().get(MainAc.KATEGORIA).toString();
        kategoriaW.setText(kategoria);

        int idKategoria;
        switch (kategoria)
        {
            case "naturalne":
                idKategoria =0;
                break;
            case "sztuczne":
                idKategoria=1;
                break;
            default:
                idKategoria =-1;
                break;
        }
        listakresow = Irepozytorium.getkresyatkategoria(idKategoria);
        ArrayAdapter <kres> przepisArrayAdapter=
                new ArrayAdapter<kres>(
                        this,
                        android.R.layout.simple_list_item_1,
                        listakresow
                );
        lista.setAdapter(przepisArrayAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                klik(listakresow.get(i).getId());
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