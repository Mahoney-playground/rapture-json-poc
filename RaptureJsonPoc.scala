package rapturejsonpoc

import rapture._
import core._, io._, net._, uri._, json._, codec._
import rapture.codec.encodings.`UTF-8`
import jsonBackends.jawn._

object RaptureJsonPoc {
  def main(args: Array[String]) {
    val src = uri"http://rapture.io/sample.json".slurp[Char]
    val json: Json = Json.parse(src)
    println(json)
  }
}
