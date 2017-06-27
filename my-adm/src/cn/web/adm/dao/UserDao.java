package cn.web.adm.dao;

import org.mybatis.spring.annotation.MapperScan;
import cn.web.adm.entity.User;

@MapperScan
public interface UserDao {
	public User getUser(User user);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}
