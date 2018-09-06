package fr.massy.covoit.covoit_massy.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import fr.massy.covoit.covoit_massy.fragments.firebaseclient.FirebaseClient;
import fr.massy.covoit.covoit_massy.R;

public class HomeFragment extends Fragment {
    ListView listView;
    FirebaseClient firebaseClient;
    final static  String DB_URL= "https://covoit-massy.firebaseio.com/Rides";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home, null);
        listView=(ListView) view.findViewById(R.id.list_rides);
        firebaseClient= new FirebaseClient(this.getActivity(), DB_URL,listView);
        firebaseClient.refreshdata();
        return view;

    }
}

