package com.example.nfnt.fragment_week2;

/**
 * Created by NFNT on 9/17/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NabiListFragment extends ListFragment {

    static interface Listener{
        void itemClicked(long id);
    }
    private Listener listener;

    public NabiListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Nabi.kisahnabi.length];
        for (int i=0; i<names.length; i++) {
            names[i] = Nabi.kisahnabi[i].getNama_nabi();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);

    }
    @ Override
    public void onAttach ( Context context ) {
        super . onAttach ( context );
        this . listener = (Listener) context ;
    }
    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        if(listener != null)
        {
            listener.itemClicked(id);
        }
    }

}
