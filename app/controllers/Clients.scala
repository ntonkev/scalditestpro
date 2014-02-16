package controllers

import Traits.{IClients}
import play.api._
import play.api.mvc._
import scaldi.{Injectable, Injector}

/**
 * Created by Nikola on 2/15/14.
 */
class Clients(implicit inj: Injector) extends Controller with Injectable {
  val clients = inject [IClients]

  def index = Action {
    Ok(views.html.Clients.index("Clients list..."))
  }

  def register = Action {
    Ok(views.html.Clients.register())
  }

  def update = Action {
    Ok(views.html.Clients.update())
  }

  def saveclient(Id: Int, name: String, code: String) = Action {
    val success = clients.RegisterClient(name, code)
    Ok(views.html.Clients.register())
  }


}
