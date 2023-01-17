package HwkClass9;

public class Hwk4 {
    /*

4) Create an array that can store names of cars and store 6 elements into it. Print all values from the array.
5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
6) Create an array of countries. While retrieving all values from an array print capital
   for each country choose any five countries.

*/
    public static void main(String[] args) {
        String[] cars = {"BMW", "Audio", "Ferrari", "Mercedes", "Nissan", "Toyota"};
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
