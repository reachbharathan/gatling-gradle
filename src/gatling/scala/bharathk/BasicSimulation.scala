package bharathk

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BasicSimulation extends Simulation {
  val httpConf = http.baseURL("http://api.football-data.org/")
  val scn = scenario("Basic Simulation")
    .exec(http("request_1")
      .get("v1/teams/73"))
    .pause(5)
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}