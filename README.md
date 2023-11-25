
# Student ID Generator

## Overview
This Java program is a simple student ID generator that allows users to create and store student records. The program has a graphical user interface (GUI) implemented using Swing.

## Features
- Generate new student IDs with associated information.
- Save student information to a text file (`student.txt`).
- Search for and display student information based on ID.

## Getting Started
### Prerequisites
- Java Development Kit (JDK) installed on your machine.

### Running the Program
1. Compile the Java files:
   ```bash
   javac student.java studentobj.java
   ```

2. Run the program:
   ```bash
   java studentobj
   ```

3. The main window will appear, allowing you to create new student records or search for existing ones.

## Usage
1. **Creating a New Student Record**
   - Click the "New" button.
   - Enter the student details in the popup window.
   - Click the "Save" button to save the information to the `student.txt` file.

2. **Searching for a Student Record**
   - Click the "Show" button.
   - Enter the student ID to search for.
   - Click the "Search" button to display the student information.

## File Structure
- `student.java`: Defines the `student` class representing a student with attributes.
- `studentobj.java`: Main class with the GUI and program logic.

## File Storage
- Student records are stored in the `student.txt` file.

## Notes
- The program uses Swing for the GUI.
- Make sure to handle file permissions if there are issues with reading/writing to `student.txt`.

Feel free to customize this README based on the specific details of your project or add any additional information that might be relevant.
