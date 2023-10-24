fun main(args: Array<String>) {
//    პროგრამას ვუშვებ ლუპში, სანამ იუზერი არ ჩაწერს 'y'-ს, იქამდე არ დასრულდება პროგრამა
    do {
//        Exception handling, თუ მაგალითად ნალი ან არასწორი ინფუთი შევიდა ეგ რომ დაჰენდლოს
        try {
//            x ისა და y ის შეყვანა
            print("შეიყვანეთ x-ის მნიშვნელობა: ")
            val x = readln().toDouble()
            print("შეიყვანეთ y-ის მნიშვნელობა: ")
            val y = readln().toDouble()

//            ჯამის გამოთვლა და კონსოლზე გამოტანა
            val z = x + y
            println("x-ისა და y-ის ჯამი არის: $z")

        } catch (e:Exception) {
//            ექსეფშენის დროს ერორის გამოტანა
            println("მოხდა ერორი: ${e.message}, გთხოვთ შეიყვანოთ სწორი ინფუთი")
        }

//        პროგრამის ხელახლა დაწყება
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        val answer = readlnOrNull()?.lowercase()
    }while (answer == "y")

    println("მადლობა :D")
}