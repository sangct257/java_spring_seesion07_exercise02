package ra.demo.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.demo.model.dto.request.CandidateCreateDTO;
import ra.demo.model.dto.response.ApiResponse;
import ra.demo.model.entity.Candidate;
import ra.demo.service.CandidateService;

@RestController
@RequestMapping("/api/v1/candidates")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @PostMapping
    public ResponseEntity<ApiResponse<Candidate>> save(@Valid @RequestBody CandidateCreateDTO candidateCreateDTO) {
        return new ResponseEntity<>(new ApiResponse<>(
                true,
                "Them thanh cong",
                candidateService.save(candidateCreateDTO),
                null,
                HttpStatus.OK
        ), HttpStatus.OK);
    }
}
