import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Copy {
  public static void main(String[] args) {
    argumentConditions(args);
  }

  public static void argumentConditions(String[] args) {
    if (args.length == 0) {
      System.out.println("\n Usage:\n copy [source] [destination]");
    } else if (args[0].equals("copy") && args.length == 1) {
      System.out.println("No source and destination provided!");
    } else if (args[0].equals("copy") && args.length == 2) {
      System.out.println("No destination provided!");
    } else if (args[0].equals("copy") && args.length == 3) {
      copyPasteSourceToDestination(args[1], args[2]);
    }
  }

  public static void copyPasteSourceToDestination(String source, String destination) {
    Path sourcePath = Paths.get(source);
    Path destinationPath = Paths.get(destination);
    try {
      List<String> lines = Files.readAllLines(sourcePath);
      try {
        Files.createFile(destinationPath);
      } catch (IOException e) {
        System.out.println("Unable to reach destination!");
      }
      Files.write(destinationPath, lines);
    } catch (IOException e) {
      System.out.println("Unable to read source file!");
    }
  }
}
