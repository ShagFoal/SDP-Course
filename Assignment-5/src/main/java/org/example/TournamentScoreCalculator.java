package org.example;

import java.util.Objects;

public final class TournamentScoreCalculator {
    private ScoringStrategy strategy;

    public TournamentScoreCalculator(ScoringStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(ScoringStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "Strategy must not be null");
    }

    public double calculateScore(double[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("At least one score is required");
        }
        return strategy.calculate(scores);
    }
}
