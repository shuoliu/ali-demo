package shuo.demo.services;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shuo.photos.orm.tables.Photos;
import shuo.photos.orm.tables.records.PhotosRecord;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PhotoDbService {
  @Autowired
  private DSLContext dsl;

  public void savePhoto(String id, String ossPath, String name) {
    PhotosRecord record = new PhotosRecord();
    record.setUploadedTime(LocalDateTime.now());
    record.setId(id);
    record.setOssPath(ossPath);
    record.setName(name);
    dsl.attach(record);
    record.store();
  }

  public List<PhotosRecord> fetchPhotos() {
    return dsl.fetch(Photos.PHOTOS);
  }
}
