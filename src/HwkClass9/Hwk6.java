package HwkClass9;

public class Hwk6 {
    public static void main(String[] args) {
        String[] countries = new String[5];
        countries[0] = "Russia";
        countries[1] = "Turkmenistan";
        countries[2] = "Hungry";
        countries[3] = "Mexico";
        countries[4] = "Argentina";
        System.out.println(countries.length);
        for (int i = 0; i <= 4; i++) {
            System.out.print(countries[i]);
            if (i == 0) {
                System.out.println(" - Moscow");
            } else if (i == 1)
                System.out.println(" - Ashgabat");
            else if (i == 2)
                System.out.println(" - Budapest");
            else if (i == 3)
                System.out.println(" - Mexico City");
            else if (i == 4)
                System.out.println(" - Buenos Aires");
        }

    }
}


