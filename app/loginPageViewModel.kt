import

class loginPageViewModel: ViewModel() {
    var name="Yara"
    var password = "12345"

    fun person(input: String):Boolean {
        return input==name
    }
    fun pass(input:String):Boolean{
        return password.length == 5
    }
}