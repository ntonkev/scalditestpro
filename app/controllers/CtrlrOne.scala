package controllers

import Traits.{IService,IClients}
import play.api._
import play.api.mvc._
import scaldi.{Injectable, Injector}

/**
 * Created by Nikola on 2/15/14.
 */
class CtrlrOne(implicit inj: Injector) extends Controller with Injectable {
  val service = inject [IService]
  val clients = inject [IClients]

  def indexone = Action {
    val success = clients.RemoveClient(23)
    val str: String = "TEST calling service.doSomething: Your new application is ready now !!!"
    Ok(views.html.CtrlrOne.indexone(service.doSomething(str)))
  }

}