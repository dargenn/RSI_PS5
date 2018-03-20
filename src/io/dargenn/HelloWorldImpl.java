package io.dargenn;


import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "io.dargenn.HelloWorld", portName = "HelloWorldPort", serviceName = "HelloWorldSuperService", targetNamespace = "cool.namespace")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorld(String name) {
        return "Hello world dlugi string!, to name: " + name;
    }

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("ksiazka", "fajna ksiazka", 50));
        products.add(new Product("komputer", "ale jednak laptop", 4000));
        products.add(new Product("telefon", "galaxy s9plus", 3999));
        return products;
    }
}
