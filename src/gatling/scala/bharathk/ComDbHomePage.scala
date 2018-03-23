package bharathk

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class ComDbHomePage extends Simulation{

  val httpConf = http.baseURL("http://computer-database.gatling.io")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36")

  val scn = scenario("computerDb")
    .exec(http("HomePage")
      .get("/"))
    .pause(5)

  setUp(scn.inject(atOnceUsers(10))).protocols(httpConf)
}