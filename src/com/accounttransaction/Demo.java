package com.accounttransaction;
//adding comments to pretend there were some changes
import java.util.Arrays;
//comments shoud be there
public class Demo {

	public static void main(String[] args) {
		Account accountFrom=new Account(1);
		Account accountTo=new Account(2);
		
		accountFrom.sendMoneyToAccount(accountTo, 100);
		accountFrom.withdrawMoney(1000);
		
		System.out.println(Arrays.toString(accountFrom.getTransactions()));
		System.out.println(Arrays.toString(accountTo.getTransactions()));
	}

}
