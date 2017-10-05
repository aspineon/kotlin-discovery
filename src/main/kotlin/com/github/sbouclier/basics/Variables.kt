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

    // initialized with condition
    val version = "1.1.4"
    val iName2: String
    if(version == "1.1.4") {
        iName2 = "Kotlin v1.1.4"
    } else {
        iName2 = "Kotlin other version"
    }

    // warning: reference is immutable but object can be mutable
    val versions = arrayListOf("1.1.2", "1.1.3")
    versions.add("1.1.4")
}