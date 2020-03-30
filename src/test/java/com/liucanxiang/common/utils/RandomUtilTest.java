package com.liucanxiang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {
	//返回一个随机整数
	@Test
	public void testRandom() {
		int i = RandomUtil.random(1, 3);
		System.out.println(i);
	}
	//返回随机整数的数组
	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1,10,3 );
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char character = RandomUtil.randomCharacter();
		System.out.println(character);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(10);
		System.out.println(string);
	}

}
