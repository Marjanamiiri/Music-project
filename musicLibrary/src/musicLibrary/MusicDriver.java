package musicLibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusicDriver {

	private MusicLibrary library;
	
    public MusicDriver() {

        library = new MusicLibrary();

    }

    public static void main(String[] args) {
        MusicDriver assignment = new MusicDriver();
        assignment.init();
        assignment.displayMenu();
    }


    public void init() {
      System.out.println("DEBUG: Library Contents");
        try {
            File file = new File("music_data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split("\\|");
                String sku = data[0];

                MusicMedia selection;
                if (sku.startsWith("af")) {
                    selection = new AudioFile(data[0], data[1], data[2], Integer.parseInt(data[3]), data[4], Integer.parseInt(data[5]));
                } else if (sku.startsWith("cd")) {
                    selection = new CompactDisk(data[0], data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));
                } else {
                    selection = new VinylRecord(data[0], data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), Integer.parseInt(data[6]));
                }
                library.add(sku, selection);
                System.out.println(selection);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
  
    }

    
    public void displayMenu() {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("<---Choose an option--->");
            System.out.println("1. Display Audio Files");
            System.out.println("2. Display Compact Discs");
            System.out.println("3. Display Vinyl Records");
            System.out.println("4. Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    library.displayChoice("af");
                    break;
                case 2:
                    library.displayChoice("cd");
                    break;
                case 3:
                    library.displayChoice("vr");
                    break;
                case 4:
                	System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
