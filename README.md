Sudoku Game in Java

This is an interactive Sudoku game implemented in Java, where players can manually fill in the puzzle grid, validate their moves, and solve the puzzle using a built-in backtracking algorithm. The game includes options for resetting the puzzle and an automatic solver.

Table of Contents
Features
How to Play
Installation
Usage
Game Flow
Technologies Used
Contributing
License
Features
Interactive Puzzle: Players can manually fill in cells in a 9x9 Sudoku grid.
Validation: Ensures that the numbers entered by the player comply with Sudoku rules (no duplicates in rows, columns, or 3x3 sub-grids).
Automatic Solver: Allows players to solve the puzzle using a backtracking algorithm.
Reset Functionality: Players can reset the puzzle to its initial state.
Real-Time Feedback: Invalid moves are detected immediately, preventing the player from violating Sudoku constraints.
How to Play
The game starts with a partially filled Sudoku board. You will be prompted to select one of the following options:

Enter a number: Choose a row, column, and a number to fill an empty cell.
Solve the puzzle: Automatically solve the Sudoku using the backtracking algorithm.
Reset the puzzle: Return the board to its original state.
Quit the game: Exit the application.
Validation: Every time you try to place a number in the grid, the game checks whether it’s valid based on Sudoku rules.

Solve the Puzzle: At any time, you can choose to solve the puzzle automatically if you're stuck.

Installation
Clone the repository:

bash
Copy code
git clone 
Navigate to the project directory:

bash
Copy code
cd sudoku-game-java
Compile the Java files:

bash
Copy code
javac SudokuGame.java
Run the game:

bash
Copy code
java SudokuGame
Usage
Once you start the game, a partially filled Sudoku board will be displayed, and you'll have several options:

Options:
1. Enter a number
2. Solve Sudoku
3. Reset board
4. Quit
   
To enter a number, select option 1, and follow the prompts to specify the row, column, and number.
To solve the puzzle, select option 2, and the program will solve the Sudoku automatically.
To reset the puzzle, select option 3, and the board will revert to its initial state.
To quit, select option 4 to exit the game.


Game Flow
Initial Display: The Sudoku puzzle with empty spaces represented by 0.
Player Action: The player is prompted to enter a number or select an option.
Validation: If the number is valid, it is placed in the grid. If not, an error message is displayed.
Puzzle Solving: The player can choose to automatically solve the puzzle or reset it at any time.


Technologies Used
Java: The game is entirely written in Java.
Backtracking Algorithm: For solving the puzzle when the player chooses the solve option.
CLI-based UI: The game runs in a command-line interface for easy interaction.
Contributing
Contributions are welcome! To contribute:


Fork the repository.
Create a new branch (git checkout -b feature-branch).
Make your changes and commit (git commit -am 'Add new feature').
Push to the branch (git push origin feature-branch).
Create a new Pull Request.
Please ensure that your code adheres to the project's coding standards.

License
This project is licensed under the MIT License - see the LICENSE file for details.
