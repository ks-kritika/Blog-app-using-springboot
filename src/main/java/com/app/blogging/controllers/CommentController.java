package com.app.blogging.controllers;

import com.app.blogging.entities.Comment;
import com.app.blogging.payloads.CommentDto;
import com.app.blogging.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comment")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId){
            CommentDto createComment = this.commentService.createComment(commentDto,postId);
            return new ResponseEntity<>(createComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/comment/{commentId}")
    public ResponseEntity<?> deletePost(@PathVariable Integer commentId){
        this.commentService.deleteComment(commentId);
        return new ResponseEntity(Map.of("message","comment deleted successfully"),HttpStatus.OK);
    }
}
