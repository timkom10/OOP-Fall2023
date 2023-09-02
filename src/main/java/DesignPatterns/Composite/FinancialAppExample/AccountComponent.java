/*
 *
 *  * Copyright (c) 2022.
 *  * Vahid Alizadeh
 *  * Object-oriented Software Development
 *  * DePaul University
 *
 */

package DesignPatterns.Composite.FinancialAppExample;

public abstract class AccountComponent
{
    AccountStatement accStatement;

    public abstract float getBalance();

    public abstract AccountStatement getStatement();
}