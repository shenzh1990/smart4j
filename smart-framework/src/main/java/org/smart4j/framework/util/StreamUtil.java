/**
 * 
 */
package org.smart4j.framework.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Simon Shen 2016-6-23
 */
public final class StreamUtil {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(StreamUtil.class);

	/**
	 * 从输入流中获取String
	 * 
	 * @param is
	 * @return
	 */
	public static String getString(InputStream is) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(is));
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}

		} catch (Exception e) {
			LOGGER.error("get string from input stream failure", e);
			throw new RuntimeException(e);
		}
		return sb.toString();
	}

}
