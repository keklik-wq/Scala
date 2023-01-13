package week2oop

object ClassesOOP {
  def main(args: Array[String]): Unit = {
    class Instructor(val id: Int, val name: String, val surname: String) {
      def fullName(): String = {
        //println(name.take(1).toUpperCase()++name.substring(1,name.length) ++ " " ++ surname.take(1).toUpperCase()++surname.substring(1,surname.length))
        name.take(1).toUpperCase()++name.substring(1,name.length) ++ " " ++ surname.take(1).toUpperCase()++surname.substring(1,surname.length)
      }


    }
    class Course(val courseID: Int,val title: String,val releaseYear: String,val instructor: Instructor) {
      def getID(): String = {
        courseID.toString ++ instructor.id.toString
      }
      def isTaughtBy(instructor: Instructor): Boolean = {
        this.instructor == instructor
      }
      def copyCourse(newReleaseYear: String) = new Course(this.courseID,this.title, newReleaseYear,this.instructor)
    }



  }
}
