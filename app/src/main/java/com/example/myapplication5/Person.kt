package com.example.myapplication5
import java.sql.DriverManager.println

class Person
{
    var name = ""
    var age = 0

    override fun toString(): String
    {
        return "$name, $age"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean
    {
        if (other is Person)
        {
            if (name == other.name)
            {
                return true
            }
        }
        return false
    }

    fun printName()
    {
        println(name)
    }
}

fun main()
{
    var person1 = Person()
    person1.name = "Alex"
    person1.age = 19
    person1.printName()
    var person2 = Person()
    person2.name = "Alex"
    person2.age = 19
    person2.printName()
    println(person1 == person2)
    person1 == person2
}