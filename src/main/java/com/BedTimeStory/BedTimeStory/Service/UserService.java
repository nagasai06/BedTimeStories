package com.BedTimeStory.BedTimeStory.Service;

import com.BedTimeStory.BedTimeStory.Dto.ChatRequest;
import com.BedTimeStory.BedTimeStory.Model.UserModel;
import com.BedTimeStory.BedTimeStory.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void saveUser(ChatRequest chatRequest){
        UserModel userModel = new UserModel();
        userModel.setName(chatRequest.getName());
        userModel.setAge(chatRequest.getAge());
        userModel.setGender(chatRequest.getGender());

        userRepo.save(userModel);
    }


}
