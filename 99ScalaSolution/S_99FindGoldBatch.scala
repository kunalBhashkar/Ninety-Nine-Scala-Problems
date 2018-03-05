// P40 (**) Goldbach's conjecture.
//     Goldbach's conjecture says that every positive even number greater than 2
//     is the sum of two prime numbers.  E.g. 28 = 5 + 23.  It is one of the
//     most famous facts in number theory that has not been proved to be correct
//     in the general case.  It has been numerically confirmed up to very large
//     numbers (much larger than Scala's Int can represent).  Write a function
//     to find the two prime numbers that sum up to a given even integer.
//
//     scala> 28.goldbach
//     res0: (Int, Int) = (5,23)

object S99FindGoldBatch{
	def main(args: Array[String]){
		val gbatch=new S99Int3(28)
		println(gbatch.goldbach)
	}
    	def isPrime2(i :Int) : Boolean = {
     		if (i <= 1)
       			false
     		else if (i == 2)
       			true
     		else
       			!(2 to (i-1)).exists(x => i % x == 0)
   }
}


class S99Int3(val start: Int) {
  def goldbach: (Int,Int) =
    primes takeWhile { _ < start } find { p => (start - p).isPrime } match {
      case None     => throw new IllegalArgumentException
      case Some(p) => (p, start - p)
    }
}
