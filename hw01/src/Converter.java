import java.util.Scanner;

public class Converter {

    private double temperature;

    public double convertToFarenheit() {
        return (this.temperature * 9/5) + 32;
    }

    public double convertToKelvin() {
        return this.temperature + 273.15;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    public static void main(String[] args) {

        Converter temperature = new Converter();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temp = input.nextDouble();
        temperature.setTemperature(temp);
        System.out.println(temperature.convertToFarenheit() + "F");
        System.out.println(temperature.convertToKelvin() + "K");
    }
}
