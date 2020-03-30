package com.liucanxiang.common.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.lcx.common.utils.DateUtil;
import com.liucanxiang.common.utils.RandomUtil;
import com.liucanxiang.common.utils.StringUtil;

public class PersonTest {

	@Test
	public void testToString() {
		for(int i =0 ; i<=10000 ; i++) {
			Person p = new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			System.out.println(p);
		}
	}

}
