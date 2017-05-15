package headfirst.singleton.chocolate1;
 
public class ChocolateController {
 public static void main(String args[]) {
  ChocolateBoiler boiler = ChocolateBoiler.getInstance();
  boiler.fill();

  ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
  ChocolateBoiler boiler3 = ChocolateBoiler.getInstance();
  ChocolateBoiler boiler4 = ChocolateBoiler.getInstance();
  ChocolateBoiler boiler5 = ChocolateBoiler.getInstance();
 }
}