package org.remi.firststep

import org.scalatra.test.scalatest._

class HelloScalatraServletTests extends ScalatraFunSuite {

  addServlet(classOf[HelloScalatraServlet], "/*")

  test("GET / on HelloScalatraServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
