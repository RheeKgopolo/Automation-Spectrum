package Modules;

/*
* ScenarioContext Class
*
* Pico-Container - Dependency Injection (DI) Containers
* create an instance of some shared state and have Cucumber pass this to each step definition class
* One of the supported DI containers is Pico-Container.
* hand it some classes and it will instantiate each one, correctly wired together via their constructors.
*  Cucumber scans your classes with step definitions in them, passes them to PicoContainer, then asks it to create new instances for every scenario.
*
*/

/*
* StepLibrary Class
* common steps that do not change as compare application specific i.e CalculatorStepDefinition
*/