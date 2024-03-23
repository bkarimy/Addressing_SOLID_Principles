# Addressing SOLID Principles

This repository shows the understanding and application of SOLID design principles in a Java project. For each principle, examples are given to show both a violation and a solution that adheres to the principle.

## Single Responsibility Principle (SRP)

### Violation

The `UserService` class in the `violated.SRP` package combines user registration logic with email notification functionality, which is a violation of SRP.

### Solution

The SRP violation is solved by splitting the `UserService` into `UserRegistrar` for handling user registration and `EmailSender` for email notifications, located in the `solved.SRP` package.

## Open/Closed Principle (OCP)

### Violation

In the `violated.OCP` package, the `ReportService` class must be modified every time a new report format is needed, thus violating OCP.

### Solution

The `ReportService` is refactored to allow for easy extension without modification. New report formats can be added by implementing the `Report` interface. Example implementations can be found in `solved.OCP`.

## Liskov Substitution Principle (LSP)

### Violation

The `Square` class in the `violated.LSP` package incorrectly extends the `Rectangle` class, such that squares cannot be used interchangeably with rectangles.

### Solution

In the `solved.LSP` package, both `Square` and `Rectangle` implement a common `Shape` interface, which allows them to be used interchangeably without unexpected behavior.



