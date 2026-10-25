package org.example;

public class AverageScoreStrategy implements ScoringStrategy {
    @Override
    public double calculate(double[] scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }
}
