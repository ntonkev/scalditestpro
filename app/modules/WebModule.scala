package modules

/**
 * Created by Nikola on 2/14/14.
 */
import controllers.{Clients, Application, CtrlrOne}
import scaldi.Module

class WebModule extends Module {
  binding to new Application
  binding to new CtrlrOne()
  binding to new Clients()
}
