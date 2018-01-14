package com.swishsoftwaresolutions.customlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView clv;
    TextView name,type;
    ArrayList<Datamodel> datamodels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clv = (ListView)findViewById(R.id.customlist);
        datamodels = new ArrayList<>();

        datamodels.add(new Datamodel("Apple","fruit"));
        datamodels.add(new Datamodel("Potato","vegetable"));

        CustomAdapter adapter = new CustomAdapter(this,0);
        clv.setAdapter(adapter);


    }

    class CustomAdapter extends ArrayAdapter{

        public CustomAdapter(@NonNull Context context, int resource) {
            super(context, resource);
        }

        @Override
        public int getCount() {
            return datamodels.size();
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if(convertView == null){
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                convertView = inflater.inflate(R.layout.customlayout,null);
                name = (TextView) convertView.findViewById(R.id.name1);
                type = (TextView) convertView.findViewById(R.id.type1);
            }
            name.setText(datamodels.get(position).getName());
            type.setText(datamodels.get(position).getType());

            return convertView;
        }
    }
}
