package com.example.kotlin_learn

fun main() {
    // 1. 함수
    //      반환형이 void 일 때는 :Unit을 붙인다 (생략가능)
    helloWorld()

    println(add(10, 20))

    // 2. val vs var
    //      val = 변할 수 없는 값(상수)
    //      var = 변할 수 있는 값
    println(mutable())
    println(immutable())
}

fun helloWorld() :Unit {
    println("Hello World")
}

fun add(a :Int, b: Int): Int {
    return a+b
}

fun mutable() :Int {
    val a :Int = 10
     // a = 20;     ->      Error
    return a
}

fun immutable() :Int {
    var a :Int = 10
    a = 20
    return a // 20
}