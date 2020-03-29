package practice;

import java.util.Scanner;

public class JumpingOnClouds {

  public static void main(final String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int p[] = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = in.nextInt();
    }
    int jump = -1;
    for (int i = 0; i < n; i++ ,jump++) {
      if ((i < (n - 2)) && (p[i + 2] == 0)) {
        i++;
      }
    }
    System.out.println(jump);
  }
}
