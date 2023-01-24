package io.cucumber.skeleton

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class StepDefinitions {
    @Given("the child has {int} cucumbers in its belly")
    fun I_have_cukes_in_my_belly(cukes: Int) {
        val belly = Belly()

        belly.eat(cukes)
    }

    @When("the child waits {int} hour(s)")
    fun childWaitsAnHour(hours: Int) {

    }

    @Then("the child's belly should growl")
    fun childsBellyGrowls() {

    }
}
