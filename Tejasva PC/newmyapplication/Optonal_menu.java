package com.example.newmyapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Optonal_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optonal_menu);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

//    public boolean onOptionsItemSelected(MenuItem item)
//    {
//        int id = item.getItemId();
//         Toast.makeText(peekAvailableContext().getApplicationContext(), "done",Toast.LENGTH_SHORT).show();
//       return true;
//    }


    public boolean onOptionsItemSelected(MenuItem item) {
        //this.item = item;

        int id = item.getItemId();
        Toast.makeText(peekAvailableContext().getApplicationContext(), "Select" + id, Toast.LENGTH_SHORT).show();

        switch (id) {
            case R.id.search_menu:
                Toast.makeText(peekAvailableContext().getApplicationContext(), "item 1 selected ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.insert_button:
                Toast.makeText(peekAvailableContext().getApplicationContext(), "item 2 selected ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.delete_button:
                Toast.makeText(peekAvailableContext().getApplicationContext(), "item 3 selected ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.update_button:
                Toast.makeText(peekAvailableContext().getApplicationContext(), "item 4 selected ", Toast.LENGTH_SHORT).show();
                return true;

                default:
                    return true;
//                  return super.onOptionsItemSelected(item);
        }
    }


}