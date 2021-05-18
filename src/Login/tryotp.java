/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.Random;

/**
 *
 * @author Pratham
 */
public class tryotp {
    
    static String pk="";
     public static void getotp(){
        
         Random r = new Random();
		String otp = new String();
		for(int i=0 ; i < 4 ; i++) {
			otp += r.nextInt(10);
		}

                pk=otp;
                
     }
    
    public static void main(String[] args){
        
        tryotp.getotp();
        

	
    }
    
}
