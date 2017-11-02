import scala.util.{Failure, Success, Try}

object ExtractGender {

  def apply(gender: String): Try[Gender] = gender match {
    case Male.name => Success(Male)
    case Female.name => Success(Female)
    case _ => Failure(new IllegalArgumentException(s"Gender $gender is unknown."))
  }

}
