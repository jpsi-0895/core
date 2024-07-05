# Coupling and Cohesion in object oriented software

In simple terms, Cohesion is "the code that changes together stays together". Coupling is "a change to one component requires change to another component".

## In software design, cohesion and coupling are two important concepts related to the quality and maintainability of code.

**High Cohesion**:

- High Cohesion means all related items should be tie together for example Car, Kitchen
- Car: All the elements of a car are tightly interconnected and work together towards a single purpose – driving. The engine, wheels, transmission, and other components all have to function in coordination for the car to operate effectively. This high level of cohesion makes the car efficient and reliable.
- Kitchen: Similarly, a kitchen also showcases high cohesion. Appliances, utensils, and ingredients all directly contribute to the single purpose of preparing and cooking food. This makes the kitchen streamlined and facilitates smooth workflow.

**Low Coupling**:

- Low Coupling means modules should not tie together very high, because this cause chain reaction. for example, building homes
- Building Homes: The various modules involved in building a house – foundation, framing, electrical, plumbing – are good examples of low coupling. They can work independently with minimal coordination, and a problem in one module (e.g., plumbing leak) doesn't necessarily impact the others. This makes construction more efficient and avoids cascading failures.

> Good software design has high cohesion and low coupling<span style="color:purple"> *</span>.
