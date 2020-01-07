/**
 * 
 */
package com.csi.banking;

import java.util.Scanner;

/**
 * @author PRAGYA
 *
 */
class bankinternal{
	int account;
	float bal=0;
	Scanner get=new Scanner(System.in);
	bankinternal(){
		System.out.println("Enter your account number:");
		account=get.nextInt();
		System.out.println("Enter your initial balance:");
		bal=get.nextFloat();
		 
	}
	void deposit(){
		float amount;
		System.out.println("Enter amount to be deposit:");
		amount=get.nextFloat();
		bal=bal+amount;
		System.out.println("See your balance:");
		
	}
	void withdrow(){
		float amount;
		System.out.println("Enter amount to be withdrow :");
		amount=get.nextFloat();
		if (amount<=bal)
		{
			//1200bal=bal-amount;
		 System.out.println("sufficiant balance:");
			
		}
		else
		{
	System.out.println("insufficiant balance:");
			
		}
	}
	
}
public class Bankingconcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
bankinternal put=new bankinternal();
put.deposit();
put.withdrow();
	}

}
