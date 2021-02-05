package bharathk

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import pages.{Browse, Edit, Search}

import scala.concurrent.duration._

class ComDbHomePageSimulation extends Simulation{

  val httpConf = http.baseUrl("http://computer-database.gatling.io")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

  val userScn = scenario("User Scenario").exec(Search.search)
  val adminScn = scenario("Admin Scenario").exec(Search.search)
  val browseScn = scenario("Browse page Scenario").exec(Browse.browse1)
  val editScn = scenario("Edit page Scenario").exec(Edit.edit)

  setUp(
//    userScn.inject(rampUsers(10) over (10 seconds)),
//    browseScn.inject(rampUsers(10) over (10 seconds)),
    editScn.inject(rampUsers(10) during (10 seconds))
  ).protocols(httpConf)
}