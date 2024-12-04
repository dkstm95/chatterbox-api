package org.chatterbox.auth.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class User private constructor(
    @Id
    val id: Long?,

    var status: Status,
){

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
