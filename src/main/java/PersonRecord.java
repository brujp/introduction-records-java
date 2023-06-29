/*
A classe record já cria os Getters, construtor com argumentos, Equals, Hashcode, ToString...
Esse construtor criado pelo record se chama construtor canônico
Ele não cria os setters, pois os atributos são criados como final
Não podemos definir atributos não estáticos no record
 */
public record PersonRecord(String name, Integer age) {

    public static final String DEFAULT_MESSAGE = "Hello, World!";

    public void printName() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    //Para acessar o método estático, eu devo utilizar a classe
    public static void printMessage() {
        System.out.println(DEFAULT_MESSAGE);
    }

}
