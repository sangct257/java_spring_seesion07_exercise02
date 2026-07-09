package ra.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.demo.model.dto.request.CandidateCreateDTO;
import ra.demo.model.entity.Candidate;
import ra.demo.repository.CandidateRepository;
import ra.demo.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Candidate save(CandidateCreateDTO candidateCreateDTO) {
        Candidate candidate = Candidate.builder()
                .fullName(candidateCreateDTO.getFullName())
                .email(candidateCreateDTO.getEmail())
                .age(candidateCreateDTO.getAge())
                .yearsOfExperience(candidateCreateDTO.getYearsOfExperience())
                .build();
        return  candidateRepository.save(candidate);
    }
}
