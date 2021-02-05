package bharathk

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BasicSimulation extends Simulation {
  val httpConf = http.baseUrl("http://api.football-data.org/")
  val scn = scenario("Basic Simulation")
    .exec(http("request_1")
      .get("v2/teams/73").header("X-Auth-Token","0353eaff39424005a925e64ec0ce943d"))
    .pause(5)
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}