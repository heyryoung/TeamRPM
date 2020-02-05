package com.rpm.web.recommend;
import com.rpm.web.company.CompanyRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class RecommendInit implements ApplicationRunner {
    private RecommendRepository recommendRepository;
    private CompanyRepository companyRepository;

    public RecommendInit(RecommendRepository recommendRepository, CompanyRepository companyRepository) {
        this.recommendRepository = recommendRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {



        SimpleDateFormat SystemTime = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        String formattedTime1 = SystemTime.format (System.currentTimeMillis());

        System.out.println( formattedTime1 + "  INFO 18844 --- [           RecommendInit ]         : RecommendInit Start ");

        long count = recommendRepository.count();
            if (count == 0) {
                List<String> code = companyRepository.findCenterCode();
                String[] fuel={"휘발유","경유","전기","LPG","가솔린"};
                int[]minBeginYear=new int[20];
                int[]maxBeginYear=new int[20];
                int[]minMilage=new int[20];
                int[]maxMilage=new int[20];
                int[]minPrice=new int[20];
                int[]maxPrice=new int[20];
                String[]makeName= {"기아","쌍용","르노삼성","현대","벤츠","쉐보레(GM대우)"};
                String[]transmissionCdName= {"오토","수동"};
                for(int i=0;i<20;i++){
                    minBeginYear[i]=1999+i;
                    maxBeginYear[i]=2000+i;
                    minMilage[i]=10000*i;
                    maxMilage[i]=12000*i;
                    minPrice[i]=100*i;
                    maxPrice[i]=120*i;
                }
                code.forEach(el -> {
                for(int i =0; i<20;i++) {

                        Recommend recommend = new Recommend();
                        recommend.setAuth(true);
                        recommend.setCenterRegion(companyRepository.findByCenterCode2(el));
                        recommend.setCenterName(companyRepository.findByCenterCode(el));
                        recommend.setFuleTypedName(fuel[i%5]);
                        recommend.setMaxBeginYear(maxBeginYear[i]);
                        recommend.setMinBeginYear(minBeginYear[i]);
                        recommend.setMaxMilage(maxMilage[i]);
                        recommend.setMinMilage(minMilage[i]);
                        recommend.setMaxPrice(maxPrice[i]);
                        recommend.setMinPrice(minPrice[i]);
                        recommend.setMakeNm(makeName[i%6]);
                        recommend.setModelGrpNm(recommendRepository.findByMakeNm(makeName[i % 5]).get(i%4));
                        recommend.setModelNm(recommendRepository.findByModelGrpNm(recommendRepository.findByMakeNm(makeName[i % 6]).get(i%4)).get(0));
                        recommend.setTransmissioncdName(transmissionCdName[i%2]);
                        recommend.setUserId(recommendRepository.findUserId().get(i));
                        recommend.setName(recommendRepository.findNameByUserId(recommendRepository.findUserId().get(i)));
                        Recommend recommendCenter = new Recommend();
                        recommendCenter.setAuth(false);
                        recommendCenter.setFuleTypedName(recommend.getFuleTypedName());
                        recommendCenter.setMaxBeginYear(recommend.getMaxBeginYear());
                        recommendCenter.setMinBeginYear(recommend.getMinBeginYear());
                        recommendCenter.setMaxMilage(recommend.getMaxMilage());
                        recommendCenter.setMinMilage(recommend.getMinMilage());
                        recommendCenter.setMaxPrice(recommend.getMaxPrice());
                        recommendCenter.setMinPrice(recommend.getMinPrice());
                        recommendCenter.setModelGrpNm(recommend.getModelGrpNm());
                        recommendCenter.setModelNm(recommend.getModelNm());
                        recommendCenter.setMakeNm(recommend.getMakeNm());
                        recommendCenter.setName(recommend.getName());
                        recommendCenter.setTransmissioncdName(recommend.getTransmissioncdName());
                        recommendCenter.setUserId(companyRepository.findByCenterName(recommend.getCenterName()));
                        recommendRepository.save(recommend);
                        recommendRepository.save(recommendCenter);
                }
                });
            }
        System.out.println( formattedTime1 + "  INFO 18844 --- [           RecommendInit ]         : RecommendInit End ");
    }

}