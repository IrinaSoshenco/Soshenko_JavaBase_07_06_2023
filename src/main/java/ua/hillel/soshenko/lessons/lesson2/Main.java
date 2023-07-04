package ua.hillel.soshenko.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        double longitude = 51.505140736194;
        float longitudeVariable = (float) longitude;
        double latitude = -0.0756320278798;
        float latitudeVariable = (float) latitude;
        char heightVariable = '*';
        int height = heightVariable;
        String txt1 = "Tower Bridge coordinates";
        String txt2 = "Its height is";
        String txt3 = "meters.";
        System.out.println(txt1 + " " + "Longitude: " + longitudeVariable + " " + "Latitude: " + latitudeVariable + "." + " " + txt2 + " " + height + " " + txt3);
    }
}
