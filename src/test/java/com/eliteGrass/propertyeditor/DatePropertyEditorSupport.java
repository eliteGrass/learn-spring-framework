package com.eliteGrass.propertyeditor;


import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author liteGrass
 * @Date 2025-02-19  22:00
 * @Description 事件类型转换
 */
@Component
public class DatePropertyEditorSupport extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			Date date = parseDate(text);
			super.setValue(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	private Date parseDate(String text) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.parse(text);
	}
}
