package doamin.useCase

import doamin.repo.MatchesRepo

class MatchesUseCase(val repo:MatchesRepo) {
    fun getMatchesUseCase()=repo.getMatchesRepoo()
}