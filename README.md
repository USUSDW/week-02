# Software Development Workshop
### Week 2: The Adapter Pattern

[![Run on Repl](https://repl.it/badge/github/USUSDW/week-02.png)](https://repl.it/github/USUSDW/week-02)

Wikipedia on the [Adapter Pattern](https://en.wikipedia.org/wiki/Adapter_pattern)

In today's workshop, we're going to be looking at a design pattern called the Adapter. This is used when we can't modify
classes, or are getting things from external sources that need to be adjusted for our own APIs. 

## Setup
Clone or download this project, and open it in IntelliJ Idea or Repl.it.

## Workshop
We have an old piece of server management software that needs to be updated. You've been tasked with cleaning it up, so 
that we can add new types of servers to the software more easily. The first step on this journey is writing some code 
that can start each of the servers in the proper order. The main places we'll be working are in the `servers` package 
and the `io` package.

## Credits
* Google, for [gson](https://github.com/google/gson) which was used for json parsing.
* Andrey Somov, for [snakeyaml](https://bitbucket.org/asomov/snakeyaml/src/default/) which was used for yaml parsing.