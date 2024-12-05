package org.chatterbox.topic.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.chatterbox.common.BaseTimeEntity

@Entity
class Topic private constructor(
    @Id
    val id: Long?,

    @Column(nullable = false)
    val userId: Long,

    content: String,
) : BaseTimeEntity() {

    @Column(nullable = false)
    var content: String = content
        protected set

    companion object {
        fun create(userId: Long, content: String): Topic {
            return Topic(
                id = null,
                userId = userId,
                content = content,
            )
        }
    }

}
