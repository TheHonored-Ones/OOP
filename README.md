# Key OOP Concepts

**Do everything in a seperate class!! Goodluck 💘**

## 1. Classes and Objects
### Class: 
A blueprint or template for creating objects. It defines the properties (fields) and behaviors (methods) that the objects created from the class will have.

### Object:  
An instance of a class. When you create an object, you are instantiating the class, making it a real, usable entity.

```bash
public class Car {
    String model;
    int year;

    public void startEngine() {
        System.out.println("The engine is starting.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2022;
        myCar.startEngine();
    }
}


```

## 2. Encapsulation
**Encapsulation** is about bundling the data (variables) and methods that operate on the data within one unit (a class). It also involves restricting direct access to some of the object's components, which is done through access modifiers (private, public, etc.). Encapsulation helps protect data from unintended modifications and enforces controlled access through getter and setter methods.Encapsulation is implemented using access modifiers and getter/setter methods.
**Private** fields and methods can only be accessed or modified within the class, while **public** methods allow controlled access.

```bash
public class Person {
    private String name; // Private field
    private int age;     // Private field
}
```
Here, the variables cannot be accessed directly from outside the Person class.
Since the variables are private, we need methods to get and update their values safely.
```bash
public class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {  // Ensuring only valid ages are set
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}
```
Now, values can be retrieved or modified only through these controlled methods.

```bash
public class Person {
    private String name;  // Private variable
    private int age;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

```
## 3. Inheritance
**Inheritance** allows one class (child class) to inherit the properties and behaviors of another class (parent class). This allows you to create a new class based on an existing class, which promotes code reuse and avoids duplication.

```bash
public class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

public class Dog extends Animal {
    public void speak() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();  // Output: Bark
    }
}
```

## 4. Polymorphism
**Polymorphism** means "many shapes" and it allows objects of different classes to be treated as objects of a common superclass. It also allows methods to have different behaviors depending on the object that calls them (method overriding).

In **method overriding**, a subclass provides a specific implementation of a method already defined in its superclass.

```bash
public class Animal {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();  // Animal reference but Cat object
        
        myAnimal.sound();  // Output: Some animal sound
        myCat.sound();     // Output: Meow
    }
}
```

## Abstraction

**Abstraction**  is the concept of hiding the complex implementation details and exposing only the necessary features of an object. This allows users to interact with objects without needing to understand their internal workings.

In Java, abstraction can be achieved using **abstract classes** and **interfaces**.

```bash
abstract class Animal {
    abstract void sound();  // Abstract method
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}
```

## Summary
### Classes and Objects:
Define the structure and behavior of your program's entities.
### Encapsulation:
Control access to data and behavior to protect integrity.
### Inheritance :
Reuse code by allowing one class to inherit from another.
### Polymorphism: 
Use the same method or object in different ways (method overriding).
### Abstraction:
Hide unnecessary details and expose only the essential parts of an object.

## Exercies: Mastering OOP in Java
#### Car Factory (Classes and Objects)
Create a class Car with these attributes:

String brand
String model
int year
👉 Inside Car, create a method displayInfo() that prints the car details.
👉 In main(), create 3 Car objects and call displayInfo() on each.
_Example_
```bash
Car car1 = new Car("Toyota", "Corolla", 2020);
car1.displayInfo();  
// Output: Toyota Corolla (2020)
```

#### Person Profile (Constructors)
👉 Create a class Person with:

String name
int age
👉 Add a constructor that initializes these values.
👉 Create a method introduce() that prints:
💡 Example:
```bash
Person p = new Person("Alice", 25);
p.introduce();
// Output: Hi, my name is Alice and I am 25 years old.
```

#### Bank Account (Encapsulation - Getters & Setters
Create a class BankAccount with:

private double balance
👉 Add methods:

deposit(double amount) ✅ Adds money
withdraw(double amount) ✅ Deducts money if sufficient balance
getBalance() ✅ Returns balance
📌 Example:
```bash
BankAccount myAccount = new BankAccount();
myAccount.deposit(1000);
myAccount.withdraw(200);
System.out.println(myAccount.getBalance());
// Output: 800.0
```

#### Student Management(Array of Objects)
 Create a class Student with:

String name
double grade
👉 In main(), create an array of 3 Student objects, assign values, and print their details.

📌 Example:
```bash
Student[] students = {
    new Student("John", 85.5),
    new Student("Emily", 92.0),
    new Student("Mark", 78.5)
};
```
#### Sports Team (Inheritance - Extending a Class)
👉 Create a base class Player with:

String name
int age
👉 Create a subclass BasketballPlayer that adds:

int pointsScored
👉 Override the introduce() method to include points scored.

📌 Example:
```bash
BasketballPlayer player = new BasketballPlayer("LeBron", 36, 35000);
player.introduce();
// Output: I am LeBron, 36 years old, and I have scored 35000 points!
```

#### Superheroes (Polymorphism - Method Overriding)
👉 Create a base class Hero with a method attack().
👉 Create 2 subclasses Superman and Batman, each with their own attack() method.

📌 Example:
```bash
Hero hero1 = new Superman();
Hero hero2 = new Batman();
hero1.attack();  
// Output: Superman uses Laser Eyes!  
hero2.attack();  
// Output: Batman throws Batarangs!  
```

#### Uber System (Interfaces)
👉 Create an interface Vehicle with a method startEngine().
👉 Implement Car and Bike classes that override startEngine().

📌 Example:
```bash
Vehicle car = new Car();
Vehicle bike = new Bike();
car.startEngine();  
// Output: Car engine started!  
bike.startEngine();  
// Output: Bike engine started!  
```

#### Bonus Challenge 🏆: Zoo Simulator
Create a base class Animal with String name and makeSound().
👉 Create subclasses Lion, Dog, and Bird that override makeSound().
👉 Store multiple Animal objects in an array and call makeSound() for each!

📌 Example:
```bash
Animal[] zoo = {new Lion(), new Dog(), new Bird()};
for (Animal a : zoo) {
    a.makeSound();
}
// Output:
// Roar! 🦁
// Woof! 🐶
// Chirp! 🐦
```

