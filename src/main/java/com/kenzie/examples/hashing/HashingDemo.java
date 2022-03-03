package com.kenzie.examples.hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class HashingDemo {

    public static void main(String[] args) throws NoSuchAlgorithmException {

//        List<Integer> list = new ArrayList<Integer>(
//                Arrays.asList(11,12,13,14,15,22,1201, 100, 57, 32, 145, 897));
//
//        HashingDataStr hds = new HashingDataStr(list);
//
//        System.out.println(hds.toString());

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest("SEBD Advanced ATA Course".getBytes(StandardCharsets.UTF_8));
        String encoded = Base64.getEncoder().encodeToString(hash);

        System.out.println("Encoded String= " + encoded);
      }
}
