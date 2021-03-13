package org.remi.firststep

import org.scalatra._

class HelloScalatraServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
