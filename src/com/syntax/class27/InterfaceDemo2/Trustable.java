package com.syntax.class27.InterfaceDemo2;

public interface Trustable {
    void trust();
}
interface  Bank extends Trustable{
    public void hasChecking();// no need to use public all methods
    void hasSaving();
    default void hasCreditCard(){//in interface we can use default
        System.out.println("Almost all the banks have credit cards");
    }
    static void depositMoney(){//static is not default for method just fields
        System.out.println();
    }
}
class FinancialInstitution{
    public void financing(){
        System.out.println("All the financial institute deal with financial trusactiaction");
    }
}
class BOA extends FinancialInstitution implements Bank{

    @Override
    public void trust() {
        System.out.println("You can trust BOA for your money");
    }

    @Override
    public void hasChecking() {
        System.out.println("BOA has 3 checking account");
    }

    @Override
    public void hasSaving() {
        System.out.println("BOA has 2 saving accounts");
    }
}
