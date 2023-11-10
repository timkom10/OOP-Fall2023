/*
 *
 *  * Copyright (c) 2023.
 *  * Vahid Alizadeh
 *  * Object-oriented Software Development
 *  * DePaul University
 *
 */

package assignment4.problem;

public class Client {

    private Handler cchain;
    Client(){
        this.cchain =  new MileHandler();
        this.cchain.setNextChain(new YardHandler());
        this.cchain.getChain().setNextChain(new FootHandler());
    }

    public Handler getChain(){return this.cchain;}
//    cchain.setNextChain(new YardHandler());
//    cchain.getChain().setNextChain(new FootHandler());
    double convert(double km, String unit) throws Exception {
         double value = this.getChain().goNext(km, unit);
         return value;
    }


	//TODO Here is where you implement the converter logic using the requested "patterns" (Chain of Responsibility, and Decorator)
	//TODO You can have a static method Convert(..) here
	//TODO static Convert(...) method?
	//TODO In the method body you must setup your patterns like Instantiating Handlers and setSuccessors for the Chain of Responsibility
	//TODO and Decorators for the Decorator pattern

}
