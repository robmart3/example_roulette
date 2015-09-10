# example_roulette

Name: Rob Martorano and Wuming Zhang
Netids: rfm21 and wz48


Program to refactor that plays a game of roulette


1.  The refactored code is first off much easier to read.  We removed if statements and were instead able to implement the different game methods using subclasses.  This makes the implementation happen more "behind the scenes".  When adding features the process is much faster.  The only thing required for a new mode is a new subclass with the prompt and win loss condition.

2. The refactored code was more complex because we added multiple subclasses that did not exists before-hand.

3. For our trade-offs we exchanged less classes for clearer functions with less if statements and better structure.  We created a slightly more complicated solution, but one that is way more flexible.

4.We prefer our new code much  more.  It is easier to modify and understand.

