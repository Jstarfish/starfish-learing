package priv.starfish.system.dao;


import org.springframework.beans.BeansException;
import priv.starfish.system.form.UserForm;
import priv.starfish.system.model.User;

import java.util.List;

/**
 * Created by starfish on 2017/8/22.
 */
public interface UserDao {


    User getUserInfo(String username);

    List<User> getAllUsers(UserForm form);

   /* default Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }*/
}
