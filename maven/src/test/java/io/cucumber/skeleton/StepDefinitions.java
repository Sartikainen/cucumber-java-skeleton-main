package io.cucumber.skeleton;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class StepDefinitions {
    @Given("пользователь успешно создан")
    public void пользовательУспешноСоздан() {
        System.out.println("Пользователь успешно создан");
    }

    @When("пользователь заходит на страницу {string}")
    public void пользовательЗаходитНаСтраницу(String page) {
        System.out.println("Пользователь заходит на страницу " + page);
    }

    @And("пользователь вводит валидные логин и пароль")
    public void пользовательВводитВалидныеЛогинИПароль() {
        System.out.println("Пользователь вводит логин и пароль");
    }

    @And("пользователь нажал на кнопку {string}")
    public void пользовательНажалНаКнопку(String arg0) {
        System.out.println("Пользователь нажимает кнопку " + arg0);
    }

    @Then("пользователь успешно авторизован")
    public void пользовательУспешноАвторизован() {
        System.out.println("Пользователь авторизован");
    }

    @And("пользователь на {string}")
    public void пользовательНа(String arg0) {
        System.out.println("Пользователь на " + arg0);
    }

    @And("отображается {int} товар(а) категории/категорий {string}")
    @And("^отображается ((?:-?\\d+)|(?:\\d+)) товар(?:a)? (?:категории|категорий) \"([^\"]*)\"$")
    public void отображаетсяТовараКатегории(int number, String categories) {
        System.out.println("Всего товаров " + number + "в категории " + categories);
    }

    @And("пользователь вводит валидный логин")
    public void пользовательВводитВалидныйЛогин() {
        System.out.println("Пользователь вводин логин");
    }

    @And("пользователь вводит неправильный пароль")
    public void пользовательВводитНеправильныйПароль() {
        System.out.println("Пользователь вводит неправильный пароль");
    }

    @Then("отображается ошибка {string}")
    public void отображаетсяОшибка(String arg0) {
        System.out.println("Отображается ошибка " + arg0);
    }

    @Then("отображаются следующие кагетории товаров:")
    public void отображаютсяСледующиеКагеторииТоваров(List<String> types) {
        int s = types.size();
        System.out.println("Категории товаров: " + s);
    }

    @Then("отображаются следующие товары:")
    public void отображаютсяСледующиеТовары(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : data) {
            String name = row.get("name");
            String price = row.get("price");
            String discount = row.get("discount");
            System.out.printf("%s %s %s", name, price, discount);
            System.out.println();
        }
    }

    @And("отображается сообщение:")
    public void отображаетсяСообщение(String text) {
        System.out.println(text);
    }

    @And("пользователь вводит логин {string}")
    public void пользовательВводитЛогин(String arg0) {
        System.out.println("Пользователь вводит логин " + arg0);
    }

}
