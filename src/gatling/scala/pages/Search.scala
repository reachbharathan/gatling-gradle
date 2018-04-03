package pages

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Search extends Simulation {

  val search = exec(http("Home")
    .get("/"))
    .pause(3)
    .exec(http("Search")
      .get("/computers?f=macbook"))
    .pause(2)
    .exec(http("Select")
      .get("/computers/6"))
    pause(2)
}
