package fr.massy.covoit.covoit_massy.fragments.firebaseclient;

import android.content.Context;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

import fr.massy.covoit.covoit_massy.Ride;
import fr.massy.covoit.covoit_massy.fragments.firebaseclient.adapter.RidesAdapter;


/**
 * Created by Admin on 5/26/2017.
 */

public class FirebaseClient  {

    Context c;
    String DB_URL;
    ListView listView;
    Firebase firebase;
    ArrayList<Ride> rideslist= new ArrayList<>();
    fr.massy.covoit.covoit_massy.fragments.firebaseclient.adapter.RidesAdapter RidesAdapter;



    public  FirebaseClient(Context c, String DB_URL, ListView listView)
    {
        this.c= c;
        this.DB_URL= DB_URL;
        this.listView= listView;


        Firebase.setAndroidContext(c);
        firebase=new Firebase(DB_URL);

    }

    public  void savedata(Ride ride)
    {
        firebase.push().setValue(ride);

    }

    public  void refreshdata()
    {
        firebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                getupdates(dataSnapshot);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }

    public void getupdates(DataSnapshot dataSnapshot){

        rideslist.clear();
        for(DataSnapshot ds : dataSnapshot.getChildren()){
            Ride ride=(Ride) ds.getValue();
            rideslist.add(ride);

        }
        if(rideslist.size()>0)
        {
            RidesAdapter=new RidesAdapter(c, rideslist);
            listView.setAdapter(RidesAdapter);
        }else
        {
            Toast.makeText(c, "Aucun produit actuellement", Toast.LENGTH_SHORT).show();
        }
    }

}

