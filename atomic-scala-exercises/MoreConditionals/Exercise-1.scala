import com.atomicscala.AtomicTest._

// Under what conditions does a vector of length > 1 equal it's reverse?

// When all items in the vector are identical.
val v1 = Vector(1, 1, 1)
v1 is v1.reverse

// If the vector is has an event number of elements, when the second
// half of the vector is the reverse of the first half. If the vector
// is odd, then the same property must hold for elements on either side of
// the middle element.
val v2 = Vector(1, 2, 2, 1)
v2 is v2.reverse

val v3 = Vector(1, 2, "a", 2, 1)
v3 is v3.reverse

// More generally, if the elements read left to right match those read right
// to left.
