package com.example.leetcode_clone.problems.dto;

import java.util.Date;
import java.util.List;

import com.example.leetcode_clone.languages.LanguageEntity;
import com.example.leetcode_clone.problems.Difficulty;
import com.example.leetcode_clone.problems.SolutionCheckStrategy;
import com.example.leetcode_clone.problems.TestStrategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProblemDetailDTO {
    private Date createdAt;
    private String slug;
    private String title;
    private String description;
    private Difficulty difficulty;
    private Double acceptance;
    private TestStrategy testStrategy;
    private SolutionCheckStrategy solutionCheckStrategy;

    private List<LanguageEntity> languageAvailable;
    private LanguageEntity defaultLanguage;
    private String resourceURL;
}
