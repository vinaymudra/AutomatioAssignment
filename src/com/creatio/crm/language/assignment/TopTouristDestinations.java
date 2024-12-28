package com.creatio.crm.language.assignment;

import java.util.HashSet;
import java.util.Set;

public class TopTouristDestinations {

	public static void main(String[] args) {
		
	// Create a set to store the top 10 most visited tourist attractions
	
		
		Set<String> destinations = new HashSet<String>();

   // Add the top 10 most visited tourist destinations to the set
		destinations.add("Eiffel Tower, Paris, France");
        destinations.add("Great Wall of China, China");
        destinations.add("Times Square, New York City, USA");
        destinations.add("Disneyland Resort, Anaheim, USA");
        destinations.add("Grand Bazaar, Istanbul, Turkey");
        destinations.add("Louvre Museum, Paris, France");
        destinations.add("Las Vegas Strip, Las Vegas, USA");
        destinations.add("The Vatican Museums, Vatican City");
        destinations.add("Niagara Falls, Canada & USA");
        destinations.add("Taj Mahal, India");
        
		        // Print out the size of the set
		        System.out.println("Number of top tourist destinations: " + destinations.size());
		    }
		}

