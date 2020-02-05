package com.rpm.web.magazine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MagazineInit implements ApplicationRunner {
    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private ExtractedWordRepository extractedWordRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ArticleCrawler crawler = new ArticleCrawler( articleRepository , extractedWordRepository );
        if (articleRepository.count() == 0 ) crawler.motorgraphComtroller();
        if (extractedWordRepository.count() == 0 ) crawler.extractor();
    }


}
