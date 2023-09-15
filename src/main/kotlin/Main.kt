//fun main(args: Array<String>) {
//println("What is your Name?")
//val name = readln()
//println("Hello $name")

//}
///
/*fun main(args: Array<String>) {
    print("Enter number")
    val stringInput  = readLine()!!
    var integer:Int= stringInput.toInt()

    println("you enterd $integer")



}*/

/*fun main(args: Array<String>) {
    val first: Int = 10
    val second: Int = 20
    val sum: Int = first + second
    println("the sum is $sum")
}*/

/*fun main(args: Array<String>) {
    val ch = 'i'
    val vowelConstant = if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') "vowel"
else "constant"
println("$ch is $vowelConstant")

}*/

/*fun main(args: Array<String>) {
    val ch = 'z'
    when(ch){
        'a','e','i','o','u' -> println("$ch is vowel")
        else-> println("$ch is consonant")
    }
}*/

fun main(args: Array<String>) {
    val year = 1900
    var leap = false

    if(year % 4 ==0){
        if(year % 100 ==0){
            leap = year % 400==0
        }
        else
            leap=true
    }
    else
        leap=false
    println(if (leap)"$year is a leap" else "$year is not leap")
}