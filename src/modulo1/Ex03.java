package modulo1;

public class Ex03 {
  public static void main(String[] args) {
    float celsius, fahrenheint, kelvin;

    celsius = 25;

    fahrenheint = (celsius * 9 / 5) + 32;
    kelvin = celsius + 273.15f;

    System.out.println(
        "A temperatura de " + celsius + " celsius, é igual a " + fahrenheint + " fahrenheit e " + kelvin + " kelvin.");
  }
}
