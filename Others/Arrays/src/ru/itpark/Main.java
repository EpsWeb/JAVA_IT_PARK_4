package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int b, i;
        Scanner scn = new Scanner(System.in);
        b = scn.nextInt();
        int c[] = new int[b];
        for (i = 0; i < b; i++) {
            c[i] = scn.nextInt();

        }
        for (i = 0; i < b; i++) {
            if (c[i] % 2 == 0 ) {
                c[i] = 0;
            }


        }



        int j = 0;
        for(i = b; i > 0; i--){
            c[i] = c[j];
            j++;
        }
        for (i = 0; i < b; i++) {
            System.out.println(c[i]);
        }

        }

    }

