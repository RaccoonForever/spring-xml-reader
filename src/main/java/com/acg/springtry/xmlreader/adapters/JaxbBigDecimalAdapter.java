package com.acg.springtry.xmlreader.adapters;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class JaxbBigDecimalAdapter extends XmlAdapter<String, BigDecimal> {

	@Override
	public String marshal(BigDecimal bigdecimal) throws Exception {
		return bigdecimal.toString();
	}

	@Override
	public BigDecimal unmarshal(String string_decimal) throws Exception {
		return new BigDecimal(string_decimal.replaceAll(",", ""));
	}


}
