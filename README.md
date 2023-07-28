
## **Welcome to README-FILE 👋**
___
___

# Blogging Platform[**(Basic Design-SignIn, SignUp)**](#heading-ids) 
![Blogging Platform Logo](https://tse4.mm.bing.net/th?id=OIP.g_U9qq46tlzGLfUXCepJQAHaEM&pid=Api&P=0&h=180)![Api logo](https://tse3.mm.bing.net/th?id=OIP.3Dduvw7ioc7xnI8YVmFyFAHaEO&pid=Api&P=0&h=180)

____

## Table of Contents
1. [Introduction](#introduction)
2. [Technologies & Framework Used](#technologies-used)
3. [Features](#features)
4. [Prerequisites](#features)
5. [Installation](#installation)
6. [Usage](#usage)
7. [API Endpoints](#api-endpoints)
8. [Data Structures](#database-schema)
9. [Security](#security)
10. [Project Summary](#project-summary)
11. [Contributing](#contributing)
12. [License](#Licesne)

> ## Introduction 
*Blogging Platform is a backend project that aims to provide a robust and scalable platform for users to create and manage blog posts, comment on posts, follow other users, and interact with the blogging community. The platform is designed to offer a seamless user experience and allow bloggers to showcase their writing skills and engage with a wider audience.*

-  ## [**Framework and Technologies Used :**](#heading-ids) ##
___
- Java Spring Boot: For building the backend server and managing RESTful endpoints.

- MySQL: As the relational database management system to store user and blog-related data.

- Hibernate: For object-relational mapping between Java entities and the MySQL database.


- Swagger: For API documentation and testing.

- Maven: As the build tool to manage dependencies and run tasks.
- ### Framework : **SpringBoot**
- ### Technologies : **Java, MySQL**
- ### Others : **Java Persistence API (JPA), Swagger UI, Email**


> ## Features

- User Registration and Authentication: Users can sign up, log in, and log out securely using email and password credentials.

- Create and Manage Posts: Authenticated users can create new blog posts, edit their existing posts, and delete their posts.

- Comment on Posts: Authenticated users can add comments to blog posts to share their thoughts and feedback.

- Follow Other Users: Users can follow other bloggers to receive updates and notifications about their new posts.

- Pagination: Posts and comments are paginated to enhance the user experience.

- User-Friendly API: The project provides a well-documented and user-friendly API for easy integration with front-end applications.

-  ## [**Prerequisites :**](#heading-ids) ##
*To run this project, ensure that you have the following installed:*
> - Java Development Kit (JDK)
>- MySQL
>- Maven

-  ## [**Installation :**](#heading-ids) ##

1. Clone the repository from [GitHub link](https://github.com/Moh-Sameer-Khan/Blogging-Platform-API.git).
2. Install Java JDK and Maven on your machine.
3. Set up a MySQL database and configure the database connection in the application.properties file.
4. Run the Maven build to compile the project.
5. Start the application using the command.

## [Usage](#heading-ids) ##

1. After starting the application, access the API documentation at [http://localhost:8080/swagger-ui.html](http://43.204.236.74:8080/swagger-ui/index.html#/) for information on available endpoints and how to interact with the API.

2. Use tools like Postman or any API client to test the various API endpoints.

## [**Data Flow**](#heading-ids) ##

- ## [**API Endpoints Used:**](#heading-ids) ##
___
- ### 1. **Controller (User, Post, AuthenticationToken):-** ###
> - **User Controller :-**  
> 1. `POST /blogs/user/signUp` - *Register a new user with the system.*
> 2. `POST /blogs/user/signIn` - *Authenticate and obtain a token for the Blogging user and By Hashing Password and Using Email*
> 3. `POST /blogs/user/signOut` - 
*Log out a user.*
> 4. `POST /blogs/post` - 
*Create a new blog post.*
> 5. `DELETE /blogs/post` - 
*Delte a blog user.*
> 6. `POST /blogs/comment` - 
*Add a comment on a blog post*
> 7. `DELETE /blogs/comment` - 
*Delete a comment on a blog post*
> 8. `POST /blogs/follow` - 
*FOllow a blog user*
> 9. `DELETE /blogs/unfollow/target/{followId}` - 
*Unfollow a blog user*
> 10. `GET /blog/posts` - 
*Get all posts of a particular blog user*
> 11. `PUT /blogs/post/update` - 
*Update a blog user any post information*
> 12. `PUT /blogs/comment/update` - 
*Update a blog user any post comment information*
> 13. `POST /blogs/postId/pagination` - 
*get paginated blogs posts of a user*



> - **Post Controller :-**  
> 1. `POST /blogs/post` - *Uploading a post an authoize Blogs user*
> 2. `POST /blogs/show/AllPosts` - *See all Posts, An autorize Blogs user*


- ### 2. **DataBase Design:-** ###
> - **Database Used :-**  *SQL/Hibernate Database using*

The database schema consists of the following tables:

1. User: Stores user details like name, email, and password.
2. Post: Contains blog post information, including title, content, and user author.
3. Comment: Stores comments on blog posts, along with the user who made the comment.
4. AuthenticationToken: Manages user authentication tokens.
5. Follow: Stores the following user, follwer
6. Like: Stores the Likes on Post of blogs user


- ### 3. **Model / Entity(User, Post, AuthenticationToken):-** ###
> - **Annotation Used :-**  *@Data, @NoArgsConstructor, @AllArgsConstructor, @Id, @OneToOne, @Column, @JoinColumn, @Entity, @GeneratedValue, @Enumerated, @NotBlank, @Min, @Max, @ManyToMany, @ManyToOne, @JoinTable, @JsonProperty, @NotNull, @Column, @Validated, @Pattern*

## [**Data Structure used in my Project**](#heading-ids) ##
____
> - **[Used :-](#heading-ids)** *SQL Database --> But Mostly used Java Concept, oops, collection, ENUM*

## [**Security**](#heading-ids) ##
____
*Authentication is implemented using an Authentication Token class. This token is generated upon successful sign-in and must be included in the headers of subsequent requests to authorized endpoints.*

## [**Encryption**](#heading-ids) ##
____
*Authentication is implemented using an Authentication Token class. This token is generated upon successful sign-in and must be included in the headers of subsequent requests to authorized endpoints.*


## [**Project Summary**](#heading-ids) ##
____
> - **[Aim :-](#heading-ids)** *This is basically good project for learning purpose springBoot basics, Mappings, Annotation, API, spring mvc and CRUD Operation, swagger, crud Repository inbuilt method, and Custom Finder and Custom Query. In this project i just add Posts, get all psots a particular user,  update User inforamtion lot of things i learned from this project.*

## **[👨‍💻 Sameer](#heading-ids)** ##
____

- Twitter: [@Sameer.twitter](https://twitter.com/Sameerr1819)

- Github: [@Sameer-Github](https://github.com/Moh-Sameer-Khan)


🤝 **Contributing**
___
Contributions, Thanks to everyone , contributing with me and know about more myself [visit my profile](https://www.instagram.com/sameer181911/).

**Show Your Support**
___
Give a ⭐if this project helped you!

- ```bash
  BECOME A SOFTWARE DEVELOPER 👩‍💻

<!-- Here something icon -->

📝 **License**
___
Copyright © 2023 [Moh Sameer Khan](#heading-ids).

This project is [Blogging Platform API](https://choosealicense.com/licenses/mit/) licensed.

___
*This README was generated with* 🧡 *by [readme-md-generator](https://www.makeareadme.com/)*








