package addressbook

import org.scalatest.{FlatSpec, Matchers}

import scala.util.Success

class AnswerTheQuestionsUTest extends FlatSpec with Matchers {

  "Answering the questions" should "return a Success of a sequence of the answers to all questions, when the provided sequence " +
    "of person allows to answer the questions" in {

    AnswerTheQuestions(MockData.persons) shouldBe Success(Seq(
      "1. There are 3 males in the address book.",
      "2. The oldest Person is Person(Wes,Jackson,Male,1974-08-14).",
      "3. Bill is 2862 days older than Paul"
    ))

  }

  it should "fail on an insufficient address book" in {

    AnswerTheQuestions(Seq.empty) should be a 'failure
  }

}
