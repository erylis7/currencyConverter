package com.example.currency.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;

import com.example.currency.bus.CurrencyImpl;
import com.example.currency.model.CurrencySetGet;

public class CurrencyService {
	CurrencyImpl cc = new CurrencyImpl();
	
	@WebMethod
	public ArrayList<CurrencySetGet> getOneDollarResult (String denomination) {
		return cc.getOneDollarResult(denomination);
	}
}
