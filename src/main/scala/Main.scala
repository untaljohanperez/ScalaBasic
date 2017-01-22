/**
  * Created by JohanPerez on 3/09/2016.
  */
object Main extends App {
  //Types and Class
  def function(a: Any): String = "Hola Mundo"
  var set = new scala.collection.mutable.LinkedHashSet[Any]

  set += "This is a string"
  set += 732
  set += 'c'
  set += true

  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {
    println(iter next() toString())
  }

  //Class instance
  val pt = new Point(1,5) //val is a constant that cannot change
  println(pt.toString())
  pt move (10, 10)
  println(pt toString())

  var pt2 = new Point(11, 23)

  println(pt.isSimilar(pt2))
  println(pt.isNotSimilar(pt2))

  //Higher-order Functions
  def apply(f: Int => String, x: Int) = f(x)

  val decorator = new Decorator
  println(apply(decorator.layout, 7))

  //Nested fuctions
  def some1(x: String): String = {
    def some2(y:String): String = y
    some2(x)
  }
  println(some1("Wepa"))

  def filter(xs: List[Int], limit: Int): List[Int] = {
    def process(xs: List[Int]): List[Int] =
      if (xs.isEmpty) xs
      else if (xs.head < limit) xs.head :: process(xs.tail) // :: concat head to the other filtered Int's
      else process(xs.tail)
    process(xs)
  }

  //Currying
  def filter(xs: List[Int], f: Int => Boolean): List[Int] =
    if(xs.isEmpty) xs
    else if  (f(xs.head)) xs.head :: filter(xs.tail, f)
    else filter(xs.tail, f)

  def modN(n: Int)(x: Int) = ((x % n) == 0)

  println("Currying")
  val nums = List(1,2,3,4,5,6,7,8,9)
  println(filter(nums, modN (2)_ )) // pass a currying function as a partially appied function
  println(filter(nums, modN(3) _ ))

  //Pattern matching
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  println("Pattern matching")
  println(matchTest(1))
  println(matchTest(2))
  println(matchTest(3))

  //Condicionals
  var age = 18
  var canVote = if(age > 18) "can" else "can´t"
  printf(s"${age} years old ${canVote} vote")

  //Loops
  //While
  var x = 0
  while (x <= 0){
    println(x)
    x++
  }

  // Do While
  var x = 0
  do {
    println(x)
    x += 1
  } while(x <= 10)

  //For
  for (i <- 1 to 10)
    println(i)

  //For
  val letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  for(i <- 0 until letters.length)
    println(letters(i))

  // Foreach
  val list = List(1,2,3,4)
  for(i <- list)
    println(i)

  // For Yield
  var listPares = for { x <- x to 20
                        if(x % 2 == 0)
  } yield x

  // For inside a for
  for(i <- 1 to 6; j <- 6 to 10){
    println("i: " + i)
    println("j: " + j)
  }

}




