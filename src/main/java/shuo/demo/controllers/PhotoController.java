package shuo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import shuo.demo.services.OssService;
import shuo.demo.services.PhotoDbService;
import shuo.photos.orm.tables.records.PhotosRecord;

import java.util.List;
import java.util.UUID;

@Controller
public class PhotoController {
  @Autowired
  PhotoDbService dbService;

  @Autowired
  OssService ossService;

  @GetMapping("/")
  public String redirect() {
    return "redirect:/upload";
  }

  @GetMapping("/upload")
  public String uploadPhoto() {
    return "upload";
  }

  @PostMapping("/photos")
  public ResponseEntity savePhoto(@RequestParam("file") MultipartFile file) {
    try {
      String id = UUID.randomUUID().toString();
      System.out.println("Saving file: " + file.getOriginalFilename() + " - " + id);
      ossService.putObject(id, file.getInputStream());
      String ossPath = ossService.getOssPublicPath(id);
      dbService.savePhoto(id, ossPath, file.getOriginalFilename());
    } catch (Throwable e) {
      e.printStackTrace();
      return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity(HttpStatus.OK);
  }

  @GetMapping("/gallery")
  public String getPhotos(Model model) {
    List<PhotosRecord> photos = dbService.fetchPhotos();
    model.addAttribute("photos", photos);
    return "gallery";
  }
}
