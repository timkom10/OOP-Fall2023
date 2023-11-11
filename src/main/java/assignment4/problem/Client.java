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
        this.cchain = new RoundDecorator(new MileHandler());
        this.cchain.setNextChain(new YardHandler());
        this.cchain.getChain().setNextChain(new FootHandler());
    }

    public Handler getChain(){return this.cchain;}
//    cchain.setNextChain(new YardHandler());
//    cchain.getChain().setNextChain(new FootHandler());
    String convert(String km, String unit) throws Exception {
         return this.getChain().goNext(km, unit);
    }


	//TODO Here is where you implement the converter logic using the requested "patterns" (Chain of Responsibility, and Decorator)
	//TODO You can have a static method Convert(..) here
	//TODO static Convert(...) method?
	//TODO In the method body you must setup your patterns like Instantiating Handlers and setSuccessors for the Chain of Responsibility
	//TODO and Decorators for the Decorator pattern

}
