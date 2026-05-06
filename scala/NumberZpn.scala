import scala.io.StdIn._
object NumberZpn{
    def main(args:Array[String]):Unit={
        
        print("Enter the number: ");
        var num=readInt();

        if(num>0){
            println("number is positive");
        }else if(num<0){
            println("number is negative");
        }else{
            println("number is Zero");
        } 


        println("ok by!");
    }
}