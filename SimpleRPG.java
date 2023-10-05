import java.util.Random;
import java.util.Scanner;

public class SimpleRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Halo pon!");
        System.out.println("Main game dulu lah biar santuy");

        int playerHealth = 100;
        int monsterHealth = 100;

        while (playerHealth > 0 && monsterHealth > 0) {
            System.out.println("\nHP Paundra: " + playerHealth);
            System.out.println("\nHP Jeskris: " + monsterHealth);
            System.out.println("\n1. Attack");
            System.out.println("2. Heal");
            System.out.print("Choose your action (1/2): ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                int damageDealt = random.nextInt(20) + 1;
                int damageTaken = random.nextInt(15) + 1;

                monsterHealth -= damageDealt;
                playerHealth -= damageTaken;

                System.out.println("\nYou dealt " + damageDealt + " damage to Jeskris.");
                System.out.println("Jeskris dealt " + damageTaken + " damage to you.");
            } else if (choice == 2) {
                int healAmount = random.nextInt(20) + 10;
                playerHealth += healAmount;

                System.out.println("\nYou healed yourself for " + healAmount + " HP.");
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }
        }

        if (playerHealth <= 0) {
            System.out.println("\nGame Over! You were defeated by jeskris:(.");
        } else {
            System.out.println("\nCongratulations! You defeated  jeskris, ALLAHUAKBAR!");
        }

        scanner.close();
    }
}