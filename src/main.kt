fun main(){
    greetJane("Jane")
   printOddorEven(6)
   hasVisitedCapital("Tanzanian")
}
fun greetJane(name:String) {
    if (name == "Jane") {
        println("Hello Jane")
    } else {
        println("Who are you")
    }
    println("Have you ever been to Kampala!")

}
fun printOddorEven(num:Int){
  if((num%2)==0){
       println("Even")
   }
  else{
       println("Odd")
  }
}
fun hasVisitedCapital(nationality:String){
   when(nationality){
        }
    if(nationality.equals("Kenyan")){
       println("Have you ever been to Nairobi!")
    }
    else if (nationality.equals("Ugandan")){
        println("Have you ever been to Kampala!")
    }

    else if(nationality.equals("Tanzanian")){
       println("Have you ever been to Dodoma")
    }
   else{
       println("Have you ever been in East Africa")
        }
     }
