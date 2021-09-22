package com.example.ac1ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import models.PontoTuristicoModel;

public class DetalhesActivity extends AppCompatActivity {
    PontoTuristicoModel pontoTuristico;
    TextView txtNome;
    TextView txtDescricao;
    ImageView img1, img2, img3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        Intent i = getIntent();
        pontoTuristico = (PontoTuristicoModel)i.getSerializableExtra("pontoTuristico");
        txtNome = (TextView) findViewById(R.id.txtNomeDet);
        txtNome.setText(pontoTuristico.getNome());

        txtDescricao = (TextView) findViewById(R.id.txtDescricaoDet);
        txtDescricao.setText(pontoTuristico.getDescricao());

        img1 = (ImageView) findViewById(R.id.imgDet1);
        int imageResource = getResources().getIdentifier("@drawable/"+ pontoTuristico.getFoto1(),null, this.getPackageName());
        img1.setImageResource(imageResource);
        //img1.setImageResource(R.drawable.jardim2);

        img2 = (ImageView) findViewById(R.id.imgDet2);
        int imageResource2 = getResources().getIdentifier("@drawable/"+ pontoTuristico.getFoto2(),null, this.getPackageName());
        img2.setImageResource(imageResource2);

        img3 = (ImageView) findViewById(R.id.imgDet3);
        int imageResource3 = getResources().getIdentifier("@drawable/"+ pontoTuristico.getFoto3(),null, this.getPackageName());
        img3.setImageResource(imageResource3);


    }
    public void btnAbrirMapaClick(View view){
        String end = pontoTuristico.getLocalizacao();
        Uri uri = Uri.parse("geo:0,0?q=" + end);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnNavegarMapaClick(View view){
        String end = pontoTuristico.getLocalizacao();
        Uri uri = Uri.parse("google.navigation:q=" + end);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void btnNavegacaoClick(View view){
        String site = pontoTuristico.getSite();
        Uri uri = Uri.parse(site);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}