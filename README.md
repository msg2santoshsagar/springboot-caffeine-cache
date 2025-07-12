# springboot-caffeine-cache

A Spring Boot 3 learning project to explore Caffeine Cache integration and usage.

## 📚 Purpose

This project demonstrates how to integrate and use the [Caffeine](https://github.com/ben-manes/caffeine) caching library with Spring Boot. It focuses on practical examples including in-memory caching, eviction policies, and cache abstraction best practices.

## 🛠 Tech Stack

- Java 21
- Spring Boot 3.5.3
- Caffeine 3.x
- Maven

## 📦 Dependencies

Main dependencies included:
- `spring-boot-starter-web`
- `spring-boot-starter-cache`
- `spring-boot-starter-actuator`
- `com.github.ben-manes.caffeine:caffeine`
- `lombok` (optional)
- `spring-boot-starter-test`

## 🚀 Getting Started

### Prerequisites

- Java 21
- Maven

### Run the Application

```bash
mvn spring-boot:run
```

### Build

```bash
mvn clean install
```

## 📂 Package Structure

```
com.alfie.springbootcaffeinecache
├── controllers
│   └── EmployeeController.java
│   └── VersionApiController.java
├── models
│   └── Employee.java
├── repositories
│   └── EmployeeRepository.java
├── services
│   └── EmployeeService.java
├── utils
│   └── CacheHelper.java
└── config
    └── CacheConfiguration.java
```

## 🔍 What You Will Learn

- How to enable and configure caching in Spring Boot
- How to use Caffeine for fast in-memory caching
- Best practices for using `@Cacheable`, `@CacheEvict`, and `@CachePut`
- Managing cache keys and types properly to avoid runtime issues
- Dynamically assigning cache templates based on cache name

## 📌 Notes

This is a personal learning repository. Feel free to fork and experiment.

---

> Created by [@msg2santoshsagar](https://github.com/msg2santoshsagar) | Group: `com.alfie`
