## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


#####DECORATOR README


# DecoratorPatternExample

This project demonstrates the Decorator Pattern by implementing a notification system where notifications can be sent via multiple channels (e.g., Email, SMS, Slack).

## How to Run

1. Compile the project:

   ```bash
   javac -d bin src/com/example/notifier/*.java src/com/example/test/DecoratorPatternTest.java
