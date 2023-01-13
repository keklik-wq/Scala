package week1basics

object HelloApp {
  def main(args: Array[String]): Unit = {
    //val string_to_reverse = StdIn.readLine()
    //val string_to_reverse = "ad a dadb abg adbgbgb"
    val aString = "Scala Cool!"
    println(aString.substring(0, 5).toUpperCase)

    println(aString.substring(0, 6).toUpperCase)

    println(aString.take(6).toUpperCase)

    println(aString.take(5).toUpperCase)

    println(aString.substring(1, 5).toUpperCase)
    val link = "https://stepik.org"
    println(link :++ "/catalog")
    println(s"The link is $link.toUpperCase")
    println(raw"The link is \t $link")
    //println(string_to_reverse.split(" "))
  }
}
