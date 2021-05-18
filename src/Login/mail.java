
package Login;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
//import javax.activation.*;
import java.util.Properties;

//import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.swing.JOptionPane;



public class mail {
    
    public static void sendmail()
     {
         String host="smtp.gmail.com";  
  final String user="kingsproject2020@gmail.com"; 
  final String password="#Myproject@143";  
    
  String to=  RegistrationForm.emailtxt.getText();//Get.senderemail;  
  
   //Get the session object  
   Properties props = new Properties();  
   props.put("mail.smtp.host",host);  
   props.put("mail.smtp.auth", "true");
   props.put("mail.smtp.user","username"); 
props.put("mail.smtp.host", "smtp.gmail.com"); 
props.put("mail.smtp.port", "25"); 
props.put("mail.debug", "true"); 
props.put("mail.smtp.auth", "true"); 
props.put("mail.smtp.starttls.enable","true"); 
props.put("mail.smtp.EnableSSL.enable","true");

props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
props.setProperty("mail.smtp.socketFactory.fallback", "false");   
props.setProperty("mail.smtp.port", "465");   
props.setProperty("mail.smtp.socketFactory.port", "465"); 
     
   Session session = Session.getDefaultInstance(props,  
    new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
  
   //Compose the message  
    try {  

        
    tryotp.getotp();
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("do not reply");  
     message.setText("Your one time password is : "+tryotp.pk);  
       
    //send the message  
     Transport.send(message);  
  
     //System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {
         //JOptionPane.showMessageDialog(null,e);
         //System.out.println(e);
         e.printStackTrace();
     } 
     }
      public static void main(String[] args) 
    { 
        //tryotp.getotp();
        
         
      
          
          
                   
        
   }
    
}
