import java.time.LocalDate

object MockData {

  val persons = Seq(
    Person("Bill", "McKnight", Male, LocalDate.of(1977, 3, 16)),
    Person("Paul", "Robinson", Male, LocalDate.of(1985, 1, 15)),
    Person("Gemma", "Lane", Female, LocalDate.of(1991, 11, 20)),
    Person("Sarah", "Stone", Female, LocalDate.of(1980, 9, 20)),
    Person("Wes", "Jackson", Male, LocalDate.of(1974, 8, 14))
  )

}
