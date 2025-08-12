package com.BedTimeStory.BedTimeStory.Service;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GcsAudioService {

    private final Storage storage = StorageOptions.getDefaultInstance().getService();
    private final String bucketName = "bed_time_story_audio";


    public String uploadAudio(byte[] audio, String fileExtension) throws Exception{
        System.out.println("Inside upload");
        System.out.println("GCP creds path: " + System.getenv("GOOGLE_APPLICATION_CREDENTIALS"));

        String fileName = "audio/" + UUID.randomUUID()+"."+fileExtension;

        BlobInfo blobInfo = BlobInfo.newBuilder(bucketName,fileName)
                .setContentType("audio/mpeg")
                .build();
        storage.create(blobInfo,audio);
        return String.format("https://storage.googleapis.com/%s/%s", bucketName, fileName);
    }
}
