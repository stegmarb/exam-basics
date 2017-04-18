public class Copy {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("\n Usage:\n copy [source] [destination]");
    } else if (args[0].equals("copy") && args.length == 2) {
      System.out.println("No destination provided!");
    }
  }
}
