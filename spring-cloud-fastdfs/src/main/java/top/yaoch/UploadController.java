package top.yaoch;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

    @Autowired
    private FastDFSClientUtil dfsClient;

    @Value("${fdfs.groupName}")
    private String groupName;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/upload")
    public String fdfsUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) {

        try {
            String fileUrl = dfsClient.uploadFile(file);
            request.setAttribute("msg", "成功上传文件，  '" + fileUrl + "'");
            System.out.println(fileUrl);
            response.sendRedirect(fileUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/uploadImg")
    public String fdfsUploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) {

        try {
            String fileUrl = dfsClient.uploadImg(file);
            request.setAttribute("msg", "成功上传文件，  '" + fileUrl + "'");
            System.out.println(fileUrl);
            response.sendRedirect(fileUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /*
     * http://localhost/download?filePath=group1/M00/00/00/wKgIZVzZEF2ATP08ABC9j8AnNSs744.jpg
     */
    @RequestMapping("/download")
    public void download(String filePath, HttpServletRequest request, HttpServletResponse response) throws IOException {

        // group1/M00/00/00/wKgIZVzZEF2ATP08ABC9j8AnNSs744.jpg
        String[] paths = filePath.split("/");
        String path = filePath.substring(filePath.indexOf(groupName) + groupName.length() + 1, filePath.length());
        InputStream input = dfsClient.download(groupName, path);

        //根据文件名获取 MIME 类型
        String fileName = paths[paths.length - 1];
        System.out.println("fileName :" + fileName); // wKgIZVzZEF2ATP08ABC9j8AnNSs744.jpg
        String contentType = request.getServletContext().getMimeType(fileName);
        String contentDisposition = "attachment;filename=" + fileName;

        // 设置头
        response.setHeader("Content-Type", contentType);
        response.setHeader("Content-Disposition", contentDisposition);

        // 获取绑定了客户端的流
        ServletOutputStream output = response.getOutputStream();

        // 把输入流中的数据写入到输出流中
        IOUtils.copy(input, output);
        input.close();

    }

    /**
     * http://localhost/deleteFile?filePath=group1/M00/00/00/wKgIZVzZaRiAZemtAARpYjHP9j4930.jpg
     * @param filePath group1/M00/00/00/wKgIZVzZaRiAZemtAARpYjHP9j4930.jpg
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/deleteFile")
    public String delFile(String filePath, HttpServletRequest request, HttpServletResponse response) {

        try {
            dfsClient.delFile(filePath);
        } catch (Exception e) {
            // 文件不存在报异常 ： com.github.tobato.fastdfs.exception.FdfsServerException: 错误码：2，错误信息：找不到节点或文件
            // e.printStackTrace();
        }
        request.setAttribute("msg", "成功删除，'" + filePath);
        return "index";
    }


}
