package com.silva.learn_kotlin.classes

// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */

/* The comment starts here
/* contains a nested comment */
and ends here. */

// Classes  are final by default
class Rectangle(height: Double, length: Double): Shape() {
    val perimiter = (height + length) * 2
}