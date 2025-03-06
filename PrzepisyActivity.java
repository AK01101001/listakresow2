package com.example.kresy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PrzepisyActivity extends AppCompatActivity {
    public class MainActivity extends AppCompatActivity {
        ListView lista;
        TextView kategoriaW;
        String kategoria;
        ArrayList<kresy> listakresow;
        ArrayAdapter<kresy> adapter;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.przepisyactivity_main);

            lista = findViewById(R.id.lista);
            kategoriaW = findViewById(R.id.kategoria);
            kategoria = getIntent().getExtras().getString("kategoria");
            kategoriaW.setText(kategoria);
            listakresow = repozytorium.kresy;
            adapter = new ArrayAdapter<>(
                    PrzepisyActivity.this,android.R.layout.simple_list_item_1,listakresow
            );
            lista.setAdapter(adapter);
            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                klik(i);
            }
        });
    }

    private void klik(int i)
    {

    }
    }
}