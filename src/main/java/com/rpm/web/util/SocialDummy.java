package com.rpm.web.util;

import com.rpm.web.contents.Cars;
import com.rpm.web.contents.CarsRepository;
import com.rpm.web.social.Comment;
import com.rpm.web.social.Social;
import com.rpm.web.social.Thumb;
import com.rpm.web.user.User;
import com.rpm.web.user.UserRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class SocialDummy {
    @Autowired
    Printer printer;
    @Autowired
    UserRepository userRepository;
    @Autowired
    CarsRepository  carsRepository;

    public Map<String, List<String>> crawlingUrl() {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.clear();
        List<String> dates = new ArrayList<>();
        dates.clear();
        try {
            Document rawData = Jsoup.connect("http://www.ppomppu.co.kr/zboard/zboard.php?id=car&category=6").timeout(10 * 1000).get();
            Elements aTag = rawData.select("a[href^=view.php?id=car&page=1]");
            Elements date = rawData.select("td[class=eng list_vspace]");
            for (Element e : aTag) {
                list.add("http://www.ppomppu.co.kr/zboard/" + e.attr("href"));
            }
            for (Element e : date) {
                if (e.attr("title") != "") {
                    dates.add(e.attr("title"));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        map.put("url", list);
        map.put("dates", dates);

        return map;
    }

    public ArrayList<Social> crawlingBoard(List<User> user, List<Cars> car) {
        ArrayList<Social> list = new ArrayList<>();
        list.clear();
        List<String> urls = crawlingUrl().get("url");
        List<String> dates = crawlingUrl().get("dates");
        for (int i = 0; i < urls.size(); i++) {
            try {
                Collections.shuffle(user);
                Collections.shuffle(car);
                Social social = new Social();
                social.setUserSeq(user.get(0));
                social.setCarCode(car.get(0).getCarcd());
                social.setCarName(car.get(0).getTruckName());
                social.setBoardDate(dates.get(i));
                Document rawData = Jsoup.connect(urls.get(i)).timeout(10 * 1000).get();
                Elements boardContent = rawData.select(".pic_bg")
                        .select("tbody").select("tr").select("td")
                        .select("table").select("tbody").select("tr").select("td")
                        .select("table").select("tbody").select("tr").select("td").select("p");
                Elements boardImg = rawData.select("img[src^=//cdn.ppomppu.co.kr/zboard/]");
                social.setBoardImg(boardImg.get(0).attr("src"));
                social.setBoardContent(StringReplace(boardContent.text()));
                list.add(social);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return list;
    }
    public static String StringReplace(String str){
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        str =str.replaceAll(match, "");
        return str;
    }

    public ArrayList<Comment> crawlingComment(List<User>user, List<Social> socialList) {
        ArrayList<Comment> list = new ArrayList<>();
        list.clear();
        List<String> urls = crawlingUrl().get("url");
        for (int i = 0; i < urls.size(); i++) {
            try {
                Comment comment = new Comment();
                Collections.shuffle(user);
                Collections.shuffle(socialList);
                comment.setUserSeq(user.get(0));
                comment.setBoardSeq(socialList.get(0));
                Document rawData = Jsoup.connect(urls.get(i)).timeout(10 * 1000).get();
                Elements commentContents = rawData.select("div#newbbs")
                        .select("div").select("div").select("div")
                        .select(".comment_line").select(".info_bg").select("tbody").select("tr")
                        .select("td").select("div").select("p");
                Elements commentDates = rawData.select("div#newbbs")
                        .select("div").select("div").select("div")
                        .select(".comment_line").select(".info_bg").select("tbody").select("tr")
                        .select("td").select("font.eng");
                for (Element e : commentContents) {
                    if(!e.text().equals("")){
                        comment.setCommentDetail(e.text());
                    }
                }
                for (Element e : commentDates) {
                    comment.setCommentDate(e.text());
                }
                list.add(comment);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return list;

    }

    public Thumb makeThumbList(List<User>seq, List<Social> socialList){
        Thumb thumb = new Thumb();
        Collections.shuffle(seq);
        Collections.shuffle(socialList);
        thumb.setUserSeq(seq.get(0));
        thumb.setBoardSeq(socialList.get(0));
        return thumb;
    }

}