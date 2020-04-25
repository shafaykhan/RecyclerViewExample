package com.shafay.hp.recyclerviewexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.shafay.hp.recyclerviewexample.State.IndiaActivity;
import com.shafay.hp.recyclerviewexample.model.Country;
import com.shafay.hp.recyclerviewexample.recyclerviewAdapter.CountryRecyclerviewAdapter;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private ListView codeList;
    private ArrayList<Country> countries = new ArrayList<>();
    private CountryRecyclerviewAdapter countryRecyclerviewAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countries.add(new Country(1, "India", R.mipmap.card_view));
        countries.add(new Country(2, "America", R.mipmap.card_view));
        countries.add(new Country(3, "Africa", R.mipmap.card_view));
        countries.add(new Country(4, "Australia", R.mipmap.card_view));
        countries.add(new Country(5, "Russia", R.mipmap.card_view));
        countries.add(new Country(6, "China", R.mipmap.card_view));
        countries.add(new Country(7, "Japan", R.mipmap.card_view));
        countries.add(new Country(8, "UAE", R.mipmap.card_view));
        countries.add(new Country(9, "UK", R.mipmap.card_view));
        countries.add(new Country(10, "Canada", R.mipmap.card_view));


        //getting the recyclerview from xml
        recyclerView = findViewById(R.id.recyclerViewCountry);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        loadstudents();
    }

    private void loadstudents() {
        CountryRecyclerviewAdapter adapter = new CountryRecyclerviewAdapter(MainActivity.this, countries);
        recyclerView.setAdapter(adapter);

    }



}

