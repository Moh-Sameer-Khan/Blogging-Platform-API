package com.geekster.BloggingPlatformAPI.service;

import com.geekster.BloggingPlatformAPI.model.Comment;
import com.geekster.BloggingPlatformAPI.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    ICommentRepo iCommentRepo;


    public String addComment(Comment comment) {
        comment.setCommentCreationTimeStamp(LocalDateTime.now());
        iCommentRepo.save(comment);
        return "Comment has been added!!!";
    }

    public Comment findComment(Integer commentId) {
        return iCommentRepo.findById(commentId).orElse(null);
    }

    public void removeComment(Comment comment) {
        iCommentRepo.delete(comment);
    }

    public List<Comment> getCommentsByPostId(Integer postId, Integer page, Integer pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Comment> comments = iCommentRepo.findByBlogPostPostId(postId, pageable);
        List<Comment> commentList = comments.getContent();

        return commentList;
    }

    public Comment findExistComment(Integer commentId) {
        return iCommentRepo.findById(commentId).orElse(null);
    }

    public void saveUpdatedComment(Comment existComment) {
        existComment.setCommentCreationTimeStamp(LocalDateTime.now());
        iCommentRepo.save(existComment);
    }
}
