# Text Adventure Game

A simple text-based adventure game written in Java, demonstrating various Object-Oriented Programming (OOP) principles.

## Table of Contents
1. [Encapsulation](#encapsulation)
2. [Polymorphism](#polymorphism)
3. [Abstract Data Type (ADT)](#abstract-data-type-adt)
4. [Exception Handling](#exception-handling)
5. [Inheritance](#inheritance)
6. [Open / Closed Principle](#open-/-closed-principle)
7. [Factory Pattern](#factory-pattern)
8. [Info](#info)

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
## Exception Handling
Exception handling is using different methods to avoid bugs/crashes in our program, we used try and catch in our input procession system in `GameLogic` class:
```java
public static int choice(String question, int choices) {
        announce(question);
        Scanner sc = new Scanner(System.in);
        int choice = -1; // Initializing with an invalid value

        while (choice < 1 || choice > choices) {
            try {
                choice = sc.nextInt();

                if (choice < 1 || choice > choices) {
                    System.out.println("Please enter a number between 1 and " + choices + "!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                sc.next(); // Consume the invalid token to avoid infinite loop
            }
        }
        return choice;
    }
```
## Inheritace
Inheritance is using parent and child classes, children of a parent inherit all of their methods and attributes, we used Inheritance many times and `Player` and `Enemy` and all Enemy subclasses are examples of it:
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
    public class Enemy extends CharacterStats{
    public Enemy(){
        this.setStatus(true);
    }

}
public class Assassin extends Enemy {
    public Assassin(int level){
        super();

        this.setName("Assassin");
        this.setMaxHealth((40*(level*1)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(4+level);
    }
}
```
## Open / Closed Principle
a good OOP design is one that is open to extension but closed to modification, in our code, we used a parent `Enemy` class and many subclasses of it defining different type of enemies, so that whenever we want to add one, we only have to create a new class:
![image](https://github.com/arsamezzati/OOP-Project/assets/73330803/8ac6b6a6-1d61-4925-91ff-f4fe65e5d401)
![image](https://github.com/arsamezzati/OOP-Project/assets/73330803/4d2b7ed9-19a7-4c9d-87e4-46b554de16bb)
```java
public class Goblin extends Enemy {

    public Goblin(int level) {
        super();
        this.setName("Goblin");
        this.setMaxHealth((int) (40*(level*1)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(2+level);
    }
```
## Factory Pattern
a design pattern that enables creating objects without specifying/hard coding the exact class, we used it in our `EnemyGenerator` class using a random generator method:
```java
public class EnemyGenerator extends EventManager {
    private static final String[] enemies = {"Goblin", "Assassin", "Shadow", "HuntingTroll"};

    public static Enemy generateEnemy(Player p) {
        Random random = new Random();
        int num = random.nextInt(enemies.length);
        String enemy = enemies[num];
        return switch (enemy) {
            case "Goblin" -> new Goblin(p.getLevel());
            case "Assassin" -> new Assassin(p.getLevel());
            case "HuntingTroll" -> new HuntingTroll(p.getLevel());
            case "Shadow" -> new Shadow(p.getLevel());
            default -> throw new IllegalStateException("Unexpected Value: " + enemy);
        };
    }
```
## Info
We developed a text adventure game using Java, fully OOP oriented, This is a CMD RPG game that has no end, everything scales up as the Player levels up, spells, loot, enemies...
in this game we used a turned base approach using differet choices that could lead up to a Game Over or some nice loot.
First you Enter your name, and then you explore the game until something comes up using the random event system that we coded.
once an Event like a dungeon is found, the player will have the choice to enter it, or to continue exploring.
same thing goes for enemies.



