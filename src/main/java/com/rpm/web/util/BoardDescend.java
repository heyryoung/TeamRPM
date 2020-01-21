package com.rpm.web.util;

import com.rpm.web.social.Social;

import java.util.Comparator;

public class BoardDescend implements Comparator<Social> {

    @Override
    public int compare(Social o1, Social o2) {
        long firstValue = o1.getBoardSeq();
        long secondValue = o2.getBoardSeq();

        if(firstValue > secondValue) {
            return -1;
        }else if (firstValue < secondValue) {
            return 1;
        }else {
            return 0;
        }
    }
}
