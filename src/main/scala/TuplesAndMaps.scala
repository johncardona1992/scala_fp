import scala.concurrent.ExecutionContext.parasitic
object TuplesAndMaps extends App {

  val aTuple = (2, "hello, scala")
  println(aTuple)
  println(aTuple._1)
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap)

  //  Maps - keys -> values
  val aMap: Map[String, Int] = Map()
  val phoneBook = Map(("Jim", 555), "Danniel" -> 789).withDefaultValue(-1)
  // a->b is syntactic sugar for (a,b)
  println(phoneBook)

//   map Operations
  println(phoneBook.contains("Jim"))
  println(phoneBook("Mary"))

// add a pairning
  val newparing = "Mary" -> 678
  val newPhonebook = phoneBook + newparing
  println(phoneBook)

//   functional on maps
// map, flatmap, filter
  println(phoneBook.map(pair => pair._1.toLowerCase -> pair._2))

//   filterKeys
  println(phoneBook.filterKeys(x => x.startsWith("Jim")))

// mapValues
  println(phoneBook.mapValues(number => "0245-" + number))
  println(phoneBook)
}
