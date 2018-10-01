package com.example.nfnt.fragment_week2;

/**
 * Created by NFNT on 9/17/2018.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static  com.example.nfnt.fragment_week2.Nabi.kisahnabi;


/**
 * A simple {@link Fragment} subclass.
 */
public class NabiDetailFragment extends Fragment {

    private long resepId;
    public NabiDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resep_detail, container, false);
    }

    public void setResep(long id) {
        this.resepId = id;
    }
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textJudul);
            Nabi resepmakanan = Nabi.kisahnabi[(int) resepId];

            title.setText(resepmakanan.getNama_nabi());

            TextView description = (TextView) view.findViewById(R.id.textDetail);
            description.setText(resepmakanan.getDeskripsi());

        } }
}

