package com.example.rafaj.fragmentapp;

import android.content.res.Resources;

import java.io.Serializable;

/**
 * Created by maris on 14/4/2018.
 */

public class SailorPlanet implements Serializable {

    private int img;
    private String name;
    private String don;
    private String frase;

    //constructor
    public SailorPlanet(String name, int pos_imagen, Resources str_array){
        this.name = name;

        //tomando los recursos de drawable
        if(pos_imagen==0){
            img = R.drawable.sun;
            don = str_array.getStringArray(R.array.Don)[0];
            frase = str_array.getStringArray(R.array.Frase)[0];
        }
        else if(pos_imagen==1){
            img = R.drawable.mercury;
            don = str_array.getStringArray(R.array.Don)[1];
            frase = str_array.getStringArray(R.array.Frase)[1];
        }
        else if(pos_imagen==2){
            img = R.drawable.venus;
            don = str_array.getStringArray(R.array.Don)[2];
            frase = str_array.getStringArray(R.array.Frase)[2];
        }
        else if(pos_imagen==3){
            img = R.drawable.chibi_moon;
            don = str_array.getStringArray(R.array.Don)[3];
            frase = str_array.getStringArray(R.array.Frase)[3];
        }
        else if(pos_imagen==4){
            img = R.drawable.mars;
            don = str_array.getStringArray(R.array.Don)[4];
            frase = str_array.getStringArray(R.array.Frase)[4];
        }
        else if(pos_imagen==5){
            img = R.drawable.jupiter;
            don = str_array.getStringArray(R.array.Don)[5];
            frase = str_array.getStringArray(R.array.Frase)[5];
        }
        else if(pos_imagen==6){
            img = R.drawable.saturn;
            don = str_array.getStringArray(R.array.Don)[6];
            frase = str_array.getStringArray(R.array.Frase)[6];
        }
        else if(pos_imagen==7){
            img = R.drawable.uranus;
            don = str_array.getStringArray(R.array.Don)[7];
            frase = str_array.getStringArray(R.array.Frase)[7];
        }
        else if(pos_imagen==8){
            img = R.drawable.neptune;
            don = str_array.getStringArray(R.array.Don)[8];
            frase = str_array.getStringArray(R.array.Frase)[8];
        }
        else if(pos_imagen==9){
            img = R.drawable.pluto;
            don = str_array.getStringArray(R.array.Don)[9];
            frase = str_array.getStringArray(R.array.Frase)[9];
        }
    }

    //getter para img
    public int getimg() {
        return img;
    }

    //getter para name
    public String getname() {
        return name;
    }

    //getter para scout
    public String getDon() {
        return don;
    }

    //getter para frase
    public String getFrase() {
        return frase;
    }
}
