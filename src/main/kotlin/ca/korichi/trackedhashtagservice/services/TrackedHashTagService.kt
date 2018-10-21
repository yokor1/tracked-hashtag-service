package ca.korichi.trackedhashtagservice.services

import ca.korichi.trackedhashtagservice.repositories.TrackedHashTag
import ca.korichi.trackedhashtagservice.repositories.TrackedHashTagRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class TrackedHashTagService(private val repository: TrackedHashTagRepository) {

    fun save(trackedHashTag: TrackedHashTag): Mono<TrackedHashTag>? {
        return this.repository.save(trackedHashTag)
    }

    fun findAll(): Flux<TrackedHashTag> {
        return this.repository.findAll()
    }
}