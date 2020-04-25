package com.shafay.hp.recyclerviewexample.recyclerviewAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.shafay.hp.recyclerviewexample.R;
import com.shafay.hp.recyclerviewexample.State.IndiaActivity;
import com.shafay.hp.recyclerviewexample.model.Country;

import java.util.List;

/**
 * Created by hp on 25/04/2020.
 */

public class CountryRecyclerviewAdapter extends RecyclerView.Adapter<CountryRecyclerviewAdapter.CountryViewHolder> {

    ListView codeList;
    private Context mCtx;
    private List<Country> countryList;

    public CountryRecyclerviewAdapter(Context mCtx, List<Country> countryList) {
        this.mCtx = mCtx;
        this.countryList = countryList;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.country_list, null);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        final Country country = countryList.get(position);

        holder.imageView1.setImageResource(country.getImg());
        holder.textView1.setText(country.getCountryName());
        holder.relativeLayout1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getActivityByPosition(country.getId());
            }
        });

    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView textView1;
        ImageView imageView1;
        RelativeLayout relativeLayout1;

        public CountryViewHolder(View itemView) {
            super(itemView);

            imageView1 = itemView.findViewById(R.id.imageView1);
            textView1 = itemView.findViewById(R.id.textView1);
            relativeLayout1 = itemView.findViewById(R.id.relativeLayout1);

        }
    }

    ///
    private void getActivityByPosition(int position) {
        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 1:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 2:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 3:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 4:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 5:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 6:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 7:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 8:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            case 9:
                intent = new Intent(mCtx, IndiaActivity.class);
                mCtx.startActivity(intent);
                break;
            default:
                Toast.makeText(mCtx, "Example List View", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
