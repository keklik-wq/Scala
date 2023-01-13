package week1basics

import sun.security.util.Length

import scala.annotation.tailrec

object TailRecourse {
  def main(args: Array[String]): Unit = {
    def degreeof2(n: Int): Unit = {
      assert(n >= 0, "Необходимо неотрицательное целое число")

      @tailrec
      def f(n: Int, acc: BigInt = 1): BigInt =
        if (n > 0) f(n - 1, acc * 2)
        else acc

      println(f(n))
    }

    //for (i <- 0 until 10) degreeof2(i)
    val string_to_reverse = scala.io.StdIn.readLine()
    var arr = string_to_reverse.split(" ")
    def printarray(array: Array[String]):Unit = {
      var length = array.length

      @tailrec
      def loop(n: Int = length-1, acc:String = ""): String = {
        if (n==length-1) loop(n-1,acc ++ array(n))
        else if (n>=0) loop(n-1,acc ++ " " ++ array(n))
        else acc
      }

      print(loop())
    }
    printarray(string_to_reverse.split(" "))
  }
}
