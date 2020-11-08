package serenity.bdd.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import org.jbehave.core.model.ExamplesTable;
import serenity.bdd.steps.serenity.EndUserSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @When("user looks up the definition of the word $word")
    public void whenTheUserLooksUpDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Then("caption to the picture: $caption")
    public void thenCaptionToThePicture(ExamplesTable table) {
        List<String> captions = new ArrayList<>();
        for (Map<String,String> row : table.getRows()) {
            String caption = row.get("caption");
            captions.add(caption);
        }
        endUser.should_see_caption(captions);
    }

    @Then("they should see definition $definition")
    public void thenTheyShouldSeeDefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }
}
