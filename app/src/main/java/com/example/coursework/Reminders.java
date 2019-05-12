package com.example.coursework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Reminders extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
// Name of variables

    private EditText itemET;
    private Button btn;
    private ListView itemsList;

    private ArrayList<String> items;
    private ArrayAdapter<String>adapter;


    @Override
protected void onCreate(Bundle savedInstaneState) {
    super.onCreate(savedInstaneState);
    setContentView(R.layout.activity_reminders);
// Gives buttons and lists identifiers linked to their Id

    itemET = findViewById(R.id.item_edit_text);
    btn= findViewById(R.id.add_btn);
    itemsList =findViewById(R.id.items_list);

    items = FileHelper.readData(this);

    adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
    itemsList.setAdapter(adapter);


 btn.setOnClickListener(this);
 itemsList.setOnItemClickListener(this);
    }
    // when the add reminder button is selected, it will add whatever data that was entered into the edit text box is stored in the file helper file and displayed on the first available space on the list on screen

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.add_btn:
                String itemEntered = itemET.getText().toString();
                adapter.add(itemEntered);
                itemET.setText("");
                FileHelper.writeData(items, this);
                Toast.makeText(this, "Item added", Toast.LENGTH_SHORT).show();

                break;
        }
    }
// When an item is clicked on the list it deletes it and the message appears saying deleted

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        items.remove(position);
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Deleted",Toast.LENGTH_SHORT).show();
    }
}