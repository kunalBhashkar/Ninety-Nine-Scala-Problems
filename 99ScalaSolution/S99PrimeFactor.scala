//Construct a list containing the prime factors and their multiplicity.
//scala> result(315)
//res0:List(3,3,5,7)

object S99PrimeFactor {
  
  def main(args:Array[String])
  {
    println("The prime factor of given number is : "+result(315))
  }
  def result(number: Int, list: List[Int] = List()): List[Int] = {
    for(n <- 2 to number if (number % n == 0)) {
      return result(number / n, list :+ n)
    }
    list
  }
 }

