package com.github.sbouclier.basics

// block body function
fun hello(name: String): Unit {
    println("Hello $name")
}

// Unit is implicit
fun hello2(name: String) {
    println("Hello $name")
}

// expression body
fun hello3(name: String) = println("Hello $name")


fun main(args: Array<String>) {
    hello("John")
    hello2("John")
    hello3("John")
}