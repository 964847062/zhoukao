package com.liucanxiang.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: �����������
 * @author: sl
 * @date: 2020��3��30�� ����1:48:18
 */
public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
		Random r = new Random();
		
		
		return r.nextInt(max - min +1)+min;
	
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		if(subs>(max-min +1)) 
			throw new RuntimeException("���ݷ�Χ����");
			HashSet<Integer> set = new HashSet<Integer>();
			
			while(set.size()!=subs) {
				set.add(random(min, max));
			}
			int[] x = new int[subs];//Ŀ������
			int i=0;
			for (Integer integer : set) {
				x[i] = integer;
				i++;
			}
			
		
		
		return x;
	
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		
		return str.charAt(random(0, str.length()-1));
	
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<length;i++) {
			sb.append(randomCharacter());
		}
		
		return sb.toString();
	
	}
}
