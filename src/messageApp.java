import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




    interface MessagingService
    {
        void sendMessage();
    }

    class SmsMessagingService implements MessagingService
    {

        public void sendMessage()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hi user send the number of Reciever :");
            long phone = scan.nextLong();
            String number=String.valueOf(phone);
            if(number.matches("[6-9][0-9]{9}"))
            {
                System.out.println("Valid Number "+number);
            }
            else
            {
                System.out.println("Invalid number");
            }
            System.out.println("Type the content which need to send :");
            String content = scan.next();
            System.out.println("Message delivered to this "+phone +" Successfully!.");
        }

    }

    class EmailMessagingService implements MessagingService
    {
        public void sendMessage()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hi user send the Email of Reciever :");
            String email = scan.next();
            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches())
            {
                System.out.println("Valid Email "+email);

            }
            else
            {
                System.out.println("Invalid Email");

            }
            System.out.println("Enter the subject of the content :");
            String message = scan.next();
            System.out.println("Type the content of Mail :");
            String content = scan.next();
            System.out.println("Email delivered to this "+email +" Successfully!.");
        }
    }

    class WhatsAppMessagingService implements MessagingService
    {
        public void sendMessage()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Hi user send the whatsapp number of Reciever :");
            long whatsno = scan.nextLong();
            String number=String.valueOf(whatsno);
            if(number.matches("[6-9][0-9]{9}"))
            {
                System.out.println("Valid Number "+number);
            }
            else
            {
                System.out.println("Invalid number");

            }
            System.out.println("Enter 1 if number exist in Whatsapp else 0");
            int whatsapp = scan.nextInt();
            if(whatsapp == 1)
            {
                System.out.println("YES..It is Whatsapp Number");
            }
            else
            {
                System.out.println("NO..Its not a Whatsapp Number");
            }
            System.out.println("Type the content which need to send :");
            String content = scan.next();
            System.out.println("Message delivered to this "+whatsno +" Successfully!.");
        }
    }

public class messageApp {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            MessagingService sms = new SmsMessagingService();
            MessagingService email = new EmailMessagingService();
            MessagingService whatsapp = new WhatsAppMessagingService();
            Scanner scan = new Scanner(System.in);
            int option =0;
            do
            {
                System.out.println("Enter your option :" );
                option = scan.nextInt();
                if(option==1)
                {
                    sms.sendMessage();
                }
                else if(option==2){
                    email.sendMessage();
                }
                else if(option==3){
                    whatsapp.sendMessage();
                }
                else if(option==4){
                    break;
                }
                else{
                    System.out.println("Invalid option");
                }
            }
            while(true);
            System.out.println("ThankYou Visit Later :" );


        }
    }

