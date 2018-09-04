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