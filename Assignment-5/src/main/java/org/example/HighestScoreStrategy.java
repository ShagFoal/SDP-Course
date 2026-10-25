package org.example;

public class HighestScoreStrategy implements ScoringStrategy {
    @Override
    public double calculate(double[] scores) {
        double highest = scores[0];
        for (double score : scores) {
            highest = Math.max(highest, score);
        }
        return highest;
    }
}
