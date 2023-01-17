package HwkClass9;

public class Hwk5 {
    public static void main(String[] args) {
        int [] num= {17,24,33,41,59};
        int sum = 0;
        System.out.println(num.length);
        for (int i = 0; i< num.length; i++) {
            sum=sum+num[i];

        }
        System.out.println(sum);
    }
}
