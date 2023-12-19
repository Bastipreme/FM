package de.hhn.se.foodmood.view.fm;

import de.hhn.se.pmt.foodmood.model.Location;

public class LocationPLZ {
    public double[] latitude = { 49.150002, 48.778449, 49.487459, 49.00937, 49.40768, 48.897051, 49.18972, 49.192258,
            49.23917, 49.23111, 49.23333, 40.416775, 45.464664, 48.856614, 51.507351, 52.520007, 53.551086,
            48.135125, 50.937531, 50.110922, 34.052235, 36.169941, 40.712784, 25.761681, 49.142692, 49.142692,
            49.142692};
    public double[] longitude = { 9.2166, 9.180011, 8.466039, 8.40365, 8.69079, 9.19339, 9.27222, 9.229709, 9.22528,
            9.15417, 9.11667, -3.70379, 9.18854, 2.352222, -0.127758, 13.404954, 9.993682, 11.581981, 6.957277,
            8.682127, -118.243683, -115.13983, -74.005941, -80.191788, 9.142692, 9.142692, 9.142692};
    public String[] locations = {"Heilbronn", "Stuttgart", "Mannheim", "Karlsruhe", "Heidelberg", "Ludwigsburg",
            "Untereisesheim", "Neckarsulm", "Bad Friedrichshall", "Bad Wimpfen", "Bad Rappenau",
            "Madrid", "Mailand", "Paris", "London", "Berlin", "Hamburg", "München", "Köln", "Frankfurt",
            "Los Angeles", "Las Vegas", "New York", "Miami", "Sontheim", "Böckingen", "Neckargartach"};
    public int[] postcodes = {74081, 70173, 68159, 76131, 69115, 71638, 74257, 74172, 74177, 74206, 74906,
            28001, 20019, 75001, 10001, 10115, 20095, 80331, 50667, 60311,
            90001, 89101, 10001, 33109, 74257, 74080, 74078};
    public double[] getLatitude() {
        return latitude;
    }

    public void setLatitude(double[] latitude) {
        this.latitude = latitude;
    }

    public double[] getLongitude() {
        return longitude;
    }

    public void setLongitude(double[] longitude) {
        this.longitude = longitude;
    }

    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }

    public int[] getPostcodes() {
        return postcodes;
    }

    public void setPostcodes(int[] postcodes) {
        this.postcodes = postcodes;
    }



}
