package com.example.protej.abstract_interface.Abstract


interface  Am{
    fun Pay(Amount:Int)
}
class pay:Am {
    //UPI
    override fun Pay(Amount: Int) {
        println("PAY with UPI ${Amount}")
    }


}
class Card:Am{
    override fun Pay(Amount: Int) {
        println("PAY with Card ${Amount}")
    }


}
class Cash:Am{
    override fun Pay(Amount: Int) {
        println("PAY with Cash ${Amount}")
    }

}

fun  main(){
    val p=pay()
    val card= Card()
    val cash= Cash()
    p.Pay(100)
   card.Pay(200)
    cash.Pay(300)
}

