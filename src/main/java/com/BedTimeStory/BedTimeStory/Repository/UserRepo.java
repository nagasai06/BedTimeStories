package com.BedTimeStory.BedTimeStory.Repository;

import com.BedTimeStory.BedTimeStory.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<UserModel, Integer> {
}
