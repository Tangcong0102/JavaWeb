package com.tangcong.deal.support;

import java.util.Iterator;

/**
 * 全局异常类
 * @author yizhuoyan@hotmail.com
 *
 */
public class ThisSystemException extends RuntimeException {

	public ThisSystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public ThisSystemException(String message) {
		super(message);
	}
	
	public static void throwWithMessage(String message,Object... args) {
		for (int i = 0; i < args.length; i++) {
			message=message.replaceFirst("\\?",String.valueOf(args[0]));
		}
		throw new ThisSystemException(message);
	}
	
	
}
