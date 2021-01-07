import java.util.*;

public class PrimalityTester0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long number = in.nextLong();
        boolean prime = true;
        for(long i = 2; i < number && prime; i++)
            if(number % i  ==  0)
                prime = false;
        if(prime)
            System.out.println(number + " is prime.");
        else
            System.out.println(number + " is not prime.");
    }
}

// Revised prime check that does not check for multiples of 2 for efficiency
import java.util.*;

public class PrimalityTester1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long number = in.nextLong();
        boolean prime = number == 2 || number % 2 != 0;
        for(long i = 3; i < number && prime; i += 2 )
            if(number % i  ==  0)
                prime = false;
        if(prime)
            System.out.println(number + " is prime.");
        else
            System.out.println(number + " is not prime.");
    }
}

import java.util.*;

public class PrimalityTester2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long number = in.nextLong();
        boolean prime = number == 2 || number % 2 != 0;
        long root = (long)Math.sqrt(number);
        for(long i = 3; i <= root && prime; i += 2 )
            if(number % i  ==  0)
                prime = false;
        if(prime)
            System.out.println(number + " is prime.");
        else
            System.out.println(number + " is not prime.");
    }
}