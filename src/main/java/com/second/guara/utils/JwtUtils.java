package com.second.guara.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.HashMap;

public class JwtUtils {
    public static String BASE64_ENCODED_KEY = "81o*Udwgwd^";
    public static long TOKEN_EXP = 1000 * 60 * 10;

    public static String getToken(int id) {
        HashMap<String, Object> map = new HashMap<>();
        Date now = new Date();
        return JWT.create()
                .withHeader(map)
                .withIssuedAt(now)
                .withClaim("id", id)
                .withExpiresAt(getExpirationDate(now))
                .sign(Algorithm.HMAC256(BASE64_ENCODED_KEY));
    }

    private static Date getExpirationDate(Date now) {
        now.setTime(now.getTime() + TOKEN_EXP);
        return now;
    }
}
