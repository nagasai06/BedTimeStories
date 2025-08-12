package com.BedTimeStory.BedTimeStory.Controller;

import com.BedTimeStory.BedTimeStory.Dto.ChatRequest;
import com.BedTimeStory.BedTimeStory.Service.ChatbotService;
import com.BedTimeStory.BedTimeStory.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoryController {
    @Autowired
    private UserService userService;
    private final ChatbotService cbService;
    public StoryController(ChatbotService cbService){
        this.cbService=cbService;

    }

    @PostMapping("/getStory")
    public byte[] getStory(@RequestBody ChatRequest chatRequest){
        return cbService.askChatGPT(chatRequest);
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody ChatRequest chatRequest){
        userService.saveUser(chatRequest);
    }


}
