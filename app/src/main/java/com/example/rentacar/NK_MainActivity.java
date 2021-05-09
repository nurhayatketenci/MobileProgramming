package com.example.rentacar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class NK_MainActivity extends AppCompatActivity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            Bundle nk_b = data.getExtras();
            nk_bm = (Bitmap) nk_b.get("data");
            nk_carimage.setImageBitmap(nk_bm);
        }
    }

    EditText nk_carName ,nk_modelYear,nk_dailyPrice, nk_description;
    Spinner nk_brand,nk_color;
    ArrayList <NK_CAR> nk_cars;
    Button nk_list,nk_image;
    RadioButton nk_1,nk_2;
    ImageView nk_carimage;
    Bitmap nk_bm;
    ArrayList<String> nk_radio, nk_checkbox;
    CheckBox nk_cb,nk_cb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nk_carName=findViewById(R.id.nk_txtdetail_carName);
        nk_modelYear=findViewById(R.id.nk_txt_modelYear);
        nk_dailyPrice=findViewById(R.id.nk_txt_dailyPrice);
        nk_description=findViewById(R.id.nk_txt_description);
        nk_brand=findViewById(R.id.nk_spinner_brand);
        nk_color=findViewById(R.id.nk_spinner_color);
        nk_image=findViewById(R.id.nk_btn_car_image);
        nk_carimage=findViewById(R.id.nk_imageView_car_image);
        nk_1=findViewById(R.id.nk_rdb_km2);
        nk_2=findViewById(R.id.nk_rdb_km);
        nk_cb=findViewById(R.id.nk_checkBox_day);
        nk_cb2=findViewById(R.id.nk_checkBox2_day2);
        nk_cars=new ArrayList<>();
        nk_checkbox=new ArrayList<>();
        nk_radio = new ArrayList<>();
        nk_list=findViewById(R.id.nk_btn_listview);
        nk_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nk_1.isChecked()){
                    nk_radio.add("100-200 km");
            }else{
                    nk_radio.remove("100-200 km");
                }
            }
        });
        nk_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nk_2.isChecked()){
                    nk_radio.add("50-100 km");
                }else{
                    nk_radio.remove("50-100 km");
                }
            }
        });
        nk_cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nk_cb.isChecked()){
                    nk_checkbox.add("0-1 Ay ");
                }else{
                    nk_checkbox.remove("0-1 Ay");
                }
            }
        });
        nk_cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nk_cb2.isChecked()){
                    nk_checkbox.add("1-5 Ay ");
                }else{
                    nk_checkbox.remove("1-5 Ay");
                }
            }
        });

        nk_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nk_intent=new Intent(NK_MainActivity.this, NK_ListActive.class);

                NK_Database.nk_mycars=nk_cars;
                startActivity(nk_intent);
            }
        });

        nk_image.setOnClickListener(new View.OnClickListener() {
             @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
             @Override
             public void onClick(View view) {
                 Intent nk_intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                 startActivityForResult(nk_intent,1 );
             }
         });
    }



    public void nk_car_add(View view) {
        for(String nk_radio_ol : nk_radio) {
            for (String nk_checkb : nk_checkbox) {
                nk_cars.add(new NK_CAR(nk_carName.getText().toString(), nk_radio_ol, nk_checkb,Integer.parseInt(nk_modelYear.getText().toString())
                        , Double.parseDouble(nk_dailyPrice.getText().toString()),
                        nk_description.getText().toString(), nk_brand.getSelectedItem().toString(),
                        nk_color.getSelectedItem().toString(), nk_bm));
            }
        }
        Toast.makeText(getApplicationContext(),
                "Ürün sayısı:"+nk_cars.size()+"eklenen arac:"+nk_cars.get(nk_cars.size()-1).getNk_carName(),Toast.LENGTH_LONG).show();
    }
}