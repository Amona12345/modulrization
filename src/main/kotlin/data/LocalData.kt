package data

import doamin.entity.ListMatches

abstract class LocalData {
    abstract fun getMatches(): ListMatches
}