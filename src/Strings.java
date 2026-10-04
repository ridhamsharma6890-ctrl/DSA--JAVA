import java.util.*;

public class Strings {
    public static void main(String args[]) {
StringBuilder sb = new StringBuilder("Ridham");
System.out.println(sb);

// printing character at indexes
        System.out.println(sb.charAt(0));

        // inserting character at indexes
      sb.setCharAt(0,'p');
      System.out.println(sb);

      // Deleting extra characters
        sb.delete(2,3);
        System.out.println(sb);
    }

    }