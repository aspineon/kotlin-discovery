package com.github.sbouclier.basics

fun main(args: Array<String>) {

    // mutable variable
    var mName: String = "Kotlin"
    mName = "Kotlin v1.1.4"

    // immutable variable
    val iName: String = "Kotlin"
    //iName = "Kotlin v1.1.4" // Val cannot be reassigned

    // type inferrence
    val inferredName = "Kotlin"
}