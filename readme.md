* Creational Patterns: These patterns help in creating objects/defining object class. The objects
  constructed are decoupled from the implemented system. ex - Factory design pattern, Builder
  design, Prototype design, Singleton design, Abstract Factory design, Object pool.\
  \
* Structural Patterns: These patterns help in defining how the structures of classes and objects
  should be like for defining the composition between classes, interfaces and objects. ex - Adaptor
  design, Facade design, Decorator design, proxy design etc.\
  \
* Behavioural Patterns: These patterns help to define how the objects should communicate and
  interact with one another. ex - Command pattern, Iterator pattern, Observer pattern, Strategy
  pattern, etc.

### Creational Patterns

### Structural Patterns

#### Facade- is a structural design pattern that provides a simplified (but limited) interface to a complex system of classes, library or framework.Facade can be recognized in a class that has a simple interface, but delegates most of the work to other classes. Usually, facades manage the full life cycle of objects they use.

#### Flyweight- is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.Flyweight can be recognized by a creation method that returns cached objects instead of creating new.

#### Bridge Pattern- bridge pattern is a structural design pattern which divides business logic and huge class into separate class hierarchy which can be developed independently. For example- let's say we have Red/Blue Square/triangle classes. so rather than having these four concrete implementation we could have Shape which has colour. and different shapes and colors can be built independently.

#### Composite- is a structural design pattern that allows composing objects into a tree-like structure and work with the it as if it was a singular object.Composite became a pretty popular solution for the most problems that require building a tree structure. Composite’s great feature is the ability to run methods recursively over the whole tree structure and sum up the results.

### Behavioral Patterns

#### Chain of Responsibility- is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

#### Command Pattern- is a behavioral design pattern that lets you encapsulate requests as objects and the interface acts differently based on request objects.

#### Iterator Pattern- is a behavioral design pattern that lets you traverse through a collection of elements without exposing its internal representation (lists, stack, tree etc)

#### Mediator- is a behavioral design pattern that reduces coupling between components of a program by making them communicate indirectly, through a special mediator object.Eg- Controller part of MVC pattern, java.util.concurrent.ExecutorService (invokeXXX() and submit() methods,java.util.concurrent.Executor#execute(),ScheduledExecutorService (all scheduleXXX() methods)

#### Memento- is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.The Memento’s principle can be achieved using serialization, which is quite common in Java. While it’s not the only and the most efficient way to make snapshots of an object’s state, it still allows storing state backups while protecting the originator’s structure from other objects.

#### State- is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.eg- if flag is true then poll while if it is false then push (pub-sub)

#### Visitor- is a behavioral design pattern that allows adding new behaviors to existing class hierarchy without altering any existing code.