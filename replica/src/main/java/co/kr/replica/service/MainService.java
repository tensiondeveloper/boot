package co.kr.replica.service;

import co.kr.replica.vo.uservo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MainService {

    List<uservo> getUserList();

}
