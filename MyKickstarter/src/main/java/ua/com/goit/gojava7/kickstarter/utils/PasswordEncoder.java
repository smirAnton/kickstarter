package ua.com.goit.gojava7.kickstarter.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PasswordEncoder implements org.springframework.security.crypto.password.PasswordEncoder {
	private static final Logger log = LoggerFactory.getLogger(PasswordEncoder.class);
	private MessageDigest messageDigest;

	public PasswordEncoder() {
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			log.debug(e.getMessage());
		}
	}

	@Override
	public String encode(CharSequence rawPassword) {
		if (messageDigest == null) {
			return rawPassword.toString();
		}
		messageDigest.update(rawPassword.toString().getBytes());
		byte[] byteData = messageDigest.digest();

		StringBuffer hexString = new StringBuffer();
		for (int index = 0; index < byteData.length; index++) {
			String hex = Integer.toHexString(0xff & byteData[index]);
			if (hex.length() == 1) {
				hexString.append('0');
			}
			hexString.append(hex);
		}
		return hexString.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return encode(rawPassword).equals(encodedPassword);
	}
}
