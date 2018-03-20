package io.dargenn;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface HelloWorld {
    @WebMethod
    String getHelloWorld(String name);

    @WebMethod(action = "productsGett", operationName = "superProductsGet")
    List<Product> getProducts();
}
