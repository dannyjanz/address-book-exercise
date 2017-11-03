package addressbook.util

import addressbook.util.TryUtil._
import org.scalatest.{FlatSpec, Matchers}

import scala.util.{Failure, Success}

class TryUtilUTest extends FlatSpec with Matchers {

  "flattening a sequence of Try" should "result in a Success of a Sequence if all Try are Success" in {

    Seq(Success(1), Success(2), Success(3)).flattenToTry shouldBe Success(Seq(1, 2, 3))

  }

  it should "result in a Failure if any of the Try is a Failure" in {

    val error = new Throwable("too bad..")

    Seq(Success(1), Success(2), Failure(error)).flattenToTry shouldBe Failure(error)
  }

  it should "result in a Failure with the error of the first Failure in the Sequence" in {

    val error1 = new Throwable("error 1")
    val error2 = new Throwable("error 2")

    Seq(Success(1), Failure(error1), Failure(error2)).flattenToTry shouldBe Failure(error1)

  }

}
