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


<---------------------------------->


# ProxyPatternExample

This project demonstrates the Proxy Pattern by implementing an image viewer application that loads images from a remote server with lazy initialization and caching.

## How to Run

1. Compile the project:

   ```bash
   javac -d bin src/com/example/image/*.java src/com/example/test/ProxyPatternTest.java

