# Dice Roller — Java

A simple **console-based Dice Roller application built with Java**. The program allows the user to choose how many dice to roll, generates random values for each die, displays an ASCII representation of the result, and calculates the total.

# Features

* Choose the number of dice to roll
* Generate random dice values from 1 to 6
* Display an ASCII dice for every roll
* Calculate the total of all dice
* Validates that the number of dice is greater than 0
* Uses Java's `Random` class for random numbers
* Uses `Scanner` for user input

# Technologies Used

* Java
* `Scanner`
* `Random`
* Loops
* Conditional statements
* Switch expressions
* Methods
* Text blocks

# How It Works

The program first asks the user how many dice they want to roll.

For each die, the program:

1. Generates a random number between `1` and `6`.
2. Displays the corresponding ASCII dice.
3. Prints the rolled number.
4. Adds the number to the total.

Finally, the program displays the total value of all the dice.

# Example Output

```text
Enter the number of Dice: 3

 -------
| ⸰   ⸰ |
|       |
| ⸰   ⸰ |
 -------

You rolled 4

 -------
| ⸰     |
|   ⸰   |
|     ⸰ |
 -------

You rolled 3

 -------
| ⸰   ⸰ |
| ⸰   ⸰ |
| ⸰   ⸰ |
 -------

You rolled 6

Total: 13
```

# Project Structure

```text
Dice-Roller/
│
├── DiceRoller.java
└── README.md
```

# Requirements

You need **Java JDK 15 or later**, because the project uses Java text blocks.

A newer JDK is recommended.

# How to Run

## Clone the Repository

```bash
git clone <your-repository-url>
```

## Navigate to the Project

```bash
cd Dice-Roller
```

## Compile

```bash
javac DiceRoller.java
```

## Run

```bash
java DiceRoller
```

# Concepts Practiced

This project helped practice several Java fundamentals:

* Variables
* User input
* `if-else`
* `for` loops
* Methods
* `switch`
* `Random`
* `Scanner`
* String concatenation
* Java text blocks
* Basic program validation

# Future Improvements

* Add an option to roll again without restarting the program
* Add a maximum number of dice
* Improve the ASCII dice design
* Display all dice horizontally
* Add a graphical user interface
* Add a history of previous rolls

# Author

**Ahad Hossain Khan**

# License

This project is created for **learning and practice purposes**.
