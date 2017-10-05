package com.github.sbouclier.basics

fun main(args: Array<String>) {

    // 8-bit
    val byte: Byte = 127

    // 16-bit
    val short: Short = 3276

    // 32-bit
    val int = 123_456
    val float = 123.4F
    val hexadecimal = 0xAB
    val binary = 0b01010101

    // 64-bit
    val long = 123456L
    val double = 123.456

    val number: Number = 123.456

    println(number.javaClass) // class java.lang.Double
    println(double.javaClass) // double

    // ========== underscore usage ==========

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    // ========== autoboxing ==========

    val a: Int = 1000
    val anotherA:Int = a
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    print("referential equality: " + (a === anotherA)) // true
    println(", structural equality: " + (a == anotherA)) // true

    print("referential equality: " + (boxedA === anotherBoxedA)) // false
    println(", structural equality: " + (boxedA == anotherBoxedA)) // true

}