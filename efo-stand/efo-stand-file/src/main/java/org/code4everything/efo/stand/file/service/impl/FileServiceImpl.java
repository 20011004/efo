package org.code4everything.efo.stand.file.service.impl;

import org.code4everything.boot.bean.MultipartFileBean;
import org.code4everything.efo.stand.dao.domain.FileDO;
import org.code4everything.efo.stand.file.service.FileService;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;

/**
 * @author pantao
 * @since 2019-04-17
 */
@Service
public class FileServiceImpl implements FileService {

    @Override
    public FileDO getBy(MultipartFileBean fileBean) {
        return null;
    }

    @Override
    public FileDO save(MultipartFileBean fileBean, @Nullable FileDO file) {
        return null;
    }

    @Override
    public String getLocalPathByAccessUrl(String accessUrl) {
        return null;
    }
}
