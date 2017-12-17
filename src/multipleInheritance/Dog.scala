/*
 * Dog class which extends class using extends keyword and implements Tail trait using with keywords
 */

package multipleInheritance

class Dog (name: String) extends Pet  with Tail {
  //Method speak
  def speak { println("woof") }
}