package auth.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.chatterbox.auth.domain.User

class UserTest : FunSpec({

    fun createUser(nickname: String) = User.create(nickname)

    test("create") {
        val nickname = "nickname"
        val user = createUser(nickname)

        user.id shouldBe null
        user.nickname shouldBe nickname
        user.status shouldBe User.Status.ACTIVE
    }

    test("can change nickname") {
        val user = createUser("nickname")
        val newNickname = "newNickname"

        user.changeNickname(newNickname)

        user.nickname shouldBe newNickname
    }

    test("cannot change nickname to blank") {
        val user = createUser("nickname")
        val newNickname = ""

        shouldThrow<IllegalArgumentException> {
            user.changeNickname(newNickname)
        }
        user.nickname shouldBe "nickname"
    }

})
