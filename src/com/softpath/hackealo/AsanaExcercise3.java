package com.softpath.hackealo;

import java.util.ArrayList;

public class AsanaExcercise3 {
	String smartAssigning(String[][] information) {
		String assigned[] = new String[information.length];
		ArrayList<String[]> informationReduced = new ArrayList<String[]>();
		
	    if(information.length < 1 || information.length > 10){
	        System.out.println("constraint error");    
	    }
	   
	    //ignoring those in vacations
	    for(int i = 0; i < information.length; i++){
	       if(information[i][1] != "0"){
	           informationReduced.add(information[i]);
	       }
	    }
	    String infoReduced[][] = informationReduced.toArray(new String[informationReduced.size()][]);
	   /* for(int i = 0 ;i < infoReduced.length;i++){
	    	System.out.println(infoReduced[i][0]);
	    }*/
	    // if there is only 1 who isnt in vacations
	    if(infoReduced.length == 1){
	        return infoReduced[0][0];
	    }else //otherwise compare the rest
	        for(int i = 0; i < infoReduced.length -1; i++){
	         assigned = comparingElements(infoReduced[i],infoReduced[i + 1]);
	    }
	    return assigned[0];
	}


	String[] comparingElements(String arrayComparing1[],String arrayComparing2[]){
	    //checking who has less tasks
	    if(Integer.parseInt(arrayComparing1[3]) < Integer.parseInt(arrayComparing2[3])){
	        return arrayComparing1;
	    } else if (Integer.parseInt(arrayComparing1[3]) == Integer.parseInt(arrayComparing2[3])){
	        if(Integer.parseInt(arrayComparing1[2]) < Integer.parseInt(arrayComparing2[2])){
	            return arrayComparing1;
	        } else return arrayComparing2;
	    } else return arrayComparing2;
	    
	}
	
	public static void main(String[] args) {
		String test1[][] = {{"John","1","2","6"},{"Martin","1","1","5"}};
		AsanaExcercise3 ae3 = new AsanaExcercise3();
		String test = ae3.smartAssigning(test1);
		System.out.println(test);
	}
	
	
}
