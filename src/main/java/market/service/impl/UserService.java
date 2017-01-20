package market.service.impl;

import market.Utilites.Transformer;
import market.dto.UserDTO;
import market.entity.User;
import market.service.api.CrudService;

import java.util.List;

import static market.dao.impl.UserDAO.getUserDAO;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class UserService implements CrudService<UserDTO> {


    @Override
    public UserDTO findById(int id) {
        UserDTO userDTO = Transformer.userToUserDTO(getUserDAO().findById(id));
        return userDTO;
    }

    @Override
    public List<UserDTO> findAll() {
        List<UserDTO> userDTOs = Transformer.listUserToListUserDto(getUserDAO().findAll());
        return userDTOs;
    }

    @Override
    public void create(UserDTO userDTO) {
        User user = Transformer.userDTOTouser(userDTO);
        getUserDAO().create(user);
    }

    @Override
    public void update(UserDTO userDTO) {
        getUserDAO().update(Transformer.userDTOTouser(userDTO));
    }

    @Override
    public void delete(UserDTO userDTO) {
        getUserDAO().delete(Transformer.userDTOTouser(userDTO));
    }

    public UserDTO findUserByLoginAndPassword(UserDTO userDTO){
        User user = Transformer.userDTOTouser(userDTO);
        User user1 = getUserDAO().findByLoginPassword(user.getLogin(), user.getPassword());
        userDTO = Transformer.userToUserDTO(user1);
        return userDTO;
    }
    public boolean checkLoginToEquals(String login) {
        boolean result = getUserDAO().checkLoginToEquals(login);
        return result;
    }
}
