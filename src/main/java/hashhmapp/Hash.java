package hashhmapp;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash {

    public static void main(String[] args) {


        HashMap<Integer, ArrayList<String>> myLists = new HashMap<>();
        ArrayList<String> myStrings1 = new ArrayList<>();

        myStrings1.add("Tekst");

        myLists.put(82, myStrings1);

    }


}