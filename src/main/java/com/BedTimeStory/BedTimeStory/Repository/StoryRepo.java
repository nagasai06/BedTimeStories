package com.BedTimeStory.BedTimeStory.Repository;

import com.BedTimeStory.BedTimeStory.Model.StoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepo extends MongoRepository<StoryModel,Integer> {

}
