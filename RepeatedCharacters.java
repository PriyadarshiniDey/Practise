package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedCharacters {


  static long repeatedString(final String s, final long n) {
    long count = 0;
    long whole = n / s.length();
    int remainder = (int) (n % s.length());
    for (char ch : s.toCharArray()) {
      if (ch == 'a') {
        count++;
      }
    }
    long rep = count * whole;
    if (remainder == 0) {
      return rep;
    }
    else {
      String rem = s.substring(0, remainder);
      for (char ch : rem.toCharArray()) {
        if (ch == 'a') {
          rep++;
        }
      }
      return rep;
    }


  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(final String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String s = scanner.nextLine();

    long n = scanner.nextLong();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    long result = repeatedString(s, n);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
