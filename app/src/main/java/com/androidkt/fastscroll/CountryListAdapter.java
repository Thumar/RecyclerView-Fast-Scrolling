package com.androidkt.fastscroll;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by brijesh on 5/9/17.
 */

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryViewHolder> {

    private String[] countryList;

    public CountryListAdapter(String[] countryList) {
        this.countryList = countryList;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_country_list, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        holder.countryName.setText(countryList[position]);
    }

    @Override
    public int getItemCount() {
        return countryList.length;
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView countryName;

        public CountryViewHolder(View itemView) {
            super(itemView);
            countryName = itemView.findViewById(R.id.countryName);
        }
    }
}
