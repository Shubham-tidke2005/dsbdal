import scala.io.StdIn._
object LargestNum{
    def main(args:Array[String]):Unit={
        print("Enter number 1: ");
        var num1=readDouble();

        print("Enter number 2: ");
        var num2=readDouble();

        if(num1>num2){
            print("Number1 is Greater");
        }else if(num1<num2){
            print("Number2 is Greater");
        }else{
            print("Both are equal");
        }
    }
}