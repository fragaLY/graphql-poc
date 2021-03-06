package com.graphql.poc.resolver;

import com.graphql.poc.dto.PostRecord;
import com.graphql.poc.model.Author;
import com.graphql.poc.model.Post;
import com.graphql.poc.service.PostService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {
    private final PostService service;

    public List<PostRecord> postsByAuthor(final Author author) {
        return service.byAuthor(author.getId());
    }
}
