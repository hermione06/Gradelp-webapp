# Average Calculator Web App - GRADELP

## Aim

The aim of this web app is to ease the average calculation of grades by allowing grades for various subjects to be input and the weighted average to be automatically calculated based on predefined coefficients.

The app also serves as an example of how modern web technologies (Spring Boot, JavaScript, HTML, and CSS) can be applied to solve practical issues efficiently.

## Description

A web app for calculating weighted averages of grades based on user inputs and predefined coefficients. The app allows users to input grades for various subjects and calculates the overall average based on their respective weights.

## Features

- User-friendly interface to input grades for multiple subjects.
- Calculation of weighted average based on predefined coefficients for each subject.
- Real-time display of the calculated average.
- Built using Spring Boot for the backend and Gradle for build automation.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Spring Boot (Java)
- **Build Tool**: Gradle

## Setup and Installation

### Prerequisites

1. **JDK 8 or higher**: Ensure that you have the Java Development Kit installed.
2. **Gradle**: The project uses Gradle for building and running the application. Gradle Wrapper is included, so no need to install Gradle manually.
3. **Git**: To clone the repository.

### Clone the Repository

```bash
git clone https://github.com/your-username/Gradelp-webapp.git
```
### Build and Run the Application
### Navigate to the project folder:
```bash
cd Gradelp-webapp
```
### Build the project using Gradle:
```bash
./gradlew build
```
### Run the application:
```bash
./gradlew bootRun
```
The application will start on http://localhost:8080.

## Usage
Open the app in your browser (http://localhost:8080).
Enter the grades for each subject in the input fields.
Click the "Calculate" button to calculate the weighted average.
The calculated average will be displayed below the form.

## Contributing
Feel free to fork the repository and submit pull requests. Contributions are welcome!

## License
This project is licensed under the MIT License - see the LICENSE file for details.
