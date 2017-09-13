package com.saral.training.Java.datatypes;

public class IntegerImpl {
	
	

	public static void main(String[] args) {

		int a=55;
		String aa="45";
		
		Integer x=new Integer(a);
		Integer y=new Integer(aa);
		Boolean b = new Boolean("true");
		Boolean bb = new Boolean(true);
		char c='a';
		double d=11.333;
		Character cc = new Character(c);
		Character c1 = new Character('e');
		System.out.println("equal "+x.equals(y));
		System.out.println("compare to "+x.compareTo(y));
		System.out.println("compare  "+Integer.compare(x,y));
		System.out.println("to string "+x.toString());
		System.out.println("hex string"+Integer.toHexString(x));
		System.out.println("binary"+Integer.toBinaryString(x));
		System.out.println("octal string"+Integer.toOctalString(x));
		System.out.println("to string with radix"+Integer.toString(x, 5));
		System.out.println("value of" + Integer.valueOf(x.toString()));
		System.out.println("value of with radix" +Integer.valueOf(Integer.toBinaryString(x), 2));
		System.out.println("parse int "+Integer.parseInt(Integer.toBinaryString(x)));
		System.out.println("parse int "+Integer.parseInt(Integer.toBinaryString(x),2));
		System.out.println("getInteger "+Integer.getInteger("sun.arch.data.model"));
		System.out.println("decode "+Integer.decode("0x0f"));
		System.out.println("Rotate left "+Integer.rotateLeft(x, 2));
		System.out.println("Rotate right "+Integer.rotateRight(x, 2));
		System.out.println("Byte conversion "+x.byteValue());
		System.out.println("Short conversion "+x.shortValue());
		System.out.println("long conversion "+x.longValue());
		System.out.println("Int conversion "+x.intValue());
		System.out.println("float conversion "+x.floatValue());
		System.out.println("double conversion "+x.doubleValue());
		System.out.println("hashcode "+x.hashCode());
		System.out.println("bit count "+Integer.bitCount(x));
		System.out.println("number of leading zeros"+Integer.numberOfLeadingZeros(x));
		System.out.println("numberOfTrailingZeroes "+Integer.numberOfTrailingZeros(x));
		System.out.println("parse boolean string "+Boolean.toString(b));
		System.out.println("boolean value of string "+bb.booleanValue());
		System.out.println("value of boolean "+Boolean.valueOf(b));
		System.out.println("value of boolean string "+Boolean.valueOf(bb));
		System.out.println("Boolean static to string "+Boolean.toString(b));
		System.out.println("to string "+b.toString());
		System.out.println("boolean hashcode "+b.hashCode());
		System.out.println(" boolean equals "+b.equals(bb));
		System.out.println("compare to "+b.compareTo(bb));
		System.out.println("compare "+Boolean.compare(b, bb));
		System.out.println("character is letter "+Character.isLetter(cc));
		System.out.println("Character is digit "+Character.isDigit(cc));
		System.out.println("character is whitespace"+Character.isWhitespace(cc));
		System.out.println("character is uppercase"+Character.isUpperCase(c));
		System.out.println("character is lower case"+Character.isLowerCase(c));
		System.out.println("character is to string "+Character.toString(c));
		System.out.println("double is "+Double.doubleToLongBits(d));
		System.out.println("character is ");
	}

}
