package command;

public class Living{
  private static boolean value = false;

  public static void on(){
    value = true;
    System.out.println("Light in Living Room is "+value);
  }

  public static void off(){
    value = false;
    System.out.println("Light in Living Room is "+value);
  }
}
