package ra.demo.service;

import ra.demo.model.dto.request.CandidateCreateDTO;
import ra.demo.model.entity.Candidate;

public interface CandidateService {
    Candidate save(CandidateCreateDTO candidateCreateDTO);
}
