package com.example.kres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class KresActivity extends AppCompatActivity {
    kres Kres;
    Button powiadomienie;
    TextView powiadomienia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kres);
        int id = (int)(getIntent().getExtras().get(MainAc.ID));

        powiadomienie = findViewById(R.id.powiadom);
        powiadomienie.setOnClickListener(view -> powiadom());
        Kres = Irepozytorium.kresL.get(id);

        TextView nazwa = findViewById(R.id.nazwaText);
        TextView data = findViewById(R.id.data);
        TextView sila = findViewById(R.id.sila);
        ImageView zdjecie = findViewById(R.id.zdjecie);
        powiadomienia = findViewById(R.id.powiadomienia);
        nazwa.setText(Kres.getNazwa());
        data.setText(Kres.getData());
        sila.setText(Integer.toString(Kres.getSila()) );
        zdjecie.setImageResource(Kres.getIdObrazka());
        powiadomienia.setText(Integer.toString(Kres.getPowiadomieni()));

    }

    private void powiadom() {
        Kres.addPowiadomieni();
        powiadomienia.setText(Integer.toString(Kres.getPowiadomieni()));


    }
}