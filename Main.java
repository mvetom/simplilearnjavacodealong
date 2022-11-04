import simplilearn.java.core.interfaces.InterfaceDemo;
import simplilearn.java.core.io.InputOutputDemo;
import simplilearn.java.core.jdbc.JDBCDemo;

import java.io.IOException;
import java.sql.SQLException;

import simplilearn.java.core.*;
import simplilearn.java.core.classes.ClassDemo;
import simplilearn.java.core.collections.*;
import simplilearn.java.core.abstraction.AbstractionDemo;
import simplilearn.java.core.annotations.AnnotationDemo;
import simplilearn.java.core.autoboxing.AutoboxingDemo;
import simplilearn.java.core.collections.queues.*;
import simplilearn.java.core.collections.stacks.StackDemo;
import simplilearn.java.core.comparable.ComparableDemo;
import simplilearn.java.core.comparator.ComparatorDemo;
import simplilearn.java.core.control.*;
import simplilearn.java.core.encapsulation.EncapsulationDemo;
import simplilearn.java.core.enumeration.EnumDemo;
import simplilearn.java.core.equalsandhashcode.EqualsAndHashCodeDemo;
import simplilearn.java.core.exceptions.ExceptionDemoHub;
import simplilearn.java.core.exceptions.SimpleExceptionDemo;
import simplilearn.java.core.maps.MapDemo;
import simplilearn.java.core.method_calling.MethodCallingDemo;
import simplilearn.java.core.nested.AnonymousInnerClassDemo;
import simplilearn.java.core.nested.NestedDemo;
import simplilearn.java.core.recursion.*;
import simplilearn.java.core.serialization.SerializationDemo;
import simplilearn.java.core.polymorphism.PolyDemo;
import simplilearn.java.core.project.atm.ATM;
import simplilearn.java.core.project.calculator.CalcApp;
import simplilearn.java.core.statickeyword.StaticDemo;
import simplilearn.java.core.streams.StreamDemo;
import simplilearn.java.core.synchronization.SyncDemo;
import simplilearn.java.core.threads.ConcurrencyThreadsDemo;
import simplilearn.java.core.inheritance.InheritanceDemo;
public class Main
{

	public static void main(String[] args)
	{
		System.out.println("Entering the SimpliLearn program...");
		
		//Chapter 41 - JDBC
		try
		{
			JDBCDemo.jdbcMain();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Chapter 40 - I/O
		//InputOutputDemo.ioMain();
		
		//Chapter 39 - Autoboxing
		// AutoboxingDemo.autoboxingMain();
		
		//Chapter 38 - Synchronization
		//SyncDemo.syncDemoMain();
		
		//Chapter 37 - Concurrency and Threads
		//ConcurrencyThreadsDemo.threadsDemoMain();
		
		// Chapter 36 - Serialization
		//SerializationDemo.serialMain();
		
		// Chapter 35 - Annotations
//		try
//		{
//			AnnotationDemo.annotaDemoMain();
//		} catch (Exception e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		// Chapter 34 - Enumeration
		//EnumDemo.enumDemoMain();
		
		// Chapter 33 - Calculator Project
		// CalcApp.calcAppMain();
		
		// Chapter 32 - ATM Project
//		try
//		{
//			ATM.projectATMMain();
//		} catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// Chapter 31 - Comparator
		//.comparatorDemoMain();
		
		// Chapter 30  - Comparable
		//ComparableDemo.comparableDemoMain();
		
		// Chapter 29  Equals and Hashcode
		//EqualsAndHashCodeDemo.equalsAndHashCodeDemoMain();		
		
		//Chapter 28 - Exceptions
		//ExceptionDemoHub.exceptionDemoHubMain();
		
		// Chapter 27 -  Method Calling
		//MethodCallingDemo.methodCallingMain();
		
		// Chapter 26 - Recursion
		//RecursionDemo.recursionDemoMain();
		
        // Chapter 25 - Packages
		
		// Chapter 24 - Nested classes
		//NestedDemo.nestedDemoMain();
		//AnonymousInnerClassDemo.anonyMain();
		
		// Chapter 23 Static keyword in Java
		//StaticDemo.staticDemoMain();
		
		// Chapter 22 - Polymorphism 
		// PolyDemo.polyDemoMain();
		
		
		// Chapter 21 - Interfaces
		//InterfaceDemo.interfaceDemoMain();
		
		//Chapter 20 -  Abstraction
		//AbstractionDemo.abstractionDemoMain();
		
		// Chapter 19.  Encapsulation
		//EncapsulationDemo.encapsulationDemoMain();
		
		// Chapter 18. Inheritance
		//InheritanceDemo.inheritanceDemoMain();
		
		// Chapter 16.  Streams - the new,  Java 8 kind
		//StreamDemo.streamDemoMain();
		
		// Chapter 15 - Classes
		//ClassDemo.classDemoMain();
		
		// Chapter 14 - Queues
		//QueueDemo.queueDemoMain();
		
		// Chapter 13 - Stacks
		//StackDemo.stackDemoMain();
		
		// Chapter 12 - Maps
		//MapDemo.mapDemoMain();
		
		// Chapter 11 - Collections
		
		// CollectionsPractice.collectionsMain();
		
		// Chapter 9 - Control Statements
		
		// ControlStatements.controlStatementsMain();
		
		// Chapter 8 - Java Operators
		// Operators.operatorsMain();
		
		// Chapter 7 - Java Arrays
		//JavaArrays.javaArraysMain();
		
		// Chapter 6 - Hello World
		
		// Chapter 5 - Data Type Conversions
		//DataTypeConversion.DataTypeConversionMain();
		// Chapter 4 - Java Tokens
		//JavaTokens.javaTokensMain();
		
		System.out.println("...Goodbye!");

	}

}
