public class BeerSong {

    public static void main(String[] args) {
        int numberOfBottles = 99;
        String word = "bottles";

        while (numberOfBottles > 0) {
 
            System.out.println(numberOfBottles + " " + word + " of beer on the wall");
            System.out.println(numberOfBottles + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around. ");
            numberOfBottles = numberOfBottles - 1;

            if (numberOfBottles == 1) {
                word = "bottle";
            }
            if (numberOfBottles > 0) {
                System.out.println(numberOfBottles + " " + word + " of beer on the wall ");
            } else {
                System.out.println("No more bottles of beer on the wall ");
            }
        }

    }

}