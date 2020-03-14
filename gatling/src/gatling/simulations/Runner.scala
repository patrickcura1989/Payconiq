import io.gatling.http.Predef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Runner extends Simulation {
  val httpConf = http.baseUrl("https://api.github.com/")
  val scn = scenario("Get All Gists")
    .exec(http("Get All Gists")
      .get("users/patrickcura1989/gists").header("User-Agent",""))
  setUp(
    scn.inject(rampUsers(1) during (5 seconds),
      constantUsersPerSec(1) during (10 seconds))
  ).protocols(httpConf)
}