//1. The signum of a number is 1 if the number is positive, -1 if ti is negative and - if its zero. Write a function that computes the value.
def signum(num: Int) = {
  if (num > 0) 1 else if (num < 0) -1 else 0
}
//2. What is the value o an empty block expression {}? What is its type?
//Nothing is displayed. The type is Unit.
//3. Come up with one situation where the assignment x = y = 1  is valid in Scala.
/*
4. Write a Scala equivalent for the Java loop
for (int i = 10; i >= 0; i—) System.out.println(i);
*/
for (i <- 10 to 0 by -1) println(i)
//5. Write a procedure countdown(n: Int) that prints the numbers form n to 0.
def countdown(n: Int) {
  for (i <- n to 0 by -1) println(i)
}
countdown(10)
//6. Write a for loop for computing the product of the Unicode codes of all letters in a string. From example, the product of the characters in “Hello” is 825152896.
var n = 1
for (c <- "Hello") n = n * c
//7. Solve the preceding exercise without writing a loop. (Hint: Look author the stringOps Scaladoc.)
var n2 = 1
"Hello".foreach(n2 *= _)
n2
/*
Write a function product(s: String) that computes the product, as described in the preceding exercises.
 */
def products(s: String): Int = {
  if (s.length == 0) 0
  else
  if (s.length == 1) s(0)
  else s(0) * products(s.substring(1))
}
products("Hello")

/*
* 10. Write a function that computes x^n, where x is an integer. Use thr following recursive definition:
*
* x ^ n = y ^ 2 if n is even and positive, where y = x ^ (n/2)
*
* x ^ n = x* n^(n-1) if n is odd and positive
*
* x ^ 0 = 1
*
* x ^ n = 1 / x^(-n) if n is negative
* */
def xtothen(x: Double, n: Int): Double = {
  //println( x + " to the " + n)
  if (n > 0 && n % 2 == 0) xtothen(x, n / 2) * xtothen(x, n / 2)
  else if (n > 0 && n % 2 == 1) x * xtothen(x, n - 1)
  else if (n < 0) 1 / xtothen(x, -n)
  else 1
}

xtothen(2, -1)
