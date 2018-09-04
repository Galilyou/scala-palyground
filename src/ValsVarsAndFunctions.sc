// vals are immutable
val name = "Christopher Hitchens"

// vars are mutable; handle with care.
var history = "World War I"
history = "The Great War"


// tuples: offset lookup is 1 based; like we are newbies
val tuple = ("Andrew Hopkins", 1996, "Famous nobody" )
tuple._2 // Gets the second element

val keyvalTuple = "WWI"  -> 1919
keyvalTuple._1
keyvalTuple._2

// Lists
// Created using the List() function
// Implemented using a single linked list
// Support richer; more heavyweight, functionality
// Zero-Based offset; like sane stuff
val primes = List(1, 3, 5, 7, 11, 13, 17, 19)
primes(0)
primes(0) == primes.head
primes.tail
primes.map(p  => p * p) // non-mutating map
val sum = primes.reduce( (p1, p2) => p1 + p2)
val organicSum = primes.sum

// the range operator
for (prime <- primes) println(prime)

val nums = List (1, 2, 3, 4, 5, 7, 8, 0, 12)
val evens = nums.filter( x => x % 2 == 0)
val evens2 = nums.filter(_ %2 == 0) // magic. _ means (whatever it is)
val odds = nums.filter(x => x%2 != 0)

// concatenating lists
val allNums = evens ++ odds
val reversed = allNums.reverse
val sorted = allNums.sorted
val duplicated = allNums ++ allNums
val distinct = duplicated.distinct
duplicated.distinct.sorted // chainable; of course
duplicated.max
duplicated.min
duplicated.contains(10)
duplicated.contains(12)

// Maps (a.k.a Dictionaries)
val wars =Map("WWI" -> 1919,
  "WWII" -> 1939,
  "First Crusade" -> "Unknown",
  "Will War End?" -> true,
  "War Cost" -> 3.3434f)

println(wars("WWI"))
wars("War Cost")
wars.contains("World War II")

// safe read from map
val ww2Date = util.Try(wars("WWII")) getOrElse 0
val shouldBeZero = util.Try(wars("WW3")) getOrElse 0 // this one will be zero