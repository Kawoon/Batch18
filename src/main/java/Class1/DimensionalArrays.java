package Class1;

public class DimensionalArrays {
    public static void main(String[] args) {
        String[][] countries = {
                {"Brazil", "Argentine", "Uruguay", "Columbia"},
                {"USA", "Jamaica", "El Salvador", "Grenada"},
                {"Serbia", "Switzerland", "Norway", "Portugal"},
                {"Afghanistan", "India", "Maldives", "Singapore"}
        };
        System.out.println("-----------1st Way----------");
        for (int k = 0; k < countries.length; k++) {
            for (int c = 0; c < countries[k].length; c++)
                System.out.println(countries[k][c] + " ");
            System.out.println();
        }

                System.out.println();
                {
                    System.out.println("----------2nd Way----------");

                    for (String[] v : countries) {
                        for (String x : v) {
                            System.out.println(x + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                int totalSorted = 0;
                for (String[] places : countries) {
                    totalSorted += places.length;
                }
                System.out.println(totalSorted + " " + "Countries been Sorted");
            }
        }










