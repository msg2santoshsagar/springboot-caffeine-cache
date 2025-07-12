# springboot-caffeine-cache

A Spring Boot 3 learning project to explore Caffeine Cache integration and usage.

## 📚 Purpose

This project demonstrates how to integrate and use the [Caffeine](https://github.com/ben-manes/caffeine) caching library with Spring Boot. It focuses on practical examples including in-memory caching, eviction policies, and performance insights.

## 🛠 Tech Stack

- Java 21
- Spring Boot 3.5.3
- Caffeine 3.2.1
- Maven

## 📦 Dependencies

Main dependencies included:
- `spring-boot-starter-web`
- `spring-boot-starter-cache`
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

## 🔍 What You Will Learn

- Enabling cache in Spring Boot
- Configuring and customizing Caffeine cache
- Using annotations like `@Cacheable`, `@CachePut`, and `@CacheEvict`
- Defining custom cache configurations like TTL and maximum size

## 📁 Structure

```
src/
 └── main/
     └── java/
         └── com.alfie.springbootcaffeinecache/
```

## 📌 Notes

This is a personal learning repository. Feel free to fork and experiment.

---

> Created by [@msg2santoshsagar](https://github.com/msg2santoshsagar) | Group: `com.alfie`
