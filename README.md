# Number Guessing Game

A simple Java-based console application where players guess a randomly generated number within a specified range based on the chosen difficulty level.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [How to Play](#how-to-play)
- [Installation](#installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## Overview
The Number Guessing Game challenges players to guess a randomly generated number. Players select a difficulty level (1, 2, or 3), which determines the range of possible numbers (50, 100, or 500). The game provides hints ("too high" or "too low") after each guess and limits players to 10 attempts.

## Features
- Three difficulty levels:
  - Level 1: Numbers between 1 and 50
  - Level 2: Numbers between 1 and 100
  - Level 3: Numbers between 1 and 500
- Tracks the number of attempts
- Provides feedback on whether the guess is too high or too low
- Ends the game after 10 failed attempts or a correct guess
- Simple console-based interface

## How to Play
1. Run the program.
2. Enter a difficulty level (1, 2, or 3).
3. Guess a number within the range displayed.
4. Receive feedback on your guess.
5. Continue guessing until you find the correct number or exhaust 10 attempts.
6. The game displays the result (win or loss) and the number of attempts used.

## Installation
1. Ensure you have Java Development Kit (JDK) installed (version 8 or higher recommended).
2. Clone this repository:
   ```bash
   git clone https://github.com/your-username/number-guessing-game.git
Navigate to the project directory:
cd number-guessing-game
##UsageCompile the Java program:
javac Main.java
Run the program:
java Main
LicenseThis project is licensed under the MIT License. See the LICENSE file for details.