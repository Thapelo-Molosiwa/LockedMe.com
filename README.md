# LockedMe.com - File Management Application Prototype

## Project and Developer Details

- **Project Name:** LockedMe.com
- **Developer:** Thapelo Molosiwa
- **Objective:** To develop a prototype for LockedMe.com, a file management application, and present it to stakeholders for budget approval.

## Product Capabilities

The File Management Application aims to provide users with the ability to manage their files effectively via a command line interface. The core capabilities of the application include:

1. **File Retrieval:** Users can retrieve files in ascending order.
2. **File Management:** Users can add new files, delete existing files, and search for specific files.
3. **User Interface:** Command-line based interaction that allows easy navigation and execution of file operations.
4. **Error Handling:** Effective handling of user inputs and exceptions to ensure smooth operation.

## Appearance and User Interactions

### User Interface:

- **Welcome Screen:**
  - Displays the application name and developer details.
  - Provides options to:
    1. Retrieve current file names in ascending order.
    2. Add a file to the existing directory.
    3. Delete a user-specified file from the directory.
    4. Search for a user-specified file in the directory.
    5. Navigate back to the main context.
    6. Close the application.

### User Interactions:

- **Navigation:**
  - Users can navigate between different operations using command-line inputs.
  - Options to return to the main menu or exit the application.

- **Input Handling:**
  - Commands are entered via the command line.
  - Application validates inputs and provides appropriate feedback.

- **Feedback:**
  - Success messages upon completion of actions like adding or deleting a file.
  - Error messages for invalid inputs or operations, such as file not found.

## Core Concepts and Algorithms

### File Retrieval Algorithm:

- **Retrieve and Display Files:**
  - Retrieve the list of files from the specified directory.
  - Sort the list of files in ascending order by name.
  - Display the sorted list to the user.

### Add File Algorithm:

- **Add a New File:**
  - Take the file name input from the user.
  - Validate the file name for any illegal characters or formats.
  - Add the file to the directory if validation passes.
  - Provide feedback to the user about the success or failure of the operation.

### Delete File Algorithm:

- **Delete an Existing File:**
  - Take the file name input from the user.
  - Check if the file exists in the directory.
  - Delete the file if it exists and provide feedback.
  - Display an error message if the file does not exist.

### Search File Algorithm:

- **Search for a File:**
  - Take the file name input from the user.
  - Search the directory for the specified file name.
  - Display the search result to the user.
  - Provide feedback if the file is not found.

### Error Handling:

- Handle cases where the directory is empty or the specified file is not found.
- Validate user inputs to prevent errors such as invalid file names.
- Catch and handle exceptions to prevent application crashes.

## Development Sprints and Tasks

### Sprint 1: Basic Setup and File Retrieval Functionality

- **Setup Project Structure:**
  - Create the initial project structure with necessary directories and files.
  - Set up version control and initial commit on GitHub.

- **Implement Welcome Screen and User Interface:**
  - Design the welcome screen with navigation options.
  - Implement basic UI components for command-line interaction.

- **Implement File Retrieval in Ascending Order:**
  - Develop the algorithm to retrieve and sort files.
  - Display the sorted list on the command line.

### Sprint 2: Add, Delete, and Search File Functionality

- **Implement Add File Feature:**
  - Create the command-line interface for adding files.
  - Develop the logic to add a file and update the file list.

- **Implement Delete File Feature:**
  - Create the command-line interface for deleting files.
  - Develop the logic to delete a file and update the file list.

- **Implement Search File Feature:**
  - Create the command-line interface for searching files.
  - Develop the logic to search for a file and display the result.

- **Handle User Inputs and Exceptions:**
  - Implement input validation for file operations.
  - Develop exception handling mechanisms for different error scenarios.

### Sprint 3: Final Touches and Optimization

- **Refine User Interface:**
  - Improve the command-line interface for better user experience.
  - Ensure consistency and responsiveness across different operations.

- **Optimize Code:**
  - Review and optimize the code for performance.
  - Refactor code to improve readability and maintainability.

- **Prepare Documentation:**
  - Create user documentation to guide users on how to use the application.
  - Prepare developer documentation to help future developers understand the codebase and contribute to the project.

## Java Concepts and Data Structures

- **Java Concepts Used:**
  - Object-Oriented Programming (OOP)
  - Exception Handling
  - File I/O Operations
  - Collections Framework (e.g., ArrayList)
  - Command-Line Interface (CLI)

- **Data Structures and Algorithms:**
  - **Sorting:** Used to display files in ascending order.
  - **Searching:** Linear search to find specific files by name.
  - **Collections:** ArrayList to manage the list of files.

## Flowchart of the Application

### Flowchart Overview:

1. **Start**
2. **Display Welcome Screen**
   - Options: Retrieve files, Add file, Delete file, Search file, Exit
3. **Retrieve Files:**
   - Display files in ascending order
4. **Add File:**
   - Input file name
   - Validate and add file
   - Display success/failure message
5. **Delete File:**
   - Input file name
   - Check if file exists
   - Delete file if exists
   - Display success/failure message
6. **Search File:**
   - Input file name
   - Search for file
   - Display search result
7. **Exit**
8. **End**


## Conclusion and Unique Selling Points (USPs)

### Conclusion:

The LockedMe.com file management application prototype aims to digitize file operations for Company Lockers Pvt. Ltd. By completing the features in planned sprints, the application ensures a structured and efficient development process, resulting in a functional and user-friendly prototype.

### Unique Selling Points:

- **Ease of Use:** Simple command-line interface for efficient file management.
- **Robust Functionality:** Comprehensive file operations including retrieval, addition, deletion, and search.
- **Scalability:** Well-structured codebase allows for easy enhancements and future development.
- **Error Handling:** Effective input validation and exception handling to ensure smooth operation.
- **Optimized Performance:** Use of appropriate data structures and algorithms for efficient file management.

## Appendix

### Java Concepts and Technologies

- **Object-Oriented Programming (OOP):** Utilized to create a modular and maintainable code structure.
- **Exception Handling:** Ensures robust error management and prevents application crashes.
- **File I/O Operations:** Manages file reading, writing, and manipulation.
- **Collections Framework:** Implements dynamic data structures for storing file information.
- **Command-Line Interface (CLI):** Facilitates user interaction with the application through a command-line interface.


