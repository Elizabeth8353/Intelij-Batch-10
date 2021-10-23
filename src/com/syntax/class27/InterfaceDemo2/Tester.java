package com.syntax.class27.InterfaceDemo2;

public class Tester {
    public static void main(String[] args) {
        Trustable trustable=new BOA();
        trustable.trust();
        Bank bank=new BOA();
        bank.trust();
        bank.hasChecking();
        bank.hasSaving();
        bank.hasCreditCard();
        Bank.depositMoney();//static we need to use interface can only be called with interface class name

        BOA boa=new BOA();
        boa.trust();
        boa.hasChecking();
        boa.hasSaving();
        boa.hasCreditCard();
        boa.financing();


    }
}
