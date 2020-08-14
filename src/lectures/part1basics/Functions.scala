package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSidesEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n-1)
  }

  def greetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }
  println(greetingFunction("misha", 22))

  def factorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * factorialFunction(n-1)
  }
  println(factorialFunction(3))

  def fiboFunction(n: Int): Int = {
    if (n <= 2) 1
    else fiboFunction(n - 1) + fiboFunction(n - 2)
  }
  println(fiboFunction(3))

  def detectPrime(n: Int): Boolean = {
    def isPrime(num: Int): Boolean = {
      if(num <= 1) true
      else n % num != 0 && isPrime(num - 1)
    }
    isPrime(n-1)
  }
  println(detectPrime(77))
}
