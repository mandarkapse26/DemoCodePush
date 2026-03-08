package array;

public class sescondlargest {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 60, 33, 55};

        int largest = a[0];
        int secondLargest = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            }else if(a[i] > secondLargest) {
            	secondLargest = a[i];
            }
           
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
