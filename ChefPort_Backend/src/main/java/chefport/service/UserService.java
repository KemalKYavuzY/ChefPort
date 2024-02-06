package chefport.service;

import org.springframework.stereotype.Service;
import chefport.model.User;
import chefport.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repo; // Creates an instance of the UserRepository class

    public UserService(UserRepository repo){
        this.repo = repo; // Creates a UserRepository from our repo object
    }

    public String createUser(User user) {

        if (!checkDuplicateUser(user)){
            User currentUser = repo.save(user);
            if (user.getUsername().equals(currentUser.getUsername())
                    && (user.getPassword().equals(currentUser.getPassword()))){
                return "Success";
            }
        }

        return "Failed";
    }

    private boolean checkDuplicateUser(User user) {
        User currentUser = repo.findByUsername(user.getUsername());
        if (currentUser != null) {
            return user.getUsername().equals(currentUser.getUsername());
        }

        return false;
    }

    public String checkPassword(User user) {
        User currentUser = repo.findByUsername(user.getUsername());

        if (user.getPassword().equals(currentUser.getPassword()) &&
            user.getUsername().equals(currentUser.getUsername())){
          return "Success";
        }
        else {
            return "Fail";
        }
    }
}
