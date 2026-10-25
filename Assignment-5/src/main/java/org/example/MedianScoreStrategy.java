package org.example;

import java.util.Arrays;

public class MedianScoreStrategy implements ScoringStrategy {
    @Override
    public double calculate(double[] scores) {
        double[] sortedScores = scores.clone();
        Arrays.sort(sortedScores);
        int middle = sortedScores.length / 2;

        if (sortedScores.length % 2 == 0) {
            return (sortedScores[middle - 1] + sortedScores[middle]) / 2;
        }
        return sortedScores[middle];
    }
}
