# Object-Oriented Programming

## Terminology

- class, object (and the difference between the two)
- instantiation
- method (as opposed to, say, a C function)
- virtual method, pure virtual method
- class/static method
- static/class initializer
- constructor
- destructor/finalizer
- superclass or base class
- subclass or derived class
- inheritance
- encapsulation
- multiple inheritance (and give an example)
- delegation/forwarding
- composition/aggregation
- abstract class
- interface/protocol (and different from abstract class)
- method overriding
- method overloading (and difference from overriding)
- polymorphism (without resorting to examples)
- is-a versus has-a relationships (with examples)
- method signatures (what's included in one)
- method visibility (e.g. public/private/other)

**Object**: state and beharvior.

**Class**: the blue print from which individual objects are created. A class is composed of a name, attributes, and operations.

**Inheritance**: the ability of a new class to be created, from an existing class by extending it. Allows classes to inherit commonly used state and behavior from other classes.

**Interface**: a group of related methods with empty bodies (could be implemented by other classes).

A class and an interface are two different types (conceptually). Theoretically a class emphasis the idea of encapsulation, while an interface emphasis the idea of abstraction (by suppressing the details of the implementation). The two poses a clear separation from one to another.

**Package**: a namespace that organizes a set of related classes and interfaces.

**Encapsulation**: pack data and functions into a single component. Hide how a class does its business, while allowing other classes to make requests of it.

**Association**: a relationship between two classes. It allows one object instance to cause another to perform an action on its behalf.

Association is a *has-a* relationship between two classes where there is no particular ownership in place. It is just the connectivity between the two classes. When you define a variable of one class in another class, you enable first to associate functions and properties of the second class. Then again  both Aggregation and Composition are types of Association.

Aggregation is a weak type of Association with partial ownership. For an Aggregation relationship, we use the term *uses* to imply a weak *has-a* relationship. This is weak compared to Composition. Then again, weak meaning the linked components of the aggregator may survive the aggregations life-cycle without the existence of their parent objects. For example, a school department *uses* teachers. Any teacher may belong to more than one department. And so, if a department ceases to exist, the teacher will still exist.

On the other hand, Composition is a strong type of Association with full ownership. This is strong compared to the weak Aggregation. For a Composition relationship, we use the term *owns* to imply a strong *has-a* relationship. For example, a department *owns* courses, which means that the any course's life-cycle depends on the department's life-cycle. Hence, if a department ceases to exist, the underlying courses will cease to exist as well.

Whenever there is no ownership in place, we regard such a relationship as just an Association and we simply use the *has-a* term, or sometimes the verb describing the relationship. For example, a teacher *has-a* or *teaches* a student. There is no ownership between the teacher and the student, and each has their own life-cycle.

**Abstraction**: an emphasis on the idea, qualities and properties rather than the particulars (a suppression of detail).

**Generalization**: reduces complexity by replacing multiple entities which perform similar functions with a single construct.

**Abstract class**:

- cannot be instantiated
- can only be used as a super-class for other classes that extend the abstract class.
- a class can inherit only from one abstract class

There are quite a big difference between an **interface** and an **abstract class**, even though both look similar.

- Interface definition begins with a keyword interface so it is of type interface
- Abstract classes are declared with the abstract keyword so it is of type class
- Interface has no implementation, but they have to be implemented.
- Abstract class’s methods can have their own default implementations and they may be extended. The Abstract class’s methods could run independant of the inherting class.
- Interfaces can only have method declaration (implicitly public and abstract) and properties (implicitly public static)
- Abstract class’s methods can’t have implementation only when declared abstract.
- Interface can inherit more than one interfaces
- Abstract class can implement more than one interfaces, but can inherit only one class
- Abstract class must override all abstract method and may override virtual methods
- Interface can be used when the implementation is changing
- Abstract class can be used to provide some default behavior for a base class.
- Interface makes implementation interchangeable
- Interface increase security by hiding the implementation
- Abstract class can be used when implementing framework
- Abstract classes are an excellent way to create planned inheritance hierarchies and also to use as non-leaf classes in class hierarchies.

**Polymorphism**: the ability to request that the same operations be performed by a wide range of different types of things.

**Method Overloading**: the ability to define several methods all with the same name.

**Method Overriding**: allows a subclass to override a specific implementation of a method that is already provided by one of its super-classes.

## SDLC (Software Development Life Cycle)

#### Phases

- Investigation: business opportunities and problems are identified, and information technology solutions are discussed.
- System analysis: to determine where the problem is in an attempt to fix the system.
- Design: In systems design the design functions and operations are described in detail, including screen layouts, business rules, process diagrams and other documentation.
- Testing
- Operations and maintenance

#### UML (The Unified Modeling Language)

UML is used to specify, visualize, modify, construct and document the artifacts of an object-oriented software-intensive system under development.

14 types of diagrams divided into two categories:

- Static (structural)
    - Uses case
    - Class
- Dynamic (behavioral, includes time axis)
    - Sequence
    - Activity

A **use case** is a summary of scenarios for a single task or goal. An **actor** is who or what initiates the events involved in that task.

Use case diagrams are helpful in three areas:

- Determing features (requirements)
- Communicating with clients
- Generating test cases

A **class diagram** gives an overview of a system by showing its classes and the relationships among them.

A **sequence diagram** shows object interactions arranged in a time sequence.

#### Approaches

- Object-oriented programming
- Waterfall development
- Spiral development
- Rapid application development
- Scrum
- Rational Unified Process
- Agile Unified Process