import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File kpmgenset = new File("kpmgenset.csv");

        int index = 0;

        ArrayList<SolarData> solarData = new ArrayList<>();
        ArrayList<String> states = new ArrayList<>();
        ArrayList<String> levels = new ArrayList<>();
        ArrayList<String> categories = new ArrayList<>();
        ArrayList<String> locations = new ArrayList<>();

        if(kpmgenset.exists()) {
            System.out.println("File exists");

            if(kpmgenset.canRead()) {
                System.out.println("File is readable");
            } else {
                System.out.println("File is unreadable");
            }

            try(Scanner reader = new Scanner(kpmgenset)) {
                while (reader.hasNext()) {
                    String line = reader.nextLine();
                    if(index > 0) {
                        String[] items = line.split(",");

                        SolarData data = new SolarData(items[0], items[1], items[2], items[3], items[4], items[5], items[6], items[7], items[8], items[9]);

                        solarData.add(data);

                        System.out.print(index + " ");
                        System.out.println(data);
                        System.out.println();
                    }
                    index++;
                }

                for(SolarData row: solarData) {
                    if(!(states.contains(row.state))) {
                        states.add(row.state);
                    }
                    if(!(levels.contains(row.level))) {
                        levels.add(row.level);
                    }
                    if(!(categories.contains(row.category))) {
                        categories.add(row.category);
                    }
                    if(!(locations.contains(row.location))) {
                        locations.add(row.location);
                    }
                }

                System.out.println("Number of Unique States: "+states.size());
                for(String state: states){
                    System.out.println(state);
                }
                System.out.println("Number of Unique Levels: "+levels.size());
                for(String level: levels) {
                    System.out.println(level);
                }
                System.out.println("Number of Unique Locations: "+locations.size());
                for(String location: locations) {
                    System.out.println(location);
                }
                System.out.println("Number of Unique Categories: "+categories.size());
                for(String category: categories) {
                    System.out.println(category);
                }

            } catch (FileNotFoundException exception) {
                System.out.println(exception.getMessage());
            }
        } else {
            System.out.println("File does not exists");
        }
    }
}