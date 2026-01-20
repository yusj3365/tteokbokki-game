package com.tteokbokki.global.util;

import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

@Component
public class HamaCryptoUtil {

    private static final String SECRET_KEY = "my_rainbow_member_id";
    private static final String SECRET_IV = "my_rainbow_member_secret_iv";
    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String KEY = "my_rainbow_member_id_crypto_!21$"; // 최소 32바이트 이상 필요

    private static SecretKeySpec getKey() throws Exception {
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        byte[] key = sha.digest(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
        return new SecretKeySpec(key, "AES");
    }

    private static IvParameterSpec getIv() throws Exception {
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        byte[] iv = sha.digest(SECRET_IV.getBytes(StandardCharsets.UTF_8));
        return new IvParameterSpec(iv, 0, 16); // 첫 16바이트만 사용
    }

    public static String encrypt(String plainText) {
        byte[] encrypted;
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, getKey(), getIv());
            encrypted = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String decrypt(String encryptedText) {
        String text;
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, getKey(), getIv());
            byte[] decoded = Base64.getDecoder().decode(encryptedText);
            byte[] original = cipher.doFinal(decoded);
            text = new String(original, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return text;
    }

    public static String newEncrypt(String plainText) {
        // IV 길이 맞추기
        byte[] ivBytes = KEY.substring(0, 16).getBytes(StandardCharsets.UTF_8);
        IvParameterSpec iv = new IvParameterSpec(ivBytes);

        // 키 설정 (AES-256은 32바이트 키 필요)
        SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), "AES");
        byte[] encrypted;
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
            encrypted = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String newDecrypt(String encryptedText) {
        byte[] ivBytes = KEY.substring(0, 16).getBytes(StandardCharsets.UTF_8);
        IvParameterSpec iv = new IvParameterSpec(ivBytes);

        SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), "AES");
        String text;
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);

            byte[] decoded = Base64.getDecoder().decode(encryptedText);
            byte[] original = cipher.doFinal(decoded);
            text = new String(original, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return text;
    }
}
