import scala.collection.mutable.ArrayBuffer
import scala.util.Random
/*
* 1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive)
* */
val randomNum = Random.nextInt(30)
val randomArray = new Array[Int](randomNum)
for (i <- 0 until randomNum) {
  randomArray(i) = i
}
randomArray.foreach(println(_))
/*
* 2.  Write a loop that swaps adjacent elements of an array of integers. For examples,
* Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
* */
def swapAdjacent(a: Array[Int]) = {
  for (i <- 0 until a.length - 1 by 2) {
    val temp = a(i)
    a(i) = a(i + 1)
    a(i + 1) = temp
  }
  a
}
val a2 = Array(1, 2, 3, 4, 5, 6)
println(swapAdjacent(a2).toBuffer)
/*
* 3. Repeat the preceding assignment, but produce a new array with the swapped value. use for/yield.
* */
def swapAdjacent2(a: Array[Int]) = {
  for (i <- a.indices) yield
  if (i % 2 == 0 && i == a.length - 1) a(i)
  else if (i % 2 == 0) a(i + 1)
  else a(i - 1)
}

val a3 = Array(1, 2, 3, 4, 5)
println(swapAdjacent2(a3).toBuffer)

/*
* 4. Given an array of integers, produce a new array that contains
* all positive values of the original array, in their original order,
* followed by all values that are zero or negative, in their original order.
* */

val a4 = Array(9, 0, -98, 87, 839, -9, 87, -9, -4)
val a4result = a4.filter(_ > 0) ++ a4.filter(_ <= 0)

/*
 * 5. How do you compute the average fo an Array[Double]?
 */
val a5: Array[Double] = Array(9.0, 0.0, -98.0, 87.0, 839, -9, 87, -9, -4.0)
a5.sum / a5.size

/*
 * 6. How do you rearrange the elements of an Array[Int] so that
  * they appear in reverse sorted order? How do you do the same with an
  * ArrayBuffer[Int]?
 */

val a6 = Array(9, 0, -98, 87, 839, -9, 87, -9, -4)
val a6_reverseSort = a6.sortWith((a, b) => a > b)

val a6_2 = ArrayBuffer(9, 0, -98, 87, 839, -9, 87, -9, -4)
val a6_2_reverseSort = a6_2.sortWith((a, b) => a > b)