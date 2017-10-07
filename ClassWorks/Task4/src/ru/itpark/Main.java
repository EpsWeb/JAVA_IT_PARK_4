package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n;
	int number;
	int power;
	String color;
	Auto a;
        System.out.println("Enter n=");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        Auto[] cars = new Auto[n];
        for (int i=0;i<n;i++)
        {
            cars[i]=new Auto();
            System.out.println("Enter number");;
            cars[i].setNumber(number=scanner.nextInt());
            System.out.println("Enter color");
            cars[i].setColor(color=scanner.next());
            System.out.println("Enter power");
            cars[i].setPower(power=scanner.nextInt());
        }
        for (int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (cars[i].getPower()<cars[j].getPower())
                {
                    a=cars[i];
                    cars[i]=cars[j];
                    cars[j]=a;
                }
            }
        }
        for (int i=0;i<n;i++)
            System.out.println(cars[i].getNumber());
    }
}