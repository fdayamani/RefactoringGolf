Refactoring Golf is a game designed by Jason Gorman (credit to him for the scenarios and most of the code!) to stretch your refactoring muscles and get you to explore your IDE to see what's really possible using shortcuts and automation.

You will find two versions of every project (labeled ROUND_N_A and ROUND_N_B). The _A project is the before (in golf terms, the "tee"), and the _B project is the after (the "hole").

Your goal is to safely and efficiently as possible refactor the _A code to look like the _B code. You must aim to do it in as few "strokes" as possible, incurring as few points as possible.

I have changed the rules a little bit, as my goal is to make sure that the refactoring is done safely, I don't really mind how many changes you make as long as they're safe.

A "stroke" is essentially a (potentially) dangerous change made to the code, and every stroke costs you points.

Your pairing partner should carefully score you as follows:

1 point for every change made to the code without using a shortcut or automated IDE feature (e.g., an automated refactoring, code template, or Find/Replace)
2 points for every change made without running the tests
5 points for every change made while the code cannot pass the tests after the previous change
Zero points for code formatting (e.g., deleting whitespace)

So, you're looking to refactor the _A code into the _B code using as few manual edits as possible, and keeping the tests passing as much as possible, scoring as few points as you can.

Allow yourselves a maximum of 2 attempts at each round to determine your best score.