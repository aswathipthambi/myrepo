package stringprogram;

public class StringOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d="";
		String s="hi";
		System.out.println(s);
		String s1=new String("hello");
		System.out.println(s1);
		
     //charAt()-to return the character of string.
		
		System.out.println(s1.charAt(2));
		
		//length-to return length or size of a string.
		
		System.out.println(s1.length());
		
		//concat-add two string or add a new string to existing string
		
		System.out.println(s1.concat(s));
		
		System.out.println(s1);
    //contains-to check a character is present or not,if present true retuns otherwise false will return.
		
		System.out.println(s1.contains("e"));
		System.out.println(s1.contains("w"));
		
//isEmpty()-to check whether a string is empty or not.if empty true returns,otherwise false will return
		
		System.out.println(d.isEmpty());
//ToUppercase-convert lower case to uppercase
		
		System.out.println(s1.toUpperCase());

		System.out.println(s1.toLowerCase());

//valueOf()-convert any data type to string.(type conversion)
		
		int r =22;
		System.out.println(String.valueOf(r));
		
		//Equals-used to compare two string,if same true return,otherwise false will return
		
		String g="java";
		String v="java";
		String j="Java";
		
		System.out.println(g.equals(v));
		System.out.println(g.equals(j));
		
		System.out.println(g.equals(s));
		
		//equalIgnoreCase-ignore case,only check value
		
		System.out.println(j.equalsIgnoreCase(v));
		
		String m=new String("welcome");
		String m1=new String("welcome");
		System.out.println(m.equals(m1));



		System.out.println(g==v);//same m/y loctn
		System.out.println(m==m1);//diff m/y locatn

//equal operator is used to compare object reference,meaning it check if two variables point to 
		//same m/y location,on other hand equals method is used to compare the value of object.
		
		//Trim-remove leading and trailng space in string.(not between space)
		
		String k=" hi wecome to java class ";
		System.out.println(k.trim());
		System.out.println(k);
		//substring-to extract the part of the string.
		
		System.out.println(k.substring(4));
		System.out.println(k.substring(1, 9));






	}

}
