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
Encapsulation is hiding/restricting data using access modifiers such as Private/Protected, here's one example of many Encapsulations in our code:

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

}
```

## Polymorphism
Polymorphism is using Multi-purpose methods and classes, in our code, we used polymorphism using overriding in EventManager class and it's sub-classes:
```java
public class EventManager {
    // list of events
    private static final String[] events = {"Dungeon","Enemy","Fountain","Treasure"};

    public static void trigger(Player p) {
...
}
```
The trigger method will be overridden in multiple subclasses of EventManager such ass Dungeon:
```java
public static void trigger(Player p) { 
        GameLogic.announce("YOU FOUND A DUNGEON");
        int choice = GameLogic.choice("Do you want to explore it?\n1) Yes\n2) No", 2);
        if (choice == 1) {
            Dungeon d = new Dungeon(p);
            d.randomGen(p);
            GameLogic.dungeonLoop(d, p);
        }  
    }
```
## Abstract Data Type (ADT)
An abstract data type is a data that hides/encapsulates methods and attributes in itself, in this case, we have an abstract class called `CharacterStats`:
```java
public class CharacterStats {
    private int level;
    public int getLevel(){
        return this.level;
    }
    public void setLevel(int amount){
        this.level = amount;
    }
    private int maxHealth;
    // status of the character ( dead = False, alive = True )
    private boolean status;
    public boolean getStatus(){
        return this.status;
    }
....
```
Both `Player` and `Enemy` use this abstract class:
```java
public class Player extends CharacterStats {
    public Player(String name,int health,int damage){
        this.setName(name);
        this.setAttackDamage(damage);
        this.setMaxHealth(health);
        this.setCurHealth(this.getMaxHealth());
        this.setStatus(true);
        this.setLevel(1);
        this.xp = 0;
        this.maxXp = 50;
    }...
```

