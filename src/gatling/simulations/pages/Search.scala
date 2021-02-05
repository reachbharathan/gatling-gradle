package pages

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Search {

  val feeder = csv("search.csv").random
  val searchText = "${searchCriterion}"

  val search = exec(http("Home").get("/"))
    .pause(1)
    .feed(feeder)
    .exec(http("Search")
      .get("/computers?f=${searchCriterion}") // 4
      .check(css("a:contains('${searchComputerName}')", "href").saveAs("computerURL"))
    )

    .pause(1)
    .exec(http("Select")
      .get("${computerURL}"))
    .pause(1)
}
