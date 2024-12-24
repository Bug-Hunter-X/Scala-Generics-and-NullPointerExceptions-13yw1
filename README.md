# Scala Generics and NullPointerExceptions

This repository demonstrates a common error in Scala related to using null values with generic types.  The `bug.scala` file shows how creating a generic class instance with a null value can result in a `NullPointerException` at runtime if the generic type parameter is not nullable. The `bugSolution.scala` file provides a corrected version that handles nullable types gracefully.