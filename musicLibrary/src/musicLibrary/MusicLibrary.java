package musicLibrary;

import java.util.HashMap;

public class MusicLibrary {
	private HashMap<String, MusicMedia> library;

	public MusicLibrary() {
	    library = new HashMap<>();
	}
	
	/**
	 * @param SKU of song
	 * @param MusicMedia selection
	 */
	public void add(String sku, MusicMedia selection) {
	    library.put(sku, selection);
	}

	/**
	 * displays all the entries in the HashMap to the console using toString() implementations of each.
	 */
	public void displayLibrary() {
	    for (MusicMedia selection : library.values()) {
	        System.out.println(selection.toString());
	    }
	}

	/**
	 * @param prefix display the type of MusicMedia specified. 
	 */
	public void displayChoice(String prefix) {
	    for (MusicMedia selection : library.values()) {
	        if (selection.getSku().startsWith(prefix)) {
	            System.out.println(selection.toString());
	        }
	    }
	}
}
