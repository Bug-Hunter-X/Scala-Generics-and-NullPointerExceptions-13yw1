```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    val myString = new MyClass("Hello")
    val myList = new MyClass(List(1, 2, 3))

    myInt.printValue()
    myString.printValue()
    myList.printValue()

    //Solution:  Use a nullable type parameter
    val myNull = new MyClass[Int](null) 
    println(myNull.value) //Prints null 
    //or use Option
    val myOption = new MyClass[Option[Int]](Some(10))
    println(myOption.value.getOrElse(0))// Prints 10
    val myNullOption = new MyClass[Option[Int]](None)
    println(myNullOption.value.getOrElse(0))//Prints 0
  }
}
```