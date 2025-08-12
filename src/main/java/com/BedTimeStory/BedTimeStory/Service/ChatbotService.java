package com.BedTimeStory.BedTimeStory.Service;

import com.BedTimeStory.BedTimeStory.Dto.ChatRequest;
import com.BedTimeStory.BedTimeStory.Model.Gender;
import com.BedTimeStory.BedTimeStory.Model.StoryModel;
import com.BedTimeStory.BedTimeStory.Model.Theme;
import com.BedTimeStory.BedTimeStory.Repository.StoryRepo;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    @Autowired
    StoryRepo sRepo;

    private final ChatClient chatClient;

    ChatbotService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }
    public String askChatGPT(ChatRequest chatRequest) {

        String customPrompt = String.format("""
            kid name is %s and gender is %s age is %s years. 
            Tell the kid a story related to the theme %s by involving the kid in the story and making the story revolving around the kid. the kid should feel inclusive. Remember to always have a positive atmosphere and impact on the kid. Tell the story like a actual human being.
            """, chatRequest.getName(),
                chatRequest.getGender(),
                chatRequest.getAge(),
                chatRequest.getTheme());

        String story =  chatClient
                .prompt()
                .system("You are a Bed Time Indian stories teller for kids.")
                .user(customPrompt)
                .call()
                .content();
        StoryModel sm = new StoryModel();
        sm.setStory(story);
        sm.setTheme(chatRequest.getTheme());
        sRepo.save(sm);
        return story;
    }
}
