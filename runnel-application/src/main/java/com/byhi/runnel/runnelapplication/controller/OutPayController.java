package com.byhi.runnel.runnelapplication.controller;

import com.byhi.runnel.runnelapplication.config.ConfigProperties;
import com.byhi.runnel.runnelapplication.service.OutPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RequestMapping("/outpay")
@RestController
public class OutPayController {

    @Autowired
    OutPayService outPayService;
    @Autowired
    ConfigProperties configProperties;

    @PostMapping("/upload") // //new annotation since 4.3
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {

        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            outPayService.outPayProcessing(file.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (configProperties.isMakeHistory()) {
            try {
                this.saveToHistory(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "redirect:/uploadStatus";
    }

    private void saveToHistory(MultipartFile file) throws IOException {
        File resource = new File(configProperties.getResourcDiv(),file.getOriginalFilename());
        Files.write(resource.toPath(),  file.getBytes());
    }

}
