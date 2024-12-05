package topic.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.chatterbox.topic.domain.Topic

class TopicTest : FunSpec({

    test("create") {
        val userId = 1L
        val content = "content"
        val topic = Topic.create(userId, content)

        topic.id shouldBe null
        topic.userId shouldBe userId
        topic.content shouldBe content
    }

})