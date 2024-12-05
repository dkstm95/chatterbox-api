package org.chatterbox.auth.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import org.chatterbox.common.BaseTimeEntity

@Entity
class User private constructor(
    @Id
    val id: Long?,

    nickname: String,

    status: Status,
) : BaseTimeEntity() {

    fun changeNickname(newNickname: String) {
        require(newNickname.isNotBlank()) { "Nickname must not be blank" }
        nickname = newNickname
    }

    @Column(nullable = false)
    var nickname = nickname
        protected set

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var status = status
        protected set

    enum class Status {
        ACTIVE,
    }

    companion object {
        fun create(nickname: String) = User(
            id = null,
            nickname = nickname,
            status = Status.ACTIVE
        )
    }

}
