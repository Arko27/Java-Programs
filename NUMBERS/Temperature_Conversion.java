import java.util.*;

class Temperature_Conversion {

    double celsius_to_Fahrenheit(double celsius) {
        double f = ((9 * celsius) / 5.0) + 32;
        return f;
    }

    double fahrenheit_to_Celsius(double fahrenheit) {
        double c = ((fahrenheit - 32) * 5) / 9.0;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperature_Conversion temp_conv = new Temperature_Conversion();
        System.out.println("1. Convert to F");
        System.out.println("2. Convert to C");
        System.out.println("3. Convert to K");
        int choice = sc.nextInt();
        System.out.println("Enter the tempearture to be converted followed by the unit");
        String tempStr = sc.next();
        char unit = tempStr.charAt(tempStr.length() - 1);
        double temp = Double.parseDouble(tempStr.substring(0, tempStr.length() - 1));

        switch (choice) {
            case 1:
                if (unit == 'C' || unit == 'c')
                    System.out.println("The temperature is: " + temp_conv.celsius_to_Fahrenheit(temp) + "F");
                else if (unit == 'K' || unit == 'k')
                    System.out.println("The temperature is: " + temp_conv.celsius_to_Fahrenheit(temp - 273.0) + "F");
                break;

            case 2:
                if (unit == 'F' || unit == 'f')
                    System.out.println("The temperature is: " + temp_conv.fahrenheit_to_Celsius(temp) + "C");
                else if (unit == 'K' || unit == 'k')
                    System.out.println("The temperature is: " + (temp - 273.0) + "C");
                break;

            case 3:
                if (unit == 'F' || unit == 'f')
                    System.out.println("The temperature is: " + (temp_conv.fahrenheit_to_Celsius(temp) + 273.0) + "K");
                else if (unit == 'C' || unit == 'c')
                    System.out.println("The temperature is: " + (temp + 273.0) + "K");
                break;

            default:
                System.out.println("Wrong Choice");
                break;
        }
    }
}