package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {
        String str;
        for (int i=1; i<=105; i++) {
            if (i%3 != 0 && i%5 != 0 && i%7 != 0) {
                System.out.println(i);
                continue;
            }
            str="";
            if (i%3 == 0) str+="Fizz";
            if (i%5 == 0) str+="Buzz";
            if (i%7 == 0) str+="Bang";
            System.out.println(str);
        }
    }

}
