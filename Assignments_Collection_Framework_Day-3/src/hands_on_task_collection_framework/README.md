# University Course Registration System   BY Anurag Tirole

## Overview
The University Course Registration System is a Java application that allows students to register for courses, drop courses, and manage their enrollment. It leverages the **Java Collections Framework** to efficiently manage students, courses, and registrations.

### Features:
- Register students to courses.
- Handle course waitlists when a course is full.
- Drop courses and automatically promote students from the waitlist.
- View students in courses (sorted by name).
- List courses sorted by the number of enrolled students.
- Filter courses by instructor or credits.

## Core Classes:
- **Student**: Represents a student with `id`, `name`, `email`, `year`, and `branch`.
- **Course**: Represents a course with `courseId`, `courseName`, `instructorName`, `capacity`, `credits`, and collections to manage enrolled students and waitlist.
- **RegistrationSystem**: Manages the registration logic, student enrollments, waitlisting, and course listings.

## Setup and Running the Application:
### Prerequisites:
- Java 8 or higher installed on your machine.
- IntelliJ IDEA or another Java IDE for running the project.

### Steps to Run:

1. **Clone or Download the Project**:
    - If you are using **Git**, clone the repository:
      bash
      git clone https://github.com/your-repository-url
      

    - Alternatively, download the ZIP and extract it to your desired location.

2. **Import the Project in IntelliJ IDEA**:
    - Open IntelliJ IDEA.
    - Click on **File** > **Open**.
    - Select the project directory and click **OK**.

3. **Run the Application**:
    - In the project structure, navigate to the `Main.java` file.
    - Right-click and select **Run 'Main'**.

   Alternatively, if using the terminal:
   bash
   javac Main.java
   java Main
