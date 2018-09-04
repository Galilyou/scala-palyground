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
