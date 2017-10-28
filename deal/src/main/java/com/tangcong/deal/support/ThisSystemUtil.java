package com.tangcong.deal.support;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class ThisSystemUtil {
	public static String md5(String s) {
		try {
			s+="^oa$";
			// 确定计算方法
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			BASE64Encoder base64en = new BASE64Encoder();
			// 加密后的字符串
			String newstr = base64en.encode(md5.digest(s.getBytes("utf-8")));
			return newstr;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 清理字符串前后空格,如果字符串为空白字符串，则返回null
	 * 
	 * @param s
	 * @return
	 */
	public static String $(String s) {
		if (s != null) {
			if ((s = s.trim()).length() == 0)
				return null;
			else
				return s;
		}
		return null;
	}

	/**
	 * 验证s是否为null或空字符串，如果是则抛出异常 否则返回清理后的字符串
	 * 
	 * @param message
	 * @param s
	 * @return
	 */
	public static String $(String name, String s) {
		if (s == null || (s = s.trim()).length() == 0) {
			throw new ThisSystemException(name + "不能为空，必须输入!");
		}
		return s;
	}

	/**
	 * 解析字符串为整数
	 * 
	 * @param s
	 * @param defaultInt
	 * @return
	 */
	public static int parseInt(String s, int defaultInt) {
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return defaultInt;
		}
	}
}
