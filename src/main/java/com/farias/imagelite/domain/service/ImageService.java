package com.farias.imagelite.domain.service;

import com.farias.imagelite.domain.entity.Image;
import com.farias.imagelite.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {

    Image save(Image image);

    Optional<Image> getById(String id);

    List<Image> search(ImageExtension extension, String query);
}