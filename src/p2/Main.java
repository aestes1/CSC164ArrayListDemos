package p2;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        ArrayList<Balloon> list = new ArrayList<>();

        /*One way to add balloons
        Balloon b1 = new Balloon("Yellow", 10);
        Balloon b2 = new Balloon("Red", 12);

        list.add(b1);
        list.add(b2);*/

        //Better way of adding balloons
        list.add(new Balloon ("Yellow", 10));
        list.add(new Balloon ("Red", 12));

        //Get size of list
        System.out.println("Number of balloons = " + list.size());

        //This gets the information with a for each loop
        /*Way one
        for (Balloon each : list) {
            //One way to write it
            //System.out.println(each.color + " " + each.diameter);

            //Better way to write it
            System.out.println(each);
        }*/
        //Way two
        //Each method
        list.forEach(System.out::println);

        //Attempt one at trying to check if set balloons are in the list and failed
        //Balloon b = new Balloon("Green", 10);
        //System.out.println("We have a Green 10in balloon: " + list.contains(b));

        //Attempt number two
        /*for (Balloon each : list){
            if (each.color.equals("yellow") && each.diameter == 10)
                System.out.println("We have a 10in Yellow balloon");
            else
                System.out.println("We do not have a 10in Yellow Balloon");
        }*/

        //Attempt Three
        boolean isFound = false;
        String searchColor = "Yellow";
        int searchDiameter = 10;
        for (Balloon each : list){
            if (each.color.equals(searchColor) && each.diameter == searchDiameter)
                isFound = true;
        }
        System.out.printf("%s %d %b%n",searchColor, searchDiameter, isFound);
    }
}

class Balloon {
    String color;
    int diameter;

    Balloon(String c, int d) {
        color = c;
        diameter = d;
    }
}

//Array list with a stream that filters the stream with the filter "each -> each != null" which says filter
// each so that each does not equal null
//array1.stream().filter(each -> each != null).forEach(System.out::println);