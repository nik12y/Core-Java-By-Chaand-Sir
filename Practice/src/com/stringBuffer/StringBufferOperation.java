package com.stringBuffer;

public class StringBufferOperation {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.append("Java");
//		sb.append(12);
//		sb.append('a');
//		sb.insert(2, "Java");
//		sb.replace(1, 2, "Java");
//		sb.delete(1, 4);
		
//		sb.length();
//		sb.reverse();
	//	sb.setLength(sb.length()-1);

		System.out.println(sb.toString());
		
		StringBuilder sbuilder=new StringBuilder("Hello");
		sbuilder.append("java");
		System.out.println(sbuilder);
	}
}
