package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlanetaArrayListAdapter extends BaseAdapter {

    ArrayList<Planeta> planetaList;

    Context context;

    PlanetaArrayListAdapter(Context context, ArrayList<Planeta> planetaList){
        this.context = context;
        this.planetaList = planetaList;
    }

    @Override
    public int getCount() {
        return planetaList == null ? 0 : planetaList.size();
    }

    @Override
    public Object getItem(int position) {
        return planetaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.planet_layout, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tv_nome_planeta_item = convertView.findViewById(R.id.tv_nome_planeta_item);
            viewHolder.tv_qtd_luas_planeta_item = convertView.findViewById(R.id.tv_qtd_luas_planeta_item);
            viewHolder.iv_planeta_item = convertView.findViewById(R.id.iv_planeta_item);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tv_nome_planeta_item.setText(planetaList.get(position).getNomePlaneta());
        viewHolder.tv_qtd_luas_planeta_item.setText(planetaList.get(position).getQtdLuasPlaneta());
        viewHolder.iv_planeta_item.setBackgroundResource(planetaList.get(position).getImgPlaneta());

        return convertView;
    }

    static class ViewHolder{
        TextView tv_nome_planeta_item;
        TextView tv_qtd_luas_planeta_item;
        ImageView iv_planeta_item;
    }
}


