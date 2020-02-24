package org.techtown.displaytest.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.techtown.displaytest.R;

public class MainActivity extends AppCompatActivity {
    static final String[] LIST_MENU={"Sam Demo","ICCR Demo","EmLog Tool"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,LIST_MENU);

        ListView listview=(ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                String strText=(String) parent.getItemAtPosition(position);
                if (strText.equals(LIST_MENU[1])){
                    Intent ICCRintent =new Intent(MainActivity.this, ICCRDemoActivity.class);
                    startActivity(ICCRintent);
                }else if(strText.equals(LIST_MENU[0])){
                    Intent SAMintent = new Intent(MainActivity.this, SamDemoActivity.class);
                    startActivity(SAMintent);
                }else{
                    Intent Emintent=new Intent(MainActivity.this, EMdemoActivity.class);
                    startActivity(Emintent);
                }
            }

        });
    }

}
