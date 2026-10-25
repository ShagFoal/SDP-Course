package org.example;

public class Main {
    public static void main(String[] args) {
        double[] scores = {60, 70, 95};
        TournamentScoreCalculator calculator = new TournamentScoreCalculator(new AverageScoreStrategy());

        System.out.println("Average score: " + calculator.calculateScore(scores));

        calculator.setStrategy(new HighestScoreStrategy());
        System.out.println("Highest score: " + calculator.calculateScore(scores));

        calculator.setStrategy(new MedianScoreStrategy());
        System.out.println("Median score: " + calculator.calculateScore(scores));
    }
}
