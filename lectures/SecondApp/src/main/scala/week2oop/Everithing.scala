package week2oop

object Everithing {
  trait Configs {
    val ACCOUNT_TYPE_DEFAULT = "free"
    val ACCOUNT_TYPE_PAID = "paid"
    val SUBSCRIPTION_STATUS = "active"
  }

  object Settings {
    case class AccountSettings(
                                email: String,
                                password: String,
                                picture: String)

    case class SubscriptionSettings(
                                     payment: String,
                                     notifications: String,
                                     expiration: String)
  }

  class Subscriber {
    def subscribe(settings: Settings.SubscriptionSettings): Unit = println("subscribed")
  }

  class Unsubscriber {
    def unsubscribe(): Unit = println("unsubscribed")
  }

  abstract class Account(accountID: String, settings: Settings.AccountSettings) {
    def info(): Unit
  }

  class FreeAccount

  class ex( accountID: String, settings: Settings.AccountSettings) extends Account(accountID,settings) with Configs {

    override def info(): Unit = println(s"Account Type: $ACCOUNT_TYPE_DEFAULT")
  }

  class PaidAccount(
    accountID: String,
    settings: Settings.AccountSettings)
    extends Account(accountID,settings) with Configs {

    override def info(): Unit = {
      println(s"Account Type: $ACCOUNT_TYPE_PAID")
      println(s"Subscription Status: $SUBSCRIPTION_STATUS")
    }
  }

  def main(args: Array[String]): Unit = {
    println("Okey!")
  }
}
