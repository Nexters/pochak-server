package com.nexters.phochak.service;

import com.nexters.phochak.domain.Hashtag;
import com.nexters.phochak.domain.Post;

import java.util.List;

public interface HashtagService {
    List<Hashtag> createHashtagsByString(List<String> stringHashtagList, Post post);

}