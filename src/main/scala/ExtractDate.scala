import java.time.LocalDate
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoField

import scala.util.Try

object ExtractDate {

  private val twentiethCenturyParser = new DateTimeFormatterBuilder()
    .appendPattern("dd/MM/")
    .appendValueReduced(ChronoField.YEAR, 2, 2, 1900)
    .toFormatter()

  def apply(dateString: String): Try[LocalDate] = Try {
    LocalDate.parse(dateString, twentiethCenturyParser)
  }

}
