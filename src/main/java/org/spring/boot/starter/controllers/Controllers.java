package org.spring.boot.starter.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class Controllers {
	
	@RequestMapping("single1/{inputvariable}")
	HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>> single1(@PathVariable String inputvariable) {
				
		HashMap<String, ArrayList<ArrayList<ArrayList<String>>>> k3 = new HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>();
		ArrayList<ArrayList<ArrayList<String>>> a2 = 
				new ArrayList<>(Arrays.asList(
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a1", "b1", "c1")),
								new ArrayList<>(Arrays.asList("d1", "e1", "f1")),
								new ArrayList<>(Arrays.asList("Response from Single 1 Server with input: " + inputvariable, "h1", "i1"))
						)), 
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a2", "b2", "c2")),
								new ArrayList<>(Arrays.asList("d2", "e2", "f2")),
								new ArrayList<>(Arrays.asList("g2", "h2", "i2"))
						)), 
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a3", "b3", "c3")),
								new ArrayList<>(Arrays.asList("d3", "e3", "f3")),
								new ArrayList<>(Arrays.asList("g3", "h3", "i3"))
						))
				));
		k3.put("a", a2);
		k3.put("b", a2);
		ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>> a1 = new ArrayList<>(Arrays.asList(k3,k3,k3));
		HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>> k2 = new HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>();
		k2.put("a", a1);
		k2.put("b", a1);
		HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>> k1 = new HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>>();
		k1.put("a",k2);
		k1.put("b",k2);
		return k1;
	}
	
	@RequestMapping("single2/{inputvariable}")
	HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>> single2(@PathVariable String inputvariable) {
				
		HashMap<String, ArrayList<ArrayList<ArrayList<String>>>> k3 = new HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>();
		ArrayList<ArrayList<ArrayList<String>>> a2 = 
				new ArrayList<>(Arrays.asList(
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a1", "b1", "c1")),
								new ArrayList<>(Arrays.asList("d1", "e1", "f1")),
								new ArrayList<>(Arrays.asList("g1", "h1", "i1"))
						)), 
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a2", "b2", "Response from Single 2 Server with input: " + inputvariable)),
								new ArrayList<>(Arrays.asList("d2", "e2", "f2")),
								new ArrayList<>(Arrays.asList("g2", "h2", "i2"))
						)), 
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a3", "b3", "c3")),
								new ArrayList<>(Arrays.asList("d3", "e3", "f3")),
								new ArrayList<>(Arrays.asList("g3", "h3", "i3"))
						))
				));
		k3.put("a", a2);
		k3.put("b", a2);
		ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>> a1 = new ArrayList<>(Arrays.asList(k3,k3,k3));
		HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>> k2 = new HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>();
		k2.put("a", a1);
		k2.put("b", a1);
		HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>> k1 = new HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>>();
		k1.put("a",k2);
		k1.put("b",k2);
		return k1;
	}
	
	@RequestMapping("single3/{inputvariable}")
	HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>> single3(@PathVariable String inputvariable) {
				
		HashMap<String, ArrayList<ArrayList<ArrayList<String>>>> k3 = new HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>();
		ArrayList<ArrayList<ArrayList<String>>> a2 = 
				new ArrayList<>(Arrays.asList(
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a1", "b1", "c1")),
								new ArrayList<>(Arrays.asList("d1", "e1", "f1")),
								new ArrayList<>(Arrays.asList("g1", "h1", "i1"))
						)), 
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a2", "b2", "c2")),
								new ArrayList<>(Arrays.asList("d2", "e2", "f2")),
								new ArrayList<>(Arrays.asList("g2", "h2", "Response from Single 3 Server with input: " + inputvariable))
						)), 
						new ArrayList<>(Arrays.asList(
								new ArrayList<>(Arrays.asList("a3", "b3", "c3")),
								new ArrayList<>(Arrays.asList("d3", "e3", "f3")),
								new ArrayList<>(Arrays.asList("g3", "h3", "i3"))
						))
				));
		k3.put("a", a2);
		k3.put("b", a2);
		ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>> a1 = new ArrayList<>(Arrays.asList(k3,k3,k3));
		HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>> k2 = new HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>();
		k2.put("a", a1);
		k2.put("b", a1);
		HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>> k1 = new HashMap<String, HashMap<String, ArrayList<HashMap<String, ArrayList<ArrayList<ArrayList<String>>>>>>>();
		k1.put("a",k2);
		k1.put("b",k2);
		return k1;
	}
	
	@RequestMapping("single4/{inputvariable}")
	HashMap<String, String> single4(@PathVariable String inputvariable) {
		HashMap<String, String> response = new HashMap<String, String>();
		if(inputvariable.equals("aaa") || inputvariable.equals("bbb") || inputvariable.equals("ccc")) {
			
			response.put("key", "selectOptionName2");
		}
		else if(inputvariable.equals("ddd") || inputvariable.equals("eee") || inputvariable.equals("fff")) {
		
			response.put("key", "selectOptionName3");
		}
		else {
			
			response.put("key", "selectOptionName1");
		}
		return response;
	}
	
	@RequestMapping("single5/{inputvariable}")
	HashMap<String, String> single5(@PathVariable String inputvariable) {
		HashMap<String, String> response = new HashMap<String, String>();
		if(inputvariable.equals("option1")) {
			
			response.put("key", "selectOptionName1");
		}
		else if(inputvariable.equals("option2")) {
		
			response.put("key", "selectOptionName2");
		}
		else {
			
			response.put("key", "selectOptionName3");
		}
		return response;
	}
	
	@RequestMapping("single6/{inputvariable}")
	HashMap<String, String> single6(@PathVariable String inputvariable) {
		HashMap<String, String> response = new HashMap<String, String>();
		if(inputvariable.equals("aaa") || inputvariable.equals("bbb") || inputvariable.equals("ccc")) {
			
			response.put("key", "radioOptionName2");
		}
		else if(inputvariable.equals("ddd") || inputvariable.equals("eee") || inputvariable.equals("fff")) {
		
			response.put("key", "radioOptionName3");
		}
		else {
			
			response.put("key", "radioOptionName1");
		}
		return response;
	}
	
	@RequestMapping("single7/{inputvariable}")
	HashMap<String, String> single7(@PathVariable String inputvariable) {
		HashMap<String, String> response = new HashMap<String, String>();
		if(inputvariable.equals("aaa") || inputvariable.equals("bbb") || inputvariable.equals("ccc")) {
			
			response.put("key", "radioOptionName2");
		}
		else if(inputvariable.equals("ddd") || inputvariable.equals("eee") || inputvariable.equals("fff")) {
		
			response.put("key", "radioOptionName3");
		}
		else {
			
			response.put("key", "radioOptionName1");
		}
		return response;
	}
	
	@RequestMapping("single8/{inputvariable}")
	HashMap<String, String> single8(@PathVariable String inputvariable) {
		HashMap<String, String> response = new HashMap<String, String>();
		if(inputvariable.equals("option1")) {
			
			response.put("key", "radioOptionName1");
		}
		else if(inputvariable.equals("option2")) {
		
			response.put("key", "radioOptionName2");
		}
		else {
			
			response.put("key", "radioOptionName3");
		}
		return response;
	}
	
	@RequestMapping("options1")
	HashMap<String, ArrayList<HashMap<String,String>>> options1() {
		HashMap<String, ArrayList<HashMap<String,String>>> response = new HashMap<String, ArrayList<HashMap<String,String>>>();
		HashMap<String,String> h1 = new HashMap<String,String>();
		h1.put("name", "Options 1: Option from Server 1");
		h1.put("value", "OptionfromServer1");
		HashMap<String,String> h2 = new HashMap<String,String>();
		h2.put("name", "Options 1: Option from Server 2");
		h2.put("value", "OptionfromServer2");
		HashMap<String,String> h3 = new HashMap<String,String>();
		h3.put("name", "Options 1: Option from Server 3");
		h3.put("value", "OptionfromServer3");
		response.put("key", new ArrayList<>(Arrays.asList(h1, h2, h3)));
		return response;
	}
	
	@RequestMapping("options2")
	HashMap<String, ArrayList<HashMap<String,String>>> options2() {
		HashMap<String, ArrayList<HashMap<String,String>>> response = new HashMap<String, ArrayList<HashMap<String,String>>>();
		HashMap<String,String> h1 = new HashMap<String,String>();
		h1.put("name", "Options 2: Option from Server 1");
		h1.put("value", "OptionfromServer1");
		HashMap<String,String> h2 = new HashMap<String,String>();
		h2.put("name", "Options 2: Option from Server 2");
		h2.put("value", "OptionfromServer2");
		HashMap<String,String> h3 = new HashMap<String,String>();
		h3.put("name", "Options 2: Option from Server 3");
		h3.put("value", "OptionfromServer3");
		HashMap<String,String> h4 = new HashMap<String,String>();
		h4.put("value", "OptionfromServer3");
		response.put("data", new ArrayList<>(Arrays.asList(h1, h2, h3)));
		response.put("value", new ArrayList<>(Arrays.asList(h4)));
		return response;
	}
	
	@RequestMapping("options3")
	String options3() {
		String response = "{\"data\":[{\"name\":\"Options 3: Option from Server 1\",\"value\":\"OptionfromServer1\"},{\"name\":\"Options 3: Option from Server 2\",\"value\":\"OptionfromServer2\"},{\"name\":\"Options 3: Option from Server 3\",\"value\":\"OptionfromServer3\"}],\"value\":[{\"value\":[\"OptionfromServer1\",\"OptionfromServer3\"]}]}";
		return response;
	}
	
	@RequestMapping("options4")
	HashMap<String, ArrayList<HashMap<String,String>>> options4() {
		HashMap<String, ArrayList<HashMap<String,String>>> response = new HashMap<String, ArrayList<HashMap<String,String>>>();
		HashMap<String,String> h1 = new HashMap<String,String>();
		h1.put("name", "Options 4: Option from Server 1");
		h1.put("value", "OptionfromServer1");
		HashMap<String,String> h2 = new HashMap<String,String>();
		h2.put("name", "Options 4: Option from Server 2");
		h2.put("value", "OptionfromServer2");
		HashMap<String,String> h3 = new HashMap<String,String>();
		h3.put("name", "Options 4: Option from Server 3");
		h3.put("value", "OptionfromServer3");
		response.put("key", new ArrayList<>(Arrays.asList(h1, h2, h3)));
		return response;
	}
	
	@RequestMapping("options5")
	HashMap<String, ArrayList<HashMap<String,String>>> options5() {
		HashMap<String, ArrayList<HashMap<String,String>>> response = new HashMap<String, ArrayList<HashMap<String,String>>>();
		HashMap<String,String> h1 = new HashMap<String,String>();
		h1.put("name", "Options 5: Option from Server 1");
		h1.put("value", "OptionfromServer1");
		HashMap<String,String> h2 = new HashMap<String,String>();
		h2.put("name", "Options 5: Option from Server 2");
		h2.put("value", "OptionfromServer2");
		HashMap<String,String> h3 = new HashMap<String,String>();
		h3.put("name", "Options 5: Option from Server 3");
		h3.put("value", "OptionfromServer3");
		response.put("key", new ArrayList<>(Arrays.asList(h1, h2, h3)));
		return response;
	}
	
	@RequestMapping("options6")
	HashMap<String, ArrayList<HashMap<String,String>>> options6() {
		HashMap<String, ArrayList<HashMap<String,String>>> response = new HashMap<String, ArrayList<HashMap<String,String>>>();
		HashMap<String,String> h1 = new HashMap<String,String>();
		h1.put("name", "Options 6: Option from Server 1");
		h1.put("value", "OptionfromServer1");
		HashMap<String,String> h2 = new HashMap<String,String>();
		h2.put("name", "Options 6: Option from Server 2");
		h2.put("value", "OptionfromServer2");
		HashMap<String,String> h3 = new HashMap<String,String>();
		h3.put("name", "Options 6: Option from Server 3");
		h3.put("value", "OptionfromServer3");
		HashMap<String,String> h4 = new HashMap<String,String>();
		h4.put("value", "OptionfromServer1");
		response.put("data", new ArrayList<>(Arrays.asList(h1, h2, h3)));
		response.put("value", new ArrayList<>(Arrays.asList(h4)));
		return response;
	}
	
	@RequestMapping("options7")
	HashMap<String, ArrayList<HashMap<String,String>>> options7() {
		HashMap<String, ArrayList<HashMap<String,String>>> response = new HashMap<String, ArrayList<HashMap<String,String>>>();
		HashMap<String,String> h1 = new HashMap<String,String>();
		h1.put("name", "Options 7: Option from Server 1");
		h1.put("value", "OptionfromServer1");
		HashMap<String,String> h2 = new HashMap<String,String>();
		h2.put("name", "Options 7: Option from Server 2");
		h2.put("value", "OptionfromServer2");
		HashMap<String,String> h3 = new HashMap<String,String>();
		h3.put("name", "Options 7: Option from Server 3");
		h3.put("value", "OptionfromServer3");
		HashMap<String,String> h4 = new HashMap<String,String>();
		h4.put("value", "OptionfromServer1");
		response.put("data", new ArrayList<>(Arrays.asList(h1, h2, h3)));
		response.put("value", new ArrayList<>(Arrays.asList(h4)));
		return response;
	}
	
	@RequestMapping("options8")
	String options8() {
		String response = "{\"data\":[{\"name\":\"Options 8: Option from Server 1\",\"value\":\"OptionfromServer1\"},{\"name\":\"Options 8: Option from Server 2\",\"value\":\"OptionfromServer2\"},{\"name\":\"Options 8: Option from Server 3\",\"value\":\"OptionfromServer3\"}],\"value\":[{\"value\":[\"OptionfromServer2\",\"OptionfromServer3\"]}]}";
		return response;
	}
	
	@RequestMapping("options9")
	String options9() {
		String response = "{\"data\":[{\"name\":\"Options 9: Option from Server 1\",\"value\":\"OptionfromServer1\"},{\"name\":\"Options 9: Option from Server 2\",\"value\":\"OptionfromServer2\"},{\"name\":\"Options 9: Option from Server 3\",\"value\":\"OptionfromServer3\"}],\"value\":[{\"value\":[\"OptionfromServer2\"]}]}";
		return response;
	}
	
	@RequestMapping("options10")
	HashMap<String, ArrayList<HashMap<String,String>>> options10() {
		HashMap<String, ArrayList<HashMap<String,String>>> response = new HashMap<String, ArrayList<HashMap<String,String>>>();
		ArrayList<HashMap<String,String>> a = new ArrayList<HashMap<String,String>>();
		for(int i = 0; i < 10000; i++) {
			
			HashMap<String,String> h = new HashMap<String,String>();
			h.put("name", "Options 7: Option from Server " + i);
			h.put("value", "OptionfromServer" + i);
			a.add(h);
		}
		response.put("data", a);
		return response;
	}
	
	
	@RequestMapping("multiple1/{inputvariable}")
	HashMap<String, ArrayList<String>> multiple1(@PathVariable String inputvariable) {
		HashMap<String, ArrayList<String>> response = new HashMap<String, ArrayList<String>>();
		if(inputvariable.equals("aaa") || inputvariable.equals("bbb") || inputvariable.equals("ccc")) {
			
			response.put("key", new ArrayList<>(Arrays.asList("selectOptionName1", "selectOptionName2")));
		}
		else if(inputvariable.equals("ddd") || inputvariable.equals("eee") || inputvariable.equals("fff")) {
		
			response.put("key", new ArrayList<>(Arrays.asList("selectOptionName2", "selectOptionName3")));
		}
		else {
			
			response.put("key", new ArrayList<>(Arrays.asList("selectOptionName1")));
		}
		return response;
	}
	
	@RequestMapping("multiple2/{inputvariable}")
	HashMap<String, ArrayList<String>> multiple2(@PathVariable String inputvariable) {
		HashMap<String, ArrayList<String>> response = new HashMap<String, ArrayList<String>>();
		if(inputvariable.equals("option1")) {
			
			response.put("key", new ArrayList<>(Arrays.asList("selectOptionName1", "selectOptionName2")));
		}
		else if(inputvariable.equals("option2")) {
		
			response.put("key", new ArrayList<>(Arrays.asList("selectOptionName2", "selectOptionName3")));
		}
		else {
			
			response.put("key", new ArrayList<>(Arrays.asList("selectOptionName1")));
		}
		return response;
	}
	
	@RequestMapping("multiple3/{inputvariable}")
	HashMap<String, ArrayList<String>> multiple3(@PathVariable String inputvariable) {
		HashMap<String, ArrayList<String>> response = new HashMap<String, ArrayList<String>>();
		if(inputvariable.equals("aaa") || inputvariable.equals("bbb") || inputvariable.equals("ccc")) {
			
			response.put("key", new ArrayList<>(Arrays.asList("checkboxOptionName1", "checkboxOptionName2")));
		}
		else if(inputvariable.equals("ddd") || inputvariable.equals("eee") || inputvariable.equals("fff")) {
		
			response.put("key", new ArrayList<>(Arrays.asList("checkboxOptionName2", "checkboxOptionName3")));
		}
		else {
			
			response.put("key", new ArrayList<>(Arrays.asList("checkboxOptionName1")));
		}
		return response;
	}
	
	@RequestMapping("multiple4/{inputvariable}")
	HashMap<String, ArrayList<String>> multiple4(@PathVariable String inputvariable) {
		HashMap<String, ArrayList<String>> response = new HashMap<String, ArrayList<String>>();
		if(inputvariable.equals("option1")) {
			
			response.put("key", new ArrayList<>(Arrays.asList("checkboxOptionName1", "checkboxOptionName2")));
		}
		else if(inputvariable.equals("option2")) {
		
			response.put("key", new ArrayList<>(Arrays.asList("checkboxOptionName2", "checkboxOptionName3")));
		}
		else {
			
			response.put("key", new ArrayList<>(Arrays.asList("checkboxOptionName1")));
		}
		return response;
	}
}
