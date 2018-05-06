package shuo.demo.services;

import com.aliyun.oss.OSSClient;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class OssService {
  private String readEndpoint = System.getProperty("aliyun.oss.endpoint.read");
  private String writeEndpoint = System.getProperty("aliyun.oss.endpoint.write", readEndpoint);

  private String bucket = System.getProperty("aliyun.oss.bucket");
  private String keyPrefix = System.getProperty("aliyun.oss.key-prefix", "");

  private String publicHost = "https://" + bucket + "." + readEndpoint + "/";

  private String accessKeyId = System.getProperty("aliyun.access.key.id");
  private String accessKeySecret = System.getProperty("aliyun.access.key.secret");

  private OSSClient ossClient = new OSSClient(writeEndpoint, accessKeyId, accessKeySecret);

  public void putObject(String name, InputStream input) {
    String key = keyPrefix + name;
    ossClient.putObject(bucket, key, input);
  }

  public String getOssPublicPath(String name) {
    return publicHost + keyPrefix + name;
  }
}
