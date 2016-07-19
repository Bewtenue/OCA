package com.softpath.ejerciciosenum;

import java.util.Calendar;

enum Brujula{
 NORTE,SUR,ESTE,OESTE
}

public class EnumTest {

 Brujula brujula;
 
 public EnumTest(Brujula brujula)
 {
 this.brujula = brujula; 
 }
 
 public void feature()
 {
	 
  switch (brujula)
  {
  case NORTE:
   System.out.println("En el norte");
   break;

  case SUR:
   System.out.println("En el sur");
   break;

  case ESTE:
   System.out.println("En el este");
   break;

  case OESTE:
   System.out.println("En el oeste");
   break;
  }
  
  
 }
 
 public static void main(String[] args) {
  
  EnumTest en = new EnumTest(Brujula.NORTE);
  en.feature();
 }
 
 
 
 
}
