package com.example.rentacar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NK_ListActive extends AppCompatActivity {
    ListView nk_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_active);
        nk_list=findViewById(R.id.nk_list);
        ArrayList<NK_CAR> nk_cars= NK_Database.nk_mycars;
        //ArrayList<NK_CAR> cars=(ArrayList<NK_CAR>) getIntent().getSerializableExtra("Arabalar");
        Toast.makeText(NK_ListActive.this,nk_cars.get(0).getNk_carName(),Toast.LENGTH_SHORT).show();

        NK_CarAdapter carAdapter=new NK_CarAdapter(NK_ListActive.this,0,nk_cars);
        nk_list.setAdapter(carAdapter);
    }
}