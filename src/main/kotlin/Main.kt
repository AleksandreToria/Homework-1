fun main(args: Array<String>) {
    do {
        try {
            print("შეიყვანეთ x-ის მნიშვნელობა: ")
            val x = readln().toDouble()
            print("შეიყვანეთ y-ის მნიშვნელობა: ")
            val y = readln().toDouble()

            val z = x + y
            println("x-ისა და y-ის ჯამი არის: $z")

        } catch (e:Exception) {
            println("მოხდა ერორი: ${e.message}, გთხოვთ შეიყვანოთ სწორი ინფუთი")
        }

        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        val answer = readlnOrNull()?.lowercase()
    }while (answer == "y")

    println("მადლობა :D")
}