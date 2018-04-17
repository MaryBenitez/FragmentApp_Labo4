package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView name_sailor;
    TextView don_sailor;
    TextView frase_sailor;
    ImageView imageS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //colocando los id del textview e imageview en las variables
        name_sailor = findViewById(R.id.name_sailor);
        don_sailor = findViewById(R.id.don_sailor);
        frase_sailor = findViewById(R.id.frase_sailor);
        imageS = findViewById(R.id.imgId);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }

    }

    private void handleReceivedText(Intent intent){

        //creando objeto
        SailorPlanet sailor = (SailorPlanet)intent.getSerializableExtra("SAILOR");

        //condicion para que aparezca el strings e imagen
        if (name_sailor != null) {
            name_sailor.setText(sailor.getname());
        }
        if (don_sailor != null) {
            don_sailor.setText(sailor.getDon());
        }
        if (frase_sailor != null) {
            frase_sailor.setText(sailor.getFrase());
        }
        if (imageS != null){
            imageS.setImageResource(sailor.getimg());
        }
    }
}
