package com.rpm.web.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class MakeCarDummyList {

    private final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.117 Safari/537.36";



    public void sendPost(String targetUrl) throws Exception {

        try {
            String  jsonResult  = Jsoup
                    .connect(targetUrl)
                    .userAgent(USER_AGENT)
                    .data("price_tab_flag", "2")
                    .data("limit", "60")
                    .data("orderFlag", "true")
                    .data("orderby", "n_order:desc")
                    .data("wr_eq_v_usernm", "")
                    .data("pageno", "2")
                    .ignoreContentType(true)
                    .execute()
                    .body();

            System.out.println(jsonResult);


        } catch( IOException e ) {
            e.printStackTrace();
        }


    }


}
