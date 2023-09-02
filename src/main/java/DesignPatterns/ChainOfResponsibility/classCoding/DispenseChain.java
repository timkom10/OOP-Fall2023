package DesignPatterns.ChainOfResponsibility.classCoding;

public interface DispenseChain {

    void setNextChain(DispenseChain next);

    void dispense(Currency currency);
}
