import org.junit.runner.RunWith
import spock.lang.Specification
import org.spockframework.runtime.Sputnik

@RunWith(Sputnik.class)
class TemplateSpecification extends Specification {

    def "pushing element on the stack"() {

        setup:
        def stack = new Stack()
        def elem = "push me"

        when:
        stack.push(elem)

        then:
        !stack.empty
        stack.size() == 1
        stack.peek() == elem

    }

}
