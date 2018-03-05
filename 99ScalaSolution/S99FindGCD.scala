// P32 (**) Determine the greatest common divisor of two positive integer
//          numbers.
//     Use Euclid's algorithm.
//
//     scala> gcd(36, 63)
//     res0: Int = 9

object S99FindGCD{
	def main(args:Array[String]){
		println("The gcd of given number is: "+gcd(36, 63))
		}
	def gcd(n:Int,m:Int):Int =if (m==0) n else gcd(m,n%m)
}
