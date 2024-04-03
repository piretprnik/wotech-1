public class Main {
  public static void main(String[] args) {

    // +5 WEAR SUPER WARM
    // +5 TO +15 WARM
    // +15 TO +30 NORMAL
    // + 30 AND MORE YOU NEED COOLING

    double temperature = -10.0;

    if (temperature < 5) {
      System.out.println("Wear super warm clothes!");
    } else if (temperature < 15) {
      System.out.println("Wear warm clothes!");
    } else if (temperature < 30) {
      System.out.println("Wear normal clothes!");
    } else if (temperature > 30) {
      System.out.println("You need more cooling!");

    }
  }
}
