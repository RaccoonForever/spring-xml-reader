package com.acg.springtry.xmlreader.adapters;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class JaxbDateAdapter extends XmlAdapter<String, Date> {

	private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public String marshal(Date date) throws Exception {
		return df.format(date);
	}

	@Override
	public Date unmarshal(String string_date) throws Exception {
		return df.parse(string_date);
	}

}
