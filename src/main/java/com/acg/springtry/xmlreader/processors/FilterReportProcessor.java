package com.acg.springtry.xmlreader.processors;

import org.springframework.batch.item.ItemProcessor;

import com.acg.springtry.xmlreader.beans.Report;

public class FilterReportProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report report) throws Exception {
		System.out.print(report.getRefId() + " " + report.getName());
		return report;
	}

}
