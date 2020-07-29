package com.github.fabriciolfj.aws.controller;

import com.amazonaws.services.s3.AmazonS3;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/aws/s3")
public class AwsController {

    private final AmazonS3 amazonS3;

    @PostMapping("/note")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void note(@RequestParam String name, @RequestParam String content) {
        amazonS3.createBucket("fabriciospring");
        amazonS3.putObject("fabriciospring", name + ".txt", content);
    }

}
