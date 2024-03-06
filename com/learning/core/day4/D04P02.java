package com.learning.core.day4;

import java.util.Scanner;

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String Coins;

    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
    }

    public void calculateAverageRating(float critic1, float critic2) {
        this.avgRating = (critic1 + critic2) / 2;
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() throws NotEligibleException {
        if (avgRating >= 7) {
            Coins = "Gold Coin";
        } else if (avgRating >= 5 && avgRating < 7) {
            Coins = "Silver Coin";
        } else if (avgRating >= 2 && avgRating < 5) {
            Coins = "Copper Coin";
        } else {
            throw new NotEligibleException("Player not eligible for any coins");
        }
        return Coins;
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + avgRating);
        System.out.println("Coins: " + Coins);
    }

    // Getter methods for critic ratings
    public float getCritic1() {
        return critic1;
    }

    public float getCritic2() {
        return critic2;
    }

    public float getCritic3() {
        return critic3;
    }
}

public class D04P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player 1's Name:");
        String playerName1 = scanner.nextLine();
        System.out.println("Enter Player 1's three critic ratings:");
        float critic11 = scanner.nextFloat();
        float critic12 = scanner.nextFloat();
        float critic13 = scanner.nextFloat();
        scanner.nextLine(); // Consume newline

        // Create CricketRating instances
        CricketRating player1 = new CricketRating(playerName1, critic11, critic12, critic13);
        
        // Calculate average ratings and display information
        player1.calculateAverageRating(player1.getCritic1(), player1.getCritic2(), player1.getCritic3());
        try {
            player1.calculateCoins();
            player1.display();
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }

       
        scanner.close();
    }
}
