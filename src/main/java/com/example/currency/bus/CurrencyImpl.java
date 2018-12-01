package com.example.currency.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.currency.model.CurrencySetGet;

public class CurrencyImpl {
	private Map<String, ArrayList> totalMap = new HashMap<>();
	private ArrayList<CurrencySetGet> list;
	
	public CurrencyImpl() {
		CurrencySetGet aussieMoneyA = new CurrencySetGet( "India", 50.95);
		CurrencySetGet aussieMoneyB = new CurrencySetGet( "Brunei", 1.00);
		CurrencySetGet aussieMoneyC = new CurrencySetGet( "Indonesia",10445.85);
		
		list = new ArrayList<>();
		list.add(aussieMoneyA);
		list.add(aussieMoneyB);
		list.add(aussieMoneyC);
		totalMap.put("aussie", list);
		
		CurrencySetGet indiaMoneyA = new CurrencySetGet( "Brunei", 0.020);
		CurrencySetGet indiaMoneyB = new CurrencySetGet( "Indonesia", 204.97);
		CurrencySetGet indiaMoneyC = new CurrencySetGet( "Aussie", 0.020);
		
		list = new ArrayList<>();
		list.add(indiaMoneyA);
		list.add(indiaMoneyB);
		list.add(indiaMoneyC);
		totalMap.put("india", list);
		
		CurrencySetGet bruneiMoneyA= new CurrencySetGet( "Indonesia", 50.95);
		CurrencySetGet bruneiMoneyB = new CurrencySetGet( "Aussie", 1.00);
		CurrencySetGet bruneiMoneyC = new CurrencySetGet( "India", 10441.60);
		
		list = new ArrayList<>();
		list.add(bruneiMoneyA);
		list.add(bruneiMoneyB);
		list.add(bruneiMoneyC);
		totalMap.put("USD", list);
		
		
	}
	
	public ArrayList getOneDollarResult (String denomination) {
		return totalMap.get(denomination);
	}

}
