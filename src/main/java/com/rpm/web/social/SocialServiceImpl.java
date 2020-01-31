package com.rpm.web.social;

import com.rpm.web.contents.Cars;
import com.rpm.web.contents.CarsRepository;
import com.rpm.web.user.User;
import com.rpm.web.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Lazy
public class SocialServiceImpl implements SocialService{
    @Autowired SocialRepository socialRepository;
    @Autowired CarsRepository carsRepository;
    @Autowired UserRepository userRepository;
    @Autowired Social social;
    @Autowired SocialDetailDto socialDetailDto;

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
        return lists;
    }

    public void writeContent(SocialWriteDto param){
        //user 하드코딩//
        User user = userRepository.findByUserSeq(8093);
        //user 바꾸기
        social.setUserSeq(user);
        social.setCarName(param.getCarName());
        social.setBoardDate(new SimpleDateFormat ( "yy.MM.dd HH:mm:ss").format( new Date()));
        social.setCarCode("board"+social.getBoardDate());
        String path = "img\\";
        social.setBoardImg(path+param.getBoardImgName());
        social.setBoardContent(param.getBoardContent());
        socialRepository.save(social);
    }
    public SocialDetailDto loadBoard(String boardSeq){
        social = (socialRepository.findById(Long.parseLong(boardSeq))).get();
        System.out.println(social);
        socialDetailDto.setCarName(social.getCarName());
        socialDetailDto.setBoardContent(social.getBoardContent());
        socialDetailDto.setBoardDate(social.getBoardDate());
        socialDetailDto.setBoardImg(social.getBoardImg());
        socialDetailDto.setUserid(social.getUserSeq().getUserid());
        socialDetailDto.setUserName(social.getUserSeq().getName());
        return socialDetailDto;
    }
    public void updateContent(SocialWriteDto param){
        social.setUserSeq(param.getUser());
        social.setCarName(param.getCarName());
        social.setBoardDate(new SimpleDateFormat ( "yy.MM.dd HH:mm:ss").format( new Date()));
        social.setCarCode("board"+social.getBoardDate());
        String path = "C:\\Users\\yejee\\IdeaProjects\\TeamRPM\\src\\main\\resources\\static\\img\\";
        social.setBoardImg(path+param.getBoardImgName());
        social.setBoardContent(param.getBoardContent());
        socialRepository.save(social);
    }
}
