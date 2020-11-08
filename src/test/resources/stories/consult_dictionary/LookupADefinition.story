Lookup a definition
Narrative:
In order to talk better
As an English student
I want to look up word definitions

Scenario: Looking up the definition of 'apple'
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'apple'
Then they should see the definition 'A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.'
And caption to the picture:
|caption    |
|A red apple|

Scenario: Looking up the definition of 'pear'
Meta:
@skip
@ignored true
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'pear'
Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'

Scenario: Looking up the definition of word
Given the user is on the Wikionary home page
When user looks up the definition of the word <word>
Then they should see definition <definition>

Examples:
|word      |definition                                                                                                                                |
|watermelon|A plant of the species Citrullus lanatus, bearing a melon-like fruit.                                                                     |
|pineapple |A tropical plant, Ananas comosus, native to South America, having thirty or more long, spined and pointed leaves surrounding a thick stem.|
