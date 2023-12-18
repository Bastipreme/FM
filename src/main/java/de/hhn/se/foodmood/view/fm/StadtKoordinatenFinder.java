
package de.hhn.se.foodmood.view.fm;

import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.GeoApiContext;

public class StadtKoordinatenFinder {
    public Koordinaten findeKoordinaten(String stadt, String plz) {
        try {
            GeoApiContext context = new GeoApiContext.Builder()
                    .apiKey("AIzaSyD-9tSrke72PouQMnMX-a7eZSW0jkFMBWY")
                    .build();

            GeocodingResult[] results = GeocodingApi.newRequest(context)
                    .address(stadt + ", " + plz)
                    .await();

            if (results.length > 0) {
                double latitude = results[0].geometry.location.lat;
                double longitude = results[0].geometry.location.lng;
                return new Koordinaten(latitude, longitude);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
class Koordinaten {
    double latitude;
    double longitude;

    public Koordinaten(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }
}
