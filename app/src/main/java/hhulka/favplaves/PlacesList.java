package hhulka.favplaves;

import java.util.ArrayList;
import java.util.List;

public class PlacesList {

    private List<String> userPlaces = new ArrayList<>();

    public PlacesList() {
        userPlaces.add("Add a new place...");
    }

    public List<String> getUserPlaces() {
        return userPlaces;
    }

    public void addNewPlace(List places, String place){
        places.add(place);
    }

}
