package com.app.blogging.services;

import com.app.blogging.payloads.CommentDto;

public interface CommentService {
    public CommentDto createComment(CommentDto commentDto, Integer postId);
    public void deleteComment(Integer commentId);
}
