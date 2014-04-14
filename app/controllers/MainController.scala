package controllers

import play.api.mvc.{Action, Controller}

object MainController extends Controller {

  def index = Action {
    Ok(views.html.index.render())
  }

  def story  = Action {
    Ok(views.html.story.render())
  }

  def cityhall  = Action {
    Ok(views.html.cityhall.render())
  }

  def church  = Action {
    Ok(views.html.church.render())
  }

  def cocktail  = Action {
    Ok(views.html.cocktail.render())
  }

  def food  = Action {
    Ok(views.html.food.render())
  }

  def party  = Action {
    Ok(views.html.party.render())
  }

  def hotels  = Action {
    Ok(views.html.hotels.render())
  }

  def brunch  = Action {
    Ok(views.html.brunch.render())
  }

  def honeymoon  = Action {
    Ok(views.html.honeymoon.render())
  }



}
