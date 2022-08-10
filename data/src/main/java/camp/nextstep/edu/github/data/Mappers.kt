package camp.nextstep.edu.github.data

import camp.nextstep.edu.github.data.model.GitHubRepositoryEntity
import camp.nextstep.edu.github.domain.GitHubRepo
import camp.nextstep.edu.github.domain.GitHubRepos


internal fun List<GitHubRepositoryEntity>.toDomain() : GitHubRepos = GitHubRepos(
    map {
        it.toDomain()
    }
)

internal fun GitHubRepositoryEntity.toDomain() : GitHubRepo =
    GitHubRepo(
        id = this.id,
        fullName = this.fullName,
        description = this.description
    )
