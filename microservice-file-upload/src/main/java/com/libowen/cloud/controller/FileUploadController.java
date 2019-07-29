package com.libowen.cloud.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * @author Bowen.Li@onerway.com
 * @date 2019/7/29
 * 说明：
 */
@RestController
public class FileUploadController {

    @PostMapping("upload")
    public String fileUpload(@RequestParam MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();

            File fileToSave = new File(Objects.requireNonNull(file.getOriginalFilename()));

            FileCopyUtils.copy(bytes, fileToSave);

            return fileToSave.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "1111";
    }
}
