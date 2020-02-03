package com.rpm.web.social;

import com.rpm.web.contents.Cars;
import com.rpm.web.contents.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Lazy
public class SocialServiceImpl implements SocialService{
    @Autowired SocialRepository socialRepository;
    @Autowired CarsRepository carsRepository;

    @Transactional(readOnly = true)
    @Override
    public List<SocialListDto> allList() {
        Iterable<Social> socials = socialRepository.findAll();
        List<Social> list = new ArrayList<>();
        for(Social s : socials){
            list.add(s);
        }

        Iterable<Cars> cars = carsRepository.findAll();
        List<Cars> carList = new ArrayList<>();
        for (Cars c : cars) {
            carList.add(c);
        }

        List<SocialListDto> lists =  list.stream()
                .map(social -> new SocialListDto(social.getBoardSeq(), social.getBoardDate(),
                        social.getCarCode(), social.getCarName(), social.getBoardContent(), social.getBoardImg(),
                        social.getUserSeq().getName(), social.getComments().size(), social.getThumbs().size()))
                .sorted(Comparator.comparing(SocialListDto::getBoardSeq).reversed())
                .collect(Collectors.toList());
        return null;
    }



}
