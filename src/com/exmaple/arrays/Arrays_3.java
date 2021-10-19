package com.exmaple.arrays;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Arrays_3 {
    private static DecimalFormat df3 = new DecimalFormat("#.###");

    public static void arrays() {
        bsp2();
    }

    private static class countWords {
                
    }

    
    private static void bsp2() {
        ArrayList<schoolWayStatistics> statistics = new ArrayList<>();
        String[] name = {"Felix", "Flo", "Steve", "Mattl", "Simon", "Pascal", "Karim", "Sepp", "Justin", "Markus"};

        //int i;
        for (int i = 0; i < 10; i++) {
            statistics.add(new schoolWayStatistics(name[i]));
            for (int j = 0; j < 15; j++) {
                statistics.get(i).newTime(new Random().nextInt(15, 20));
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(statistics.get(i).getName() + ":\tAverage: " + df3.format(statistics.get(i).getAverage()) + " - Standard deviation: " + df3.format(statistics.get(i).getStandardDeviation()));
        }

        //Longest way to school
        double max_time = 0;
        String name_max = null;
        for (int i = 0; i < 10; i++) {
            if (max_time < statistics.get(i).getAverage()) {
                max_time = statistics.get(i).getAverage();
                name_max = statistics.get(i).getName();
            }
        }
        System.out.println("\nLongest way to school: " + name_max + " with " + df3.format(max_time));


        //Most constant way to school
        double smallest_StandardDeviation = 0;
        String name_smallest_StandardDeviation = null;
        for (int i = 0; i < 10; i++) {
            if (smallest_StandardDeviation > statistics.get(i).getStandardDeviation() || smallest_StandardDeviation == 0) {
                smallest_StandardDeviation = statistics.get(i).getStandardDeviation();
                name_smallest_StandardDeviation = statistics.get(i).getName();
            }
        }
        System.out.println("Most constant way to school: " + name_smallest_StandardDeviation + " with " + df3.format(smallest_StandardDeviation));
    }
    

    private static void bsp1() {
        schoolWayStatistics statistics = new schoolWayStatistics("NAME");
        for (int i = 0; i < 15; i++) {
            statistics.newTime(new Random().nextInt(15, 20));
        }
        System.out.println("Average: " + df3.format(statistics.getAverage()) + ", Standard deviation: " + df3.format(statistics.getStandardDeviation()));
    }

    private static class schoolWayStatistics {
        ArrayList<Integer> statistics = new ArrayList<>();
        String name;
        
        private schoolWayStatistics(String name) {
            this.name = name;
        }

        private void newTime(int time) {
            this.statistics.add(time);
        }

        private double getAverage() {
            double sum = 0;
            for (int x:statistics)
                sum += x;

            return sum/ statistics.size();
        }

        private double getStandardDeviation() {
            double average = getAverage();

            int sum = 0;
            for (int x:statistics)
                sum += Math.pow(x-average, 2);

            return Math.sqrt((double) (sum) / (average * statistics.size()));
        }

        private String getName() {
            return this.name;
        }
    }
}
