package org.techtown.displaytest.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.techtown.displaytest.R;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private static final int ITEM_VIEW_TYPE_STRS = 0 ;
    private static final int ITEM_VIEW_TYPE_IMGS = 1 ;
    private static final int ITEM_VIEW_TYPE_STRSNOSWITCH = 2 ;
    private static final int ITEM_VIEW_TYPE_MAX = 3 ;


    private ArrayList<ListViewItem> listViewItemList = new ArrayList<>() ;


    @Override
    public int getCount() {
        return listViewItemList.size() ;
    }

    @Override
    public int getViewTypeCount() {
        return ITEM_VIEW_TYPE_MAX ;
    }

    @Override
    public int getItemViewType(int position) {
        return listViewItemList.get(position).getType() ;
    }

    public String getItemViewTitle(int position){return listViewItemList.get(position).getTitle();
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        final Context context = parent.getContext();
        final int viewType = getItemViewType(position) ;

        if (convertView == null) {

        }
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

            // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
            ListViewItem listViewItem = listViewItemList.get(position);

            switch (viewType) {
                case ITEM_VIEW_TYPE_STRS:
                    convertView = inflater.inflate(R.layout.listview_item1, parent, false);
                    TextView titleTextView = (TextView) convertView.findViewById(R.id.title) ;
                    TextView descTextView = (TextView) convertView.findViewById(R.id.desc) ;


                    Switch switchView=(Switch)convertView.findViewById(R.id.switch1);
                    switchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                            if(b==true)
                                Toast.makeText(context, "on"+ (position+1), Toast.LENGTH_SHORT).show();
                            else
                                Toast.makeText(context, "off"+(position+1), Toast.LENGTH_SHORT).show();

                        }
                    });
                    titleTextView.setText(listViewItem.getTitle());
                    descTextView.setText(listViewItem.getDesc());
                    break;

                case ITEM_VIEW_TYPE_IMGS:
                    convertView = inflater.inflate(R.layout.listview_item2,parent, false);
                    TextView nameTextView = (TextView) convertView.findViewById(R.id.name) ;
                    nameTextView.setText(listViewItem.getTitle());
                    break;

                case ITEM_VIEW_TYPE_STRSNOSWITCH:
                    convertView = inflater.inflate(R.layout.listview_item3, parent, false);
                    titleTextView = (TextView) convertView.findViewById(R.id.title_noswitch) ;
                    descTextView = (TextView) convertView.findViewById(R.id.desc_noswitch) ;

                    titleTextView.setText(listViewItem.getTitle());
                    descTextView.setText(listViewItem.getDesc());
                    break;
            }

        return convertView;
    }


    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }

    public void addItem(String title, String desc) {
        ListViewItem item = new ListViewItem();

        item.setType(ITEM_VIEW_TYPE_STRS);
        item.setTitle(title);
        item.setDesc(desc);

        listViewItemList.add(item);
    }

    public void addItem(String text) {
        ListViewItem item = new ListViewItem();

        item.setType(ITEM_VIEW_TYPE_IMGS);
//
        item.setTitle(text);

        listViewItemList.add(item);
    }

    public void addItemno(String title, String desc) {
        ListViewItem item = new ListViewItem();

        item.setType(ITEM_VIEW_TYPE_STRSNOSWITCH);
        item.setTitle(title);
        item.setDesc(desc);

        listViewItemList.add(item) ;
    }




}