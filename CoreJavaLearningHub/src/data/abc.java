package data;

import java.util.HashSet;
import java.util.Set;

public class abc {

	public static void main(String[] args) {

		        int[] abc = {10, 20, 30, 10};

		        Set<Integer> set = new HashSet<>();

		        for (int value : abc) {
		            set.add(value);   // duplicates ignored
		        }

		        int max = Integer.MIN_VALUE;

		        for (int value : set) {
		            if (value > max) {
		                max = value;
		            }
		        }

		        System.out.println("Unique values: " + set);
		        System.out.println("Max value: " + max);
		        
		        int num = 29;
		        boolean isPrime = true;

		        if (num <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        System.out.println(num + " is Prime: " + isPrime);
		        int num1 = 12345;
		        int reverse = 0;

		        while (num1 != 0) {
		            int digit = num1 % 10;
		            reverse = reverse * 10 + digit;
		            num1 = num1 / 10;
		        }

		        System.out.println("Reversed number: " + reverse);
		        int num2 = 121;
		        int original = num2;
		        int reversed = 0;

		        while (num2 != 0) {
		            int digit = num2 % 10;
		            reversed = reversed * 10 + digit;
		            num2 /= 10;
		        }

		        if (original == reversed) {
		            System.out.println("Palindrome number");
		        } else {
		            System.out.println("Not a palindrome");
		        }
		    }
		}
