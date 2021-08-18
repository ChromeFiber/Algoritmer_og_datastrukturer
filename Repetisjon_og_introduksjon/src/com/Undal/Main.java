package com.Undal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection<String> collection = new ArrayList<>();
        collection.add("Oslo");
        collection.add("Bergen");
        collection.add("Trondheim");
        collection.add("Kristiansand");

        collection.forEach(e -> System.out.println(e.toUpperCase() + " "));
        System.out.println();
    }
}
