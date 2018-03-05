// P31 (**) Determine whether a given integer number is prime.
//     scala> 7.isPrime
//     res0: Boolean = true

object S99checkForPrime {
	def main(args: Array[String]){
		(1 to 10).foreach(i => if (isPrime(i)) println("%d is prime. ".format(i)))
		println("\nThe given number is prime: "+isPrime(3))
		}
	def isPrime(i:Int): Boolean ={
		if (i<=1)
			false
		else if(i==2)
			true
		else
			!(2 to (i-1)).exists(x=> i % x == 0)
		}
}
