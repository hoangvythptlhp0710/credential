package com.createService.infrastructure.practiceProblem.controllers;

import com.createService.domain.coderAuth.AuthorizeService;
import com.createService.domain.common.models.Id;
import com.createService.domain.practiceProblem.models.Difficulty;
import com.createService.domain.practiceProblem.models.Progress;
import com.createService.domain.problem.model.MemoryLimit;
import com.createService.domain.problem.model.ProgrammingLanguage;
import com.createService.domain.problem.model.TimeLimit;
import com.createService.domain.problem.service.CreateProblemService;
import com.createService.infrastructure.share.controllers.ControllerHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

public class CreateProblemController {

    @Autowired
    private AuthorizeService authorizeService;
    @Autowired
    private CreateProblemService createPracticeProblemService;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class InputCreateProblem {
        public Difficulty difficulty;
        public String name;
        public String description;
        public List<MemoryLimit.CreateInputML> memoryLimits;
        public List<TimeLimit.CreateInputTL> timeLimits;
        public List<ProgrammingLanguage> allowedProgrammingLanguage;

    }

    @Operation(
            summary = "Create the practice problem",
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "Entity successfully created.",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(example = "123123123a213123")
                            )
                    }
            ), @ApiResponse(
                    responseCode = "401",
                    description = "Unauthorized",
                    content = {@Content()}
            ), @ApiResponse(
                    responseCode = "400",
                    description = "invalid request",
                    content = {@Content()}
            )}
    )

    public ResponseEntity<?> create(@RequestBody InputCreateProblem input, @RequestHeader("access-token") String token) {
        return ControllerHandler.handle(() -> {
            Id coderId =authorizeService.authorize(token);
            Id problemId  = createPracticeProblemService.create(new com.createService.domain.practiceProblem.service.problem.CreateProblemService.Input(
                    input.difficulty,
                    input.name,
                    input.description,
                    input.memoryLimits,
                    input.timeLimits,
                    input.allowedProgrammingLanguage,
                    coderId
            ));
            return new ControllerHandler.Result("Success", problemId);
        });
    }


}
