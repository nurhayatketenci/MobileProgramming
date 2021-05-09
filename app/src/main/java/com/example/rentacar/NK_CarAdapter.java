package com.example.rentacar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NK_CarAdapter extends ArrayAdapter<NK_CAR> {
    Context context;
    public NK_CarAdapter(@NonNull Context context, int resource, @NonNull List<NK_CAR> objects){
        super(context,resource,objects);
         this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(context);
        convertView=inflater.inflate(R.layout.nk_car_layout,parent,false);
        NK_CAR nk_car=getItem(position);

        TextView nk_carName=convertView.findViewById(R.id.nk_txtdetail_carName);
        TextView nk_dailyPrice=convertView.findViewById(R.id.nk_txtdetail_dailyPrice);
        TextView nk_description=convertView.findViewById(R.id.nk_txtdetail_description);
        Button nk_carRent=convertView.findViewById(R.id.nk_btndetail_carRent);
        ImageView nk_image = convertView.findViewById(R.id.nk_imageView2);
        TextView nk_color=convertView.findViewById(R.id.nk_txtDetail_color);
        TextView nk_brand=convertView.findViewById(R.id.nk_txtDetail_brand);
        TextView nk_radios =convertView.findViewById(R.id.nk_txtDetail_km);
        TextView nk_check = convertView.findViewById(R.id.nk_txtDetail_time);

        nk_image.setImageBitmap(nk_car.getNk_image());
        nk_carName.setText(nk_car.getNk_carName());
        nk_dailyPrice.setText(String.valueOf(nk_car.getNk_dailyPrice()));
        nk_description.setText(nk_car.getNk_description());
        nk_color.setText(nk_car.getNk_color());
        nk_brand.setText(nk_car.getNk_brand());
        nk_radios.setText(nk_car.getNk_radio_add());
        nk_check.setText(nk_car.getNk_checkbox_add());



        nk_carRent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,nk_car.getNk_brand()+ nk_car.getNk_carName()+"Araç Kiralandı.",Toast.LENGTH_LONG).show();
            }
        });

        return convertView;
    }
}
