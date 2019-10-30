// Written by Noah Pohl
// 10/29/2019

import java.util.Scanner;

public class DownloadInfo {
    public static void main(String[] args) {
        System.out.println(
                "Find your intenet download speed from Megabytes (MB/s) to Megabits (Mbps)");
        System.out.println("Pleases enter your current download speed in MB/s");

        Scanner input = new Scanner(System.in);
        double MB = input.nextDouble();
        System.out.println("The internet speed you entered in Megabytes is " + MB + " MB/s ");
        double Mbps = MB * 8.192;

        String MbpsVal = String.format("%.2f", Mbps);
        System.out.println("Your internet speed in Megabits is " + MbpsVal + " Mbps");

        System.out.println("Now enter the Download size of the file you want to download");
        System.out
                .println("Press 1 to enter your file size in GB (Gigabytes) or Press 2 to enter it in MB (Megabytes) ");

        
        int userChoice = input.nextInt();

       
        while(userChoice < 1 || userChoice > 2){
            System.out.println("Invalid input");
            System.out.println("Please enter 1 for file size in GB or 2 to enter in MB");
            userChoice = input.nextInt();
        }

        if(userChoice == 1){
            double gigabyte = input.nextDouble();
            System.out.println("Size of the file in Gigabytes " + gigabyte);
        }

        else if(userChoice == 2){
            double megabyte = input.nextDouble();
            System.out.println("Size of the file in Megabytes " + megabyte);
        }

        System.out.println("Goodbye!");
        input.close();
    

    }
}
