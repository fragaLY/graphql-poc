package com.graphql.poc.dto;

import java.time.ZonedDateTime;

public record PostRecord(Long id,
                         String title,
                         String description,
                         String tags,
                         AuthorRecord author,
                         ZonedDateTime created) {}
