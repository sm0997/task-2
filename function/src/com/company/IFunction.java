package com.company;


public interface IFunction{

    double calculate(double x) throws DomainException;


    boolean isInDomain(double x);


    double getBeginD();


    double getEndD();
}