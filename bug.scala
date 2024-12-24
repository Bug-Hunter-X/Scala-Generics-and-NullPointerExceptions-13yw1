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

    myInt.printValue()  //This works fine
    myString.printValue() //This works fine
    myList.printValue() //This works fine

    val myNull = new MyClass(null) //This compiles but might cause runtime error
    myNull.printValue() //NullPointerException if T is not a nullable type
  }
}
```