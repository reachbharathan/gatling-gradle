package pages

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Browse {

  def gotoPage(pageNum: Int) = exec(http("Page " +pageNum).get("/computers?p="+pageNum)).pause(1)

  val browse = exec(gotoPage(0),gotoPage(1),gotoPage(2),gotoPage(2),gotoPage(2))

  val browse1 = repeat(5,"n"){exec(http("Page ${n}").get("/computers?p=${n}")).pause(1)}
}
