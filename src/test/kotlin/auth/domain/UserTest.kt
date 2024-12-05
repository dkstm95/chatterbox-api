package auth.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.chatterbox.auth.domain.User

class UserTest : FunSpec({

    test("create") {
        val nickname = "nickname"
        val user = User.create(nickname)

        user.id shouldBe null
        user.nickname shouldBe nickname
        user.status shouldBe User.Status.ACTIVE
    }

})
