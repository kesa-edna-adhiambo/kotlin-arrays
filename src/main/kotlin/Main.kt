fun main() {

    arr("Edna", "Kame","Faith","Eshe")

    println(numbers(3,4,5))

    arrange()

    println(words("Nasir","Den","Shell"))
cityTitle()


}
//function that takes in 4 strings and creates an array out of them then prints out the array.
fun arr(name1: String, name2: String, name3: String, name4: String){
    var names= arrayOf(name1, name2, name3, name4)
    println(names.contentToString())

}
//returning a function
fun numbers(num1:Int, num2:Int, num3:Int):Int{
    var numbs = (num1*num2*num3)
    return numbs

}

//create one function that is given the below array.
fun arrange(){
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73,11, 158, 62)

    //prints out the sum of 2nd and 5th elements
    println(numbers[1] + numbers[4])

    //prints out the index of 158
    println(numbers.indexOf(158))

    //prints out the elements in ascending order
    var sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.contentToString())

}

//function that takes in 3 names and returns a string array containing all 3 names
fun  words(name1:String, name2:String, name3:String):String{
    var names = arrayOf(name1, name2, name3)
    return (names.contentToString())
}

//function printing out array in correct grammatical case
fun cityTitle(){
    var cities = arrayOf("harare", "mumbai","dodoma", "jakarta")
    cities.forEachIndexed { index, y ->
        for (index in arrayOf(0, 1, 2, 3))
            println(y.capitalize())
        }
    }

