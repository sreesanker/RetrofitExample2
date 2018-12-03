package com.example.asus.retrofitexample2.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.asus.retrofitexample2.R;
import com.example.asus.retrofitexample2.model.ModelHomeList;

import java.util.List;


public class AdapterHomeAdapter extends RecyclerView.Adapter<AdapterHomeAdapter.HomeViewHolder> {

   private List<ModelHomeList.DetailsBean.NearByVenuesBean> nearByVenuesBeans;
   private int rowLayout;
   private Context context;

    public AdapterHomeAdapter(List<ModelHomeList.DetailsBean.NearByVenuesBean> nearByVenuesBeans, int rowLayout, Context context) {
                  this.nearByVenuesBeans = nearByVenuesBeans;
                  this.rowLayout = rowLayout;
                  this.context = context;

    }

    @NonNull
    @Override
    public AdapterHomeAdapter.HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_list,parent,false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHomeAdapter.HomeViewHolder holder, int position) {

        holder.venueId.setText(((Integer)nearByVenuesBeans.get(position).getVenue_id()).toString());
        holder.VenueName.setText(nearByVenuesBeans.get(position).getVenue_name());
        holder.VenueSubtitle.setText(nearByVenuesBeans.get(position).getVenue_subtitle());
        holder.VenueDistance.setText(((Integer)nearByVenuesBeans.get(position).getVenue_distance()).toString());
        holder.VenueLattitude.setText(((Double) nearByVenuesBeans.get(position).getVenue_latitude()).toString());
        holder.VenueLongitude.setText(((Double) nearByVenuesBeans.get(position).getVenue_longitude()).toString());
    }

    @Override
    public int getItemCount() {
        return nearByVenuesBeans.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        LinearLayout linearLayout;
        TextView venueId;
        TextView VenueName;
        TextView VenueSubtitle;
        TextView VenueDistance;
        TextView VenueLattitude;
        TextView VenueLongitude;

        public HomeViewHolder(View v) {
            super(v);
            linearLayout = (LinearLayout)v.findViewById(R.id.linear_layout);
            venueId = (TextView)v.findViewById(R.id.tv_venue_id);
            VenueName = (TextView)v.findViewById(R.id.tv_venue_name);
            VenueSubtitle = (TextView)v.findViewById(R.id.tv_venue_subtitle);
            VenueDistance = (TextView)v.findViewById(R.id.tv_venue_distance);
            VenueLattitude = (TextView)v.findViewById(R.id.tv_venue_lattitude);
            VenueLongitude = (TextView)v.findViewById(R.id.tv_venue_longitude);
        }
    }
}
