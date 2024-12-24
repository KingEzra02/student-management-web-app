# Student Management web app

This is a Java EE-based web application for managing student information. It allows teachers to add, edit, find, and remove student records, while students can only view the list of students.

## Features
- **Role-Based Access Control**:
  - Students: View all students.
  - Teachers: Add, edit, find, and remove student records.
- **Custom Authentication**: Secure login using a custom login page.
- **Session Management**: Automatic session timeout after 30 minutes of inactivity.
- **Error Handling**: Friendly error pages for unauthorized access and login failures.

## Technologies Used
- **Backend**: Java EE Servlets
- **Frontend**: JSP (JavaServer Pages)
- **Authentication**: FORM-based authentication with roles (`student` and `teacher`).
- **Database**: (Specify database used, e.g., MySQL, PostgreSQL, etc.)
- **Server**: (Specify application server used, e.g., Apache Tomcat, WildFly, etc.)

## Project Structure
- `src/za/ac/tut/web`: Contains servlet classes (`AddStudentServlet`, `EditStudentServlet`, etc.).
- `web/WEB-INF/web.xml`: Configuration file for servlets, security, and deployment.

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-web-app.git
