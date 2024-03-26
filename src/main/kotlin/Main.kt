fun main() {
    var human = Human("mercy",56,34.56)
    println(human.weight)
    human.eat(2)
    println(human.speak("hello mary"))
    println(human.age)
    human.birthday()
    println(human.age)
    sentence("Barbie bakes brown bagels and buns")
    val user =User("faith","munyao","munyao@gmail.com","0123456738","wert")
    println(user.firstName)
    println(user.lastName)
    println(user.email)
    println(user.password)

    var money = Money(23.43,78,"Anita","anitab")
    println(money.weight)
    println(money.lab)

}
//1. Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
fun sentence(text:String){

    println(text.lowercase().replace("b",""))
}
//create a class called Human with these attributes:name,age,weight.it has the following:
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        weight += foodWeight
        println("I am eating $foodWeight kgs of food")
        println(weight)
    }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday(){
        age+=1


    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}
data class Money(var weight:Double,var age:Int,var name:String,var lab:String){

}