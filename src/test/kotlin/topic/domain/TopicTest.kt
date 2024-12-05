package topic.domain

import io.kotest.core.spec.style.FunSpec
import org.chatterbox.topic.domain.Topic

class TopicTest : FunSpec({

    test("can create a topic") {
        Topic()
    }

})