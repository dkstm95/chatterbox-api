package org.chatterbox.auth.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.chatterbox.common.BaseTimeEntity

@Entity
class User private constructor(
    @Id
    val id: Long?,

    var status: Status,
) : BaseTimeEntity() {

    enum class Status {
        ACTIVE,
    }

    companion object {
        fun create() = User(
            id = null,
            status = Status.ACTIVE
        )
    }

}
