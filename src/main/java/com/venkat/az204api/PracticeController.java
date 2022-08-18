package com.venkat.az204api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/practice/")
public class PracticeController {

    private static Logger logger = LoggerFactory.getLogger(PracticeController.class);


    @Autowired
    public PracticeController() {

    }


    @Operation(summary = "Demo PPrint what is sent", description = "Demo PPrint what is sent")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Successful")})
    @GetMapping(value = "/v0/hello", headers = "Accept=application/json", produces = MediaType.ALL_VALUE, consumes = MediaType.ALL_VALUE)
    @ResponseBody
    public String hello(@RequestParam String description) {

        return "From API " + description;
    }


}