package org.techtown.displaytest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import org.techtown.displaytest.R;


public class TabFragment2 extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_tab_2, null) ;
        String[] items = {"item1","item2","item3"};
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, items);

        ListView listview = (ListView) view.findViewById(R.id.listview_tab2) ;
        listview.setAdapter(adapter) ;
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                String strText=(String) parent.getItemAtPosition(position);

                Toast.makeText(getContext().getApplicationContext(),strText, Toast.LENGTH_SHORT).show();
            }

        });

        return view;

    }
}

