package CodeForces.PracticeProblems;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int weight;
        
        weight = Integer.parseInt(inputScanner.nextLine());  
        inputScanner.close(); 

        if(weight%2 == 0 && weight >= 4) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}