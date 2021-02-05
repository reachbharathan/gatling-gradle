package pages

import java.util.concurrent.ThreadLocalRandom
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Edit {

  val edit = exec(http("Form")
    .get("/computers/new"))
    .pause(1)
    .exec(http("Post")
      .post("/computers")
      .check(status.is(session => 200))) // 2
}
