package com.app.blogging.services;

import com.app.blogging.entities.Post;
import com.app.blogging.payloads.PostDto;
import com.app.blogging.payloads.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
    PostDto updatePost(PostDto postDto, Integer postId);
    PostDto getPostById(Integer postId);
    PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy);
    List<PostDto> getPostByCategory(Integer categoryId);
    List<PostDto> getPostByUser(Integer userId);
    List<PostDto> searchByTitle(String keyword);
    List<PostDto> searchByContent(String keyword);
    void deletePost(Integer postId);
}
