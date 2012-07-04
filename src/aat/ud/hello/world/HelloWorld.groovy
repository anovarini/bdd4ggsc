package hello.world

import org.junit.runner.RunWith
import org.concordion.integration.junit4.ConcordionRunner

@RunWith(ConcordionRunner)
class HelloWorld {

    def getGreeting() {
        'Hello World!'
    }

    def greetingFor(def firstName) {
        "Hello $firstName!"
    }

}
