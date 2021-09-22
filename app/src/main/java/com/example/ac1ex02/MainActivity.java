package com.example.ac1ex02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import adapters.PontoTuristicoAdapter;
import fakeDataSetFake.PontoTuristicoDataSetFake;

public class MainActivity extends AppCompatActivity {
    private PontoTuristicoAdapter pontoTuristicoAdapter;
    private RecyclerView recyclerViewPontoTuristico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewPontoTuristico = (RecyclerView)findViewById(R.id.listPontosTuristicos);
        setupRecyclerPontoTuristico();
    }

    public void setupRecyclerPontoTuristico(){
        //configurando o layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewPontoTuristico.setLayoutManager(layoutManager);

        //add adapter
        pontoTuristicoAdapter = new PontoTuristicoAdapter(PontoTuristicoDataSetFake.getItens());
        recyclerViewPontoTuristico.setAdapter(pontoTuristicoAdapter);

        //divisor entre linhas
        recyclerViewPontoTuristico.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}