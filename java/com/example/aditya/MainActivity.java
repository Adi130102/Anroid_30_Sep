package com.example.aditya;

import static android.widget.ListView.*;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.ContextMenu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    RelativeLayout relativeLayout;
    ListView listView;
    String contacts[]={"Aditya","Dhyey","Aayush","Ritik","Faiz","Dhruva","Madhvi","Delcy","Diya"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.textview1);
        relativeLayout=findViewById(R.id.layout1);

        registerForContextMenu(textView);

        listView=(ListView) findViewById(R.id.listview1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,contacts);
        listView.setAdapter(adapter);

    }

    public  void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
    super.onCreateContextMenu(menu,v,menuInfo);
    menu.setHeaderTitle("Choose a color");
        menu.add(0,v.getId(),0,"Yellow");
        menu.add(0,v.getId(),0,"Grey");
        menu.add(0,v.getId(),0,"Cyan");
    }

    public boolean onContextItemSelected(MenuItem item){
        if (item.getTitle()=="Yellow"){
            relativeLayout.setBackgroundColor(Color.YELLOW);
        }else if (item.getTitle()=="Grey"){
            relativeLayout.setBackgroundColor(Color.GRAY);
        }else if (item.getTitle()=="Cyan"){
            relativeLayout.setBackgroundColor(Color.CYAN);
        }
    return true;
    }

}