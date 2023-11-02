# Text Adventure Game

A simple text-based adventure game written in Java, demonstrating various Object-Oriented Programming (OOP) principles.

## Table of Contents
1. [Encapsulation](#encapsulation)
2. [Polymorphism](#polymorphism)
3. [Abstract Data Type (ADT)](#abstract-data-type-adt)
4. [Exception Handling](#exception-handling)
5. [Other OOP Features](#other-oop-features)
6. [Usage](#usage)
7. [Contribution](#contribution)

## Encapsulation
Encapsulation is implemented by defining classes with private fields and public methods to access and modify these fields. For instance, the `Player` class encapsulates player-related data and methods.

```java
public class Player extends CharacterStats {
    private int xp;
    private int maxXp;

    public int getMaxXp() {
        return this.maxXp;
    }

    public void setMaxXp(int amount) {
        this.maxXp = amount;
    }

    // ... other methods ...
}
