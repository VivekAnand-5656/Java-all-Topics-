package OOPs.Encapsulation;

import OOPs.PracticeSessionDay.Student;

public class NewBranchBank {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setUserName("Vivek Anand",1234567891,5000);
        obj.deposit(100);
        obj.withdraw(0);
        obj.getUserName();
        obj.getAccountId();
        obj.getBalance();
        obj.showDetail();
//      ------
        StudentDetail  ob = new StudentDetail();
        ob.data("Vivek Anand",21,596);
        ob.display();
    }
}
