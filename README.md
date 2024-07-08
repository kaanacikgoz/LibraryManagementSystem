# Library Management System

This project includes Maven, Hibernate ORM with JPA, PostgreSQL, and entity relationships including OneToOne, OneToMany, ManyToOne, and ManyToMany. It also demonstrates the use of Fetch and Cascading strategies for performance improvement in ORM.

## Project Rules

### Entity Relationships

- **Book - Author Relationship (One-to-Many):**
  - A book can have one author.
  - An author can have more than one book.

- **Book - Category Relationship (Many-to-Many):**
  - A category can have more than one book.
  - A book can belong to more than one category.

- **Book - Publisher Relationship (One-to-Many):**
  - A book can have one publishing house.
  - A publishing house can have more than one book.

- **Book - BorrowingBook Relationship (One-to-Many):**
  - A book can have more than one borrowing process.
  - Each borrowing process can only belong to one book.

## Tables

### Author Table

![authorTable](https://github.com/kaanacikgoz/LibraryManagementSystem/assets/140348014/22c2e9ca-6178-40d4-8e43-0146f74f4d97)

### Book Borrow Table

![bookBorrowsTable](https://github.com/kaanacikgoz/LibraryManagementSystem/assets/140348014/fa9148c9-ea60-47fc-9abd-3702b59f04a1)

### Book Table

![bookTable](https://github.com/kaanacikgoz/LibraryManagementSystem/assets/140348014/ac0d8d74-1a35-40e6-a45b-2ab20072916b)

### Book to Category Table

![book2categoryTable](https://github.com/kaanacikgoz/LibraryManagementSystem/assets/140348014/5edf7330-34db-49fe-9870-6646b9ca1475)

### Category Table

![categoryTable](https://github.com/kaanacikgoz/LibraryManagementSystem/assets/140348014/bff8f581-15cd-46eb-ad3a-6c964f67bb2d)

### Publisher Table

![publisherTable](https://github.com/kaanacikgoz/LibraryManagementSystem/assets/140348014/a89226ba-c64b-47e5-af28-dcfb8ffaf085)
