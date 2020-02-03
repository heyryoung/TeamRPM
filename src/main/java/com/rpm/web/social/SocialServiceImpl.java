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

@Service
@Lazy
public class SocialServiceImpl implements SocialService{
    @Autowired SocialRepository socialRepository;
    @Autowired CarsRepository carsRepository;
    @Autowired UserRepository userRepository;
    @Autowired Social social;
    @Autowired SocialDetailDto socialDetailDto;
    @Autowired User user;
    @Autowired ThumbRepository thumbRepository;
    @Autowired Thumb thumb;


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
                        social.getUserSeq().getName(), social.getThumbs().size()))
                .sorted(Comparator.comparing(SocialListDto::getBoardSeq).reversed())
                .collect(Collectors.toList());
        return lists;
    }

    @Override
    public String[] thumbed(String userid) {
        Iterable<Thumb> thumbs = thumbRepository.findAll();
        List<Thumb> thumbList = new ArrayList<>();
        for(Thumb t : thumbs){
            thumbList.add(t);
        }
        List<Thumb> thumbsByUserid =thumbList.stream().filter(t->t.getUserSeq().getUserid().equals(userid))
                .collect(Collectors.toList());
        System.out.println(thumbsByUserid.get(0).getBoardSeq().getBoardSeq());
        String[] thumbArray = new String[thumbsByUserid.size()];
        for(int i = 0; i<thumbsByUserid.size(); i++){
            thumbArray[i]= String.valueOf(thumbsByUserid.get(i).getBoardSeq().getBoardSeq());
        }
        System.out.println(thumbArray[0]+ thumbArray[1]+ thumbArray[2]);
        return thumbArray;
    }


    @Override
    public SocialDetailDto loadBoard(String boardSeq){
        social = (socialRepository.findById(Long.parseLong(boardSeq))).get();
        socialDetailDto = new SocialDetailDto();
        socialDetailDto.setCarName(social.getCarName());
        socialDetailDto.setBoardContent(social.getBoardContent());
        socialDetailDto.setBoardDate(social.getBoardDate());
        socialDetailDto.setBoardImg(social.getBoardImg());
        socialDetailDto.setUserid(social.getUserSeq().getUserid());
        socialDetailDto.setUserName(social.getUserSeq().getName());
        //socialDetailDto.setCommentCount(social.getComments().size());
        socialDetailDto.setThumbCount(social.getThumbs().size());
        System.out.println(socialDetailDto.getThumbCount());
        return socialDetailDto;
    }

    @Override
    public void writeContent(SocialWriteDto param){
        //user 하드코딩//
        user = userRepository.findByUserSeq(8093);
        //user 바꾸기
        social = new Social();
        social.setUserSeq(user);
        social.setCarName(param.getCarName());
        social.setBoardDate(new SimpleDateFormat ( "yy.MM.dd HH:mm:ss").format( new Date()));
        social.setCarCode("board"+social.getBoardDate());
        social.setBoardImg("img\\"+param.getBoardImgName());
        social.setBoardContent(param.getBoardContent());
        socialRepository.save(social);
    }

    @Override
    public void updateContent(String boardSeq, SocialWriteDto socialWriteDto){
        social = socialRepository.findById(Long.parseLong(boardSeq)).get();
        if(socialWriteDto.getBoardImgName().contains("img\\")||
                socialWriteDto.getBoardImgName().contains("//cdn")){
            social.setBoardImg(socialWriteDto.getBoardImgName());
        }else{
            social.setBoardImg("img\\"+socialWriteDto.getBoardImgName());
        }
        social.setCarName(socialWriteDto.getCarName());
        social.setBoardContent(socialWriteDto.getBoardContent());
        socialRepository.save(social);
    }

    @Override
    public void deleteContent(String boardSeq) {
        social = socialRepository.findById(Long.parseLong(boardSeq)).get();
        socialRepository.delete(social);
    }

    @Override
    public void thumbUp(String boardSeq, String userid) {
        thumb= new Thumb();
        thumb.setBoardSeq(socialRepository.findById(Long.parseLong(boardSeq)).get());
        thumb.setUserSeq(userRepository.findByUserid(userid));
        thumbRepository.save(thumb);
        System.out.println(socialRepository.findById(Long.parseLong(boardSeq)).get().getThumbs().size());
    }

    @Override
    public void thumbDown(String boardSeq, String userid) {
        social = socialRepository.findById(Long.parseLong(boardSeq)).get();
        user = userRepository.findByUserid(userid);
        thumb = thumbRepository.findByBoardSeqAndUserSeq(social, user);
        thumbRepository.delete(thumb);
        System.out.println(thumb.getThumbSeq());
    }
}
