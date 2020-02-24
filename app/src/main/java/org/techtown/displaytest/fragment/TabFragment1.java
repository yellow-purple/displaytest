package org.techtown.displaytest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.techtown.displaytest.R;
import org.techtown.displaytest.adapter.ListViewAdapter;


public class TabFragment1 extends Fragment {


    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_tab_1, null) ;

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView listview ;
        final ListViewAdapter adapter = new ListViewAdapter() ;


        listview = (ListView) getView().findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        adapter.addItem("Brightness Observer", "If the briteness is 80% or more, \na warning message is displayed.") ;
        adapter.addItem("Volume Observer", "If the volume of audio is 70% or more,\na warning message is displayed.") ;
        adapter.addItem("third_view") ;
        adapter.addItem("just text view") ;
        adapter.addItemno("1two text view","lalalalalalalala") ;
        adapter.addItemno("t2wo text view","lalalalalalalala") ;
        adapter.addItemno("tw3o text view","lalalalalalalala") ;
        adapter.addItemno("4two text view","lalalalalalalala") ;
        adapter.addItemno("t5wo text view","lalalalalalalala") ;
        adapter.addItemno("6two text view","lalalalalalalala") ;
        adapter.addItemno("7two text view","lalalalalalalala") ;
        adapter.addItemno("8two text view","lalalalalalalala") ;
        adapter.addItemno("9two text view","lalalalalalalala") ;
        adapter.addItemno("10two text view","lalalalalalalala") ;
        adapter.addItemno("t11wo text view","lalalalalalalala") ;
        adapter.addItemno("12two text view","lalalalalalalala") ;
        adapter.addItemno("13two text view","lalalalalalalala") ;
        adapter.addItemno("14two text view","lalalalalalalala") ;
        adapter.addItemno("t15wo text view","lalalalalalalala") ;
        adapter.addItemno("t16wo text view","lalalalalalalala") ;
        adapter.addItemno("t17wo text view","lalalalalalalala") ;
        adapter.addItemno("t18wo text view","lalalalalalalala") ;
        adapter.addItemno("t19wo text view","lalalalalalalala") ;

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                String text = adapter.getItemViewTitle(position);


                Toast.makeText(getContext().getApplicationContext(),text, Toast.LENGTH_SHORT).show();
            }

        });



    }
}


