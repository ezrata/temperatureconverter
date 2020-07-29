package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        String temperatureScale;
        float temperature;
        float convertedTemp;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        temperature = in.nextInt();

        System.out.println("Enter C for 'Celsius to Fahrenheit' or F for 'Fahrenheit to Celsius': ");
        temperatureScale = in.next();

        if (temperatureScale.equals("F") || temperatureScale.equals("f")) {
            convertedTemp = ((temperature - 32) * 5) / 9;
            System.out.println(temperature + "°" + temperatureScale + " is equal to " +  + convertedTemp + "°C");
        }
            if (temperatureScale.equals("C") || temperatureScale.equals("C")) {
                convertedTemp = ((temperature * 9) / 5 + 32);
                System.out.println(temperature + "°" + temperatureScale + " is equal to " +  + convertedTemp + "°F");
            } else {
                System.out.println("Please enter a valid input!");

            }

        }
    }
