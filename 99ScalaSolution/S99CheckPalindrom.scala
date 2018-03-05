// P06 (*) Find out whether a list is a palindrome.
//     Example:
//     scala> isPalindrome(List(1, 2, 3, 2, 1))
//     res0: Boolean = true

object S99CheckPalindrom {
	def main(args: Array[String]){
		println("The given element is Plindrome: "+isPalindrom(List(1, 2, 3, 2, 1)))
	}
	def isPalindrom[A](ls: List[A]): Boolean = ls==ls.reverse
}
