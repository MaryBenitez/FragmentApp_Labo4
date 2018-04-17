package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView name_sailor;
    TextView don_sailor;
    TextView frase_sailor;
    ImageView imageS;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        //colocando los id del textview e imageview en las variables
        name_sailor = view.findViewById(R.id.name_sailor);
        don_sailor = view.findViewById(R.id.don_sailor);
        frase_sailor = view.findViewById(R.id.frase_sailor);
        imageS = view.findViewById(R.id.imgId);
        Bundle bundle = this.getArguments();

        if(bundle != null){
            //creando objeto
            SailorPlanet sailor = (SailorPlanet)bundle.getSerializable("SAILOR");
            Toast.makeText(getActivity(), "Item: " + sailor.getname(), Toast.LENGTH_SHORT).show();

            //setenando strings e imagen
            name_sailor.setText(sailor.getname());
            don_sailor.setText(sailor.getDon());
            frase_sailor.setText(sailor.getFrase());
            imageS.setImageResource(sailor.getimg());
        }

        return view;
    }
}
