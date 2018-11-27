public class MessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
	
   public MessageUtil(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   

   public static void main(String[] args){
	MessageUtil demo = new MessageUtil("Hello World");
	demo.printMessage();
   }

}  