/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankatm;

public class BankAccount {
    public double balance ;
    public int prevTrans;
    public  String customerName;
    public final int cardNum = 123456789;
    public double trans1,trans2,trans3,trans4,trans5;
    
void withdraw(double amount){
if(amount !=0){
    if(amount>balance){
        System.out.println("You dont have enough balance to withdraw.");
    }else{
        balance = balance - amount;
        System.out.println("You have withdrawn "+ amount );
    }
    if(trans1 == 0){ // 3ayz a3mel && balance>amount 3shan mawdo3 el -4000
            trans1 = -amount;
        } else if(trans2 == 0 ){
            trans2 = -amount;
        }else if(trans3 == 0 ){
            trans3 = -amount;
        }else if(trans4 == 0){
            trans4 = -amount;
        }else if(trans5 == 0){
            trans5 = -amount;
        }
        else{     // 3ayzha else if balance>amount 3shan el -4000
            trans1=trans2;
            trans2=trans3;
            trans3=trans4;
            trans4=trans5;
            trans5=-amount;
        }
}    
}
void deposit(double amount){
    if(amount!=0){
        balance = balance+amount;
        
        System.out.println("You have deposited "+ amount );
        if(trans1 == 0){
            trans1 = amount;
        } else if(trans2 == 0){
            trans2 = amount;
        }else if(trans3 == 0){
            trans3 = amount;
        }else if(trans4 == 0){
            trans4 = amount;
        }else if(trans5 == 0){
            trans5 = amount;
        }
        else {
            trans1=trans2;
            trans2=trans3;
            trans3=trans4;
            trans4=trans5;
            trans5=amount;
        }
    }
}
void inquiry(){
    System.out.println("Your Balance is "+ balance);
}


}

