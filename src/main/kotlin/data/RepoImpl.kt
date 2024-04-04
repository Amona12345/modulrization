package data

import doamin.entity.ListMatches
import doamin.repo.MatchesRepo

class RepoImpl( val localData:LocalData):MatchesRepo {
    override fun getMatchesRepoo()=localData.getMatches()
}