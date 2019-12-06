package sib.vocabulary;

import java.util.HashMap;

public class DBPPROP {
	//The Namespace of this vocabulary as String
	public static final String NS = "http://dbpedia.org/property/";
	
	public static final String PREFIX = "dbpprop:";
	public static final String FACTPREFIX = "dbpprop_";
	
	private static HashMap<String, String> uriMap = new HashMap<String, String>();
	
	/*
	 * For prefixed versions
	 */
	public static String prefixed(String string) {
		if(uriMap.containsKey(string)) {
			return uriMap.get(string);
		}
		else {
			String newValue = PREFIX + string;
			uriMap.put(string, newValue);
			return newValue;
		}
	}

	public static String factprefixed(String string) {
		if(uriMap.containsKey(string)) {
			return uriMap.get(string);
		}
		else {
			String newValue = FACTPREFIX + string;
			uriMap.put(string, newValue);
			return newValue;
		}
	}

	//Get the URI of this vocabulary
	public static String getURI() { return NS; }
	
	//Properties
}
