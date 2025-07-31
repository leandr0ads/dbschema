# DB Schema Manager 🗃️

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white)

A visual database table creation tool that generates SQL through an intuitive web interface.

## ✨ Features

- **Visual Table Designer** - Create tables without writing SQL
- **Smart Column Management**:
  - Auto-configure fields based on data types
  - Dynamic length restrictions
  - Nullable/NotNull controls
- **SQL Generation** - Get production-ready CREATE TABLE scripts
- **Bootstrap UI** - Clean, responsive interface

## 🚀 Quick Start

### Prerequisites
- Java 21
- Maven 3.9+
- SQL Server (or change DB in `application.properties`)

### Installation
```bash
git clone https://github.com/yourusername/dbschema.git
cd dbschema
mvn spring-boot:run
