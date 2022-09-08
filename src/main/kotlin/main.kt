fun main() {
    var input = 0
    do{
    println("Are you a:")
    println("1) Residental customer")
    println("2) Business customer")
    println("3) Exit")

    input = readln()!!.toInt()

        if (input == 1) {
            println("The name and phone number is: ${resident("John Random", "561-726-7381")}")
        } else if (input == 2) {
            println(
                "The business name, contact name, and phone number is: ${
                    business(
                        "Coffee Industries",
                        "Max Lastname",
                        "671-819-9471"
                    )
                }"
            )
        } else if (input != 1 && input != 2 && input != 3) {
            println("please choose an option")
        }
        println("-------------------------")
    }while (input != 3)
}

fun resident(name : String, num: String):String{
return name + ", " + num


}

fun business(Bname: String, Cname: String, num: String ):String{
return Bname + ", " + Cname + ", " + num

}