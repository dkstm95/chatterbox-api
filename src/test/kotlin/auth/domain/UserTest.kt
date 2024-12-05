package auth.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.chatterbox.auth.domain.User

class UserTest : FunSpec({

    fun createUser(nickname: String) = User.create(nickname)

    test("create") {
        val user = createUser("nickname")

        user.id shouldBe null
        user.nickname shouldBe "nickname"
        user.status shouldBe User.Status.ACTIVE
    }

    context("change nickname") {
        test("to new nickname") {
            val user = createUser("nickname")

            user.changeNickname("newNickname")

            user.nickname shouldBe "newNickname"
        }

        test("to blank") {
            val user = createUser("nickname")

            shouldThrow<IllegalArgumentException> {
                user.changeNickname("")
            }
            user.nickname shouldBe "nickname"
        }
    }

})
