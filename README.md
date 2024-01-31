# Spring Boot - GraphQL - API

A Spring Boot GraphQL API for products and categories manager.
* O [Mermaid](https://mermaid.live/edit#pako:eNpVkE1uwjAQha9izapIZFGWWVSCBFZUVCq7mMXInjSW_Fdji6Ikp2HRg3CxmmRDZzV633uj0etBOElQQqvdRXQYIjvW3LI862bttRJ4_73fHHs9saJ4GwJ9JzrHgW1enulqMWc2DxOr-u0PGa_dOKvVFD1YGljd7NFH50_P5HhxA9s26qNzlv6TLlBO7ZoWyxYLgYFVGCYLLMFQMKhk_r5_KBxiR4Y4lHmV1GLSkQO3Y7Ziiu7zagWUMSRaQvISI9UKvwIayLf1OaskVXThfW5kKmb8AyAeX3o) é uma opção bem legal para diagramas e você consegue utilizar diretamente no README.md:

![spring-boot-graphql-banner](https://miro.medium.com/v2/resize:fit:1015/1*pwa-8fyNPKE5TonPyfT2XA.png)


* [Java](https://www.java.com/en/)
* [Spring](https://docs.spring.io/spring-framework/reference/index.html)
* [h2-database](https://www.h2database.com/html/main.html)
* [GraphQL](https://graphql.org/)
* [Spring-graphQL](https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/)

## Dependencies and Technologies Used

* Java - Version: 17
* Spring Boot - Version: 3.2.2

### Getting started

```
./mvnw clean package
```

After that:

```
java -jar target/spring-with-graphql-0.0.1-SNAPSHOT.jar
```

> After that you can access the application at http://localhost:8080/graphiql and it'll show you the GraphiQL interface.

## Schemas

```graphql
 mutation {
    addCategory(category: {name: "Star Wars"}) {
        name
        id
    }
}


query {
    categoryById(id: "c40f9427-87fe-452b-9038-e2e33d82b701") {
        name
        id
    }
}

mutation {
    addProduct(productInput:{name: "anakin figure action",
        price: 100,
        categoryId: "7f1e22ec-c621-4ecc-a9c9-8808383d98b5"
    }) {
        id
    }
}

query {
    getAllProducts{
        id,
        category {
            id,
            name
        }
    }
}
```