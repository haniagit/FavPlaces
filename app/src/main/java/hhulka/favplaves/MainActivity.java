package hhulka.favplaves;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<LatLng> locations = new ArrayList<>();
    public static ArrayAdapter arrayAdapter;
    public static List<String> userPlaces = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        locations.add(new LatLng(0,0));
        userPlaces.add("Add a new place...");

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, userPlaces);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent (getApplicationContext(), MapsActivity.class);
                intent.putExtra("placeNumber", position);
                startActivity(intent);
            }
        });
    }

    public List<LatLng> getLocations() {
        return locations;
    }

    public ArrayAdapter getArrayAdapter() {
        return arrayAdapter;
    }
}
