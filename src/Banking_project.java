import java. util . Scanner;
public class Banking_project{

    static void General(){
        System.out.println("ZTG Bank, Dhaka");
        System.out.println("--------------------");
        System.out.print("1. Create Account\n2. Deposit\n3. Withdraw\n4. Balance Check\n5. Exit\n");
        System.out.println("--------------------");
        System.out.print("First create an account to continue. Press 1 to create account or press 5 to exit: ");

    }


    static void General2(){
        System.out.println("ZTG Bank, Dhaka");
        System.out.println("--------------------");
        System.out.print("11. Show Accounts\n2. Deposit\n3. Withdraw\n4. Balance Check\n5. Exit\n");
        System.out.println("--------------------");
        System.out.print("Pick one: ");
    }


    static void General1(){
        System.out.println("ZTG Bank, Dhaka");
        System.out.println("--------------------");
        System.out.print("1. Create another account\n2. Deposit\n3. Withdraw\n4. Balance Check\n5. Exit\n");
        System.out.println("--------------------");
        System.out.print("Pick one (1-5): ");
    }


    static String PhoneNumber(){
        Scanner sc = new Scanner(System.in);
        String NewPhone;
        System.out.print("Enter your phone number: ");
        NewPhone = sc.nextLine();
        return NewPhone;
    }


    static String AccountCreating(){
        String AnotherAccount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your user name: ");
        AnotherAccount = sc.nextLine();
        return AnotherAccount;

    }

    static void Types(int Options, int AccSum, String accountName, String userPhoneNum, double deposit, double  withdraw, double balance,String userPhoneNum2,String accountName2){

        int TypeOptions ;
        Scanner sc = new Scanner(System.in);

        switch(Options){

            case 1 ->{

                    accountName2 = AccountCreating();
                    userPhoneNum2 = PhoneNumber();
                    AccSum++;
                    System.out.println("Your can not make another account now.");
                    General2();
                    TypeOptions = sc.nextInt();
                    Types(TypeOptions,AccSum,accountName,userPhoneNum, deposit, withdraw, balance,userPhoneNum2, accountName2);
            }

            case 2 ->{
                System.out.print("Enter your deposit amount: ");
                deposit = sc.nextDouble();
                balance = balance + deposit;
                General2();
                TypeOptions = sc.nextInt();
                Types(TypeOptions, AccSum, accountName, userPhoneNum, deposit, withdraw, balance,userPhoneNum2, accountName2);
            }

            case 4 ->{
                System.out.println("Your balance is "+balance+" $\n");
                General2();
                TypeOptions = sc.nextInt();
                Types(TypeOptions, AccSum, accountName, userPhoneNum, deposit, withdraw, balance,userPhoneNum2, accountName2);
            }

            case 3 -> {
                System.out.print("Enter withdraw amount: ");
                withdraw = sc.nextDouble();
                if(balance==0){
                    System.out.println("Your balance was 0\n");
                }
                else{
                    balance = balance - withdraw;
                    System.out.println("Your remaining amount after withdraw is "+balance+" $\n");
                }
                General2();
                TypeOptions = sc.nextInt();
                Types(TypeOptions, AccSum, accountName, userPhoneNum, deposit, withdraw, balance,userPhoneNum2, accountName2);
            }

            case 5 -> System.out.println("Thank you, come again.");

            case 11 ->{
                if(AccSum==1){
                    System.out.println("Account 1:");
                    System.out.printf("Name: %s\nPhone number: %s\n",accountName, userPhoneNum);

                }else if(AccSum==2){
                    System.out.println("Account 1:");
                    System.out.print("Name: "+accountName+"\nPhone number: "+userPhoneNum+"\n");
                    System.out.println("Account 2:");
                    System.out.printf("Name: %s\nPhone number: %s\n",accountName2, userPhoneNum2);
                }

                General2();
                TypeOptions = sc.nextInt();
                Types(TypeOptions, AccSum, accountName, userPhoneNum, deposit, withdraw, balance,userPhoneNum2, accountName2);
            }

            default-> {
                System.out.println("Oops! you should pick only 1 to 5\n");
                General2();
                TypeOptions = sc.nextInt();
                Types(TypeOptions, AccSum, accountName, userPhoneNum, deposit, withdraw, balance,userPhoneNum2, accountName2);
            }
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double deposit=0, withdraw=0, balance=0;
        int Options, AccSum=0;
        String accountName, userPhoneNum,userPhoneNum2="", accountName2=""; // I did not learn array yet!
        General();
        Options = sc.nextInt();
        sc.nextLine();

       if(Options==1){
                System.out.print("Enter account name: ");
                accountName = sc.nextLine();
                System.out.print("Enter your phone number: ");
                userPhoneNum = sc.nextLine();
                System.out.println("Account created!");
                AccSum++;

                General1();
                Options = sc.nextInt();
                Types(Options,AccSum, accountName, userPhoneNum, deposit, withdraw, balance,userPhoneNum2, accountName2);


       } else if(Options==5){
            System.out.println("Thanks for visiting.");

       }else if(Options>1 && Options<5){
            System.out.println("Fail to create account.");
       }
       else{
            System.out.println("Failed to create account");
       }

       sc.close();
    }
}