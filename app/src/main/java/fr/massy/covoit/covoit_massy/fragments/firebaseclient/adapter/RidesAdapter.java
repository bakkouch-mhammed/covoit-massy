package fr.massy.covoit.covoit_massy.fragments.firebaseclient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import java.util.ArrayList;

import fr.massy.covoit.covoit_massy.R;
import fr.massy.covoit.covoit_massy.Ride;

public class RidesAdapter extends BaseAdapter {
    Context c;
    ArrayList<Ride> rideslist;
    LayoutInflater inflater;

    public RidesAdapter(Context c, ArrayList<Ride> rideslist) {
        this.c = c;
        this.rideslist = rideslist;
    }





    @Override
    public int getCount() {
        return rideslist.size();
    }

    @Override
    public Ride getItem(int i) {
        return rideslist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, final ViewGroup viewGroup) {

        if (inflater== null)
        {
            inflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        } if(convertview==null)
        {
            convertview= inflater.inflate(R.layout.adapter_rides,viewGroup,false);

        }


        final Ride currentRide = getItem(i);
        HolderRides holder= new HolderRides(convertview);
        holder.startLocation.setText(currentRide.getStartLocation());
        holder.endLocation.setText(currentRide.getEndLocation());
        holder.nbSeats.setText(currentRide.getNbSeats());
        holder.driverName.setText(currentRide.getDriver().getName());
        holder.startTime.setText(currentRide.getStartTime().getHour() + ":" + currentRide.getStartTime().getMinute());

        holder.button_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(viewGroup.getContext(), "Covoit réservé", Toast.LENGTH_SHORT).show();
            }
        });


        return convertview;
    }
}