package ai.ecma.codingbat.controller.implementation;

import lombok.RequiredArgsConstructor;
import ai.ecma.codingbat.controller.cotract.UserProblemController;
import ai.ecma.codingbat.payload.ApiResult;
import ai.ecma.codingbat.payload.CompileDTO;
import ai.ecma.codingbat.payload.UserProblemDTO;
import ai.ecma.codingbat.service.UserProblemService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserProblemControllerImpl implements UserProblemController {

    private final UserProblemService userProblemService;

    @Override
    public ApiResult<UserProblemDTO> getUserProblem(Integer userId, Integer problemId) {
        return userProblemService.get(userId, problemId);
    }

    @Override
    public ApiResult<CompileDTO> solveProblem(Integer problemId, UserProblemDTO userProblemDTO) {
        return userProblemService.solveProblemByUser(problemId, userProblemDTO);
    }

    @Override
    public ApiResult<List<UserProblemDTO>> getUserProblems() {
        return userProblemService.getAllProblems();
    }

}
