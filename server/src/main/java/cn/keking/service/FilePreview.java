package cn.keking.service;

import cn.keking.model.FileAttribute;
import org.springframework.ui.Model;

/**
 * Created by kl on 2018/1/17.
 * Content :
 */
public interface FilePreview {

    String PDF_FILE_PREVIEW_PAGE = "pdf";
    String TIFF_FILE_PREVIEW_PAGE = "tiff";
    String OFFICE_PICTURE_FILE_PREVIEW_PAGE = "officePicture";
    String EXEL_FILE_PREVIEW_PAGE = "html";
    String MARKDOWN_FILE_PREVIEW_PAGE = "markdown";
    String NOT_SUPPORTED_FILE_PAGE = "fileNotSupported";

    String filePreviewHandle(String url, Model model, FileAttribute fileAttribute);
}
