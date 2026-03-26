package com.medalyze;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("=== Medalyze System ===");
      System.out.println("Choose what to run:");
      System.out.println("1 → Deliverable 1 (Creational Patterns)");
      System.out.println("2 → Deliverable 2 (Structural Patterns)");
      System.out.print("Enter choice: ");

      int choice = scanner.nextInt();
      System.out.println();

      switch (choice) {
          case 1:
              MainD1.main(args);
              break;

          case 2:
              MainD2.main(args);
              break;

          default:
              System.out.println("Invalid choice.");
      }

      scanner.close();
  }
}
