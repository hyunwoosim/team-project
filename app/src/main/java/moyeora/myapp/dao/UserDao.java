package moyeora.myapp.dao;

import moyeora.myapp.vo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

     public void add(User user);





}
