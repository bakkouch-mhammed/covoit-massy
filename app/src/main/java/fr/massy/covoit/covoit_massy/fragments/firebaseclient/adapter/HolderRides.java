package fr.massy.covoit.covoit_massy.fragments.firebaseclient.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fr.massy.covoit.covoit_massy.R;

public class HolderRides {

    TextView startLocation;
    TextView endLocation;
    TextView startTime;
    TextView driverName;
    TextView nbSeats;
    Button button_go;

    public HolderRides(View itemView) {


        startLocation= (TextView) itemView.findViewById(R.id.ride_start_location);
        endLocation= (TextView) itemView.findViewById(R.id.ride_end_location);
        startTime= (TextView) itemView.findViewById(R.id.ride_start_time);
        driverName= (TextView) itemView.findViewById(R.id.ride_driver);
        nbSeats= (TextView) itemView.findViewById(R.id.ride_nbseats);
        button_go = (Button) itemView.findViewById(R.id.button_ride_go);

    }
}
