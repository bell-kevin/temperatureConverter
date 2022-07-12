/** ****************************************************************************
 * TemperatureConverter.java
 * Kevin Bell
 * This program practices the use of unit testing on a simple temperature
 * program
 **************************************************************************** */
package temperatureconverter;

import java.util.*; //Scanner

public class TemperatureConverter {

    public static void main(String[] args) {
        System.out.println("Temperature Converter by Kevin Bell");
        Scanner computerKeyboardInput = new Scanner(System.in);
        String answer = "y", tempType = "f";
        double userTemp = 0.0, result = 0.0;
        while (answer.equals("y")) {
            System.out.print("\nWhat is the temperature to convert? ");
            userTemp = Double.parseDouble(computerKeyboardInput.nextLine());
            System.out.print("Is this Celsius (C) or Fahrenheit (F)? ");
            tempType = computerKeyboardInput.nextLine();
            tempType = tempType.toLowerCase();
            if (tempType.equals("c")) {
                result = CtoF(userTemp);
                System.out.printf("Fahrenheit temp is %.2f\n", result);
            } else if (tempType.equals("f")) {
                result = FtoC(userTemp);
                System.out.printf("Celsius temp is %.2f\n", result);
            } else {
                System.out.println("Error, use C or F for temperature type");
            } //end if
            System.out.print("Do you have another temperature to convert? ");
            answer = computerKeyboardInput.nextLine().toLowerCase();
        } //end while
    }//end main

    public static double FtoC(double Ftemp) {
        //converts incoming Fahrenheit temp to Celsius
        double Ctemp = 0.0;
        Ctemp = (Ftemp - 32) * 5.0 / 9.0;
        return Ctemp;
    } //end FtoC

    public static double CtoF(double Ctemp) {
        //converts incoming Celsius temp to Fahrenheit
        double Ftemp = 0.0;
        Ftemp = (Ctemp * 9.0 / 5.0) + 32;
        return Ftemp;
    } //end CtoF
} //end class TemperatureConverter