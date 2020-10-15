import java.util.ArrayList;
import java.util.Scanner;


public class DataStruct {
    
    private ArrayList<Integer> arrayNumbers = new ArrayList<Integer>(5);
    private int sum;
    private int product;
    private int largest;
    private int smallest;



    public void getNumbers(){
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            arrayNumbers.add(number);
        }
        input.close();
    }

    public void arraySum() {
        sum = 0;
        for (Integer userNum : arrayNumbers) {
            sum = sum + userNum;
        }
        System.out.println("Sum: " + sum);
    }

    public void arrayProduct() {
        product = 1;
        for (Integer userNum : arrayNumbers) {
            product = product * userNum;
        }
        System.out.println("Product: " + product);
    }

    public void arrayLargest() {
        largest = arrayNumbers.get(0);
        for (Integer userNum : arrayNumbers) {
            // int userBefore = userNum;
            // largest = userNum;
            if (userNum > largest) {
                largest = userNum;
            }  
        }
        System.out.println("Largest: " + largest);
    }

    public void arraySmallest() {
        smallest = arrayNumbers.get(0);
        for (Integer userNum : arrayNumbers) {
            // int userBefore = userNum;
            // largest = userNum;
            if (userNum < smallest) {
                smallest = userNum;
            }  
        }
        System.out.println("Smallest: " + smallest);
    }





}
