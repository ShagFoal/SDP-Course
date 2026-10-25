# Assignment 5 — Strategy: Tournament Score Calculator

A Java program that calculates a tournament participant's final score from judges' scores.

`ScoringStrategy` declares `calculate(double[] scores)`. Its implementations provide three scoring rules:

| Strategy | Rule |
| --- | --- |
| `AverageScoreStrategy` | Arithmetic mean of all scores |
| `HighestScoreStrategy` | Highest score |
| `MedianScoreStrategy` | Middle score after sorting, or the mean of the two middle scores |

`TournamentScoreCalculator` stores a strategy and delegates calculation to it.
It requires a non-null strategy and a non-empty array of scores.
`Main` selects each strategy and switches it at runtime on the same calculator.
The median strategy sorts a copy, preserving the original scores.

For scores `60, 70, 95`, the program prints:

```text
Average score: 75.0
Highest score: 95.0
Median score: 70.0
```

## Clean Code Principles

1. **Polymorphism:** the calculator calls the strategy interface without `if` or `switch` on strategy types.
2. **Meaningful names:** each class name describes its scoring rule, and `setStrategy` clearly expresses runtime replacement.
3. **Single responsibility:** each strategy implements one scoring algorithm; the calculator delegates; the client selects strategies.
4. **Encapsulation:** the strategy reference is private, and the calculator knows only the interface, without concrete algorithm details.
5. **Open/Closed Principle:** a new rule requires a new `ScoringStrategy` implementation selected by the client; the calculator and existing strategies need no changes.
