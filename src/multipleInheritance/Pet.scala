/*
 * Abstract class Pet with abstract method speak and concrete method ownerIsHome
 * 
 */

package multipleInheritance

abstract class Pet {
  def speak  // abstract
  def ownerIsHome { println("excited") }
}