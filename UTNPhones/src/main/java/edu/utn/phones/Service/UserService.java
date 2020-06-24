package edu.utn.phones.Service;

import edu.utn.phones.Model.User;
import edu.utn.phones.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, IUserRepository> {

    //region Contructor
    @Autowired
    public UserService(IUserRepository userRepository) {
        super(userRepository);
    }

    public User login(String username, String password) {
        User u = this.repository.findByUsernameAndPassword(username, password);
        System.out.println(u);
        return u;
    }
    //endregion





}
