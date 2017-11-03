package addressbook.util

import scala.util.{Failure, Success, Try}

object TryUtil {

  implicit class SequenceOfTry[T](original: Seq[Try[T]]) {

    def flattenToTry: Try[Seq[T]] =
      original.partition(_.isSuccess) match {
        case (success, failures) if failures.isEmpty => Success(success.map(_.get))
        case (_, failures) if failures.nonEmpty => Failure[Seq[T]](failures.head.failed.get)
        case _ => Success(Seq.empty)
      }

  }

}
