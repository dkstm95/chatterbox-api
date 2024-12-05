package topic.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.chatterbox.topic.domain.Topic

class TopicTest : FunSpec({

    fun createTopic(content: String) = Topic.create(
        userId = 1,
        content = content,
    )

    test("create") {
        val topic = createTopic("content")

        topic.id shouldBe null
        topic.userId shouldBe 1
        topic.content shouldBe "content"
    }

    context("update content") {
        test("to new content") {
            val topic = createTopic("content")

            topic.updateContent("new content")

            topic.content shouldBe "new content"
        }

        test("to blank") {
            val topic = createTopic("content")

            shouldThrow<IllegalArgumentException> {
                topic.updateContent("")
            }
        }
    }

})