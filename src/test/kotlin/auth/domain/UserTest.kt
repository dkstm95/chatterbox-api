package auth.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.chatterbox.auth.domain.User

class UserTest : FunSpec({

    test("create") {
        val user = createUser()

        user.id shouldBe null
        user.status shouldBe User.Status.ACTIVE
    }

})

private fun createUser() = User.create()