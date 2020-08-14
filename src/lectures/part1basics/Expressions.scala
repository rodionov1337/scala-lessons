package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(x == 1)

  println(!( x == 1))

  var aVariable = 2
  aVariable *= 3
  println(aVariable)

  //if expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // if expression
  println(aConditionValue)

  //Code BLOCKS

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "bye"
  }
}
