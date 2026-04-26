# ISTE.240-Project-Team-8

# Summary:

Electronic devices have reached the most remote places in this world. The need for the purchase of these devices has increased by a significant percentage. The implementation of online marketplaces for the purchase of these devices has also boomed significantly in the past few years. These businesses have not been able to satisfy all the needs of the consumers and the need has been increasing each day. We propose an online marketplace platform “shopKoKo.ae”. Our platform aims at allowing consumers to purchase electronic products from various sellers and resellers all across UAE. ShopKoko allows sellers and customers to connect with each other

## Contributors

- Muhammad Usman Habib - mh2923@rit.edu - 761005924 - @mh2923
- Yergeshbay Yerkebulan - yy1343@rit.edu - 759000935 - @yy1343
- Tanmay Patil - tnp1210@rit.edu - 405007913 - @tnp1210 / @AssaULT9090

## Work Distribution

### Tanmay @tnp1210 / @AssaULT9090

- Created the index.html page with all the basic setup and structure.
- Created the readme.md file.
- Created the order entity.
- Created the order controller.
- Created the order repository.
- Created the order service.
- Integrated the order jquery on the profile page for orders.
- Created the presentation
- Created the plan for this website.

### Usman @mh2923

- Created the manage-categories.html, manage-products.html and products.html page
- Created the product, category entity
- Created the product, category controller
- Created the product, category repository
- Created the product, category service
- Created jquery for all the pages.
- Created the report with @yy1343

### Yerkebulan @yy1343

- Created the customer and seller entity
- Created the profile.html and manage_sellers.html
- Created the customer and seller controller
- Created the customer and seller repository
- Created the customer and seller service
- Created jquery for all the pages.
- Created the report with @mh2923
- 

## Tech Stack

- **Backend:** SpringBoot along with Java.
- **Frontend:** HTML, Semantic UI, JQuery
- **Database:** MariaDB hosted locally on the computer. Backend uses Spring Data JPA / Hibernate for the communication with the database.

## Prerequisites

- Java 23+
- Maven
- MariaDB with username=root and password= password matching the credentials in application.properties file.

## Setup and initialization

1. Clone the repository
2. Open the project in an IDE such as intelliJ, Antigravity, VSCode or Eclipse.
3. Build the project using Maven (mvn clean install). This will do a clean installation of all dependencies needed to run the project.
4. Open application.properties file from src/main/resources and enter the password and username according to your MariaDB credentials.
5. Run the application as Spring Boot Application. In intelliJ, The run application button makes the application go live and the website can be accessed at localhost:8080/ on a web browser.

## Project Structure

```
shopKoko/
├── src/
│   ├── main/
│   │   ├── java/org/example/shopkoko/
│   │   │   ├── ShopKokoApplication.java
│   │   │   ├── controllers/ # Controllers to redirect data to the web pages
│   │   │   │   ├── PageController.java
│   │   │   │   ├── CategoryRestController.java # API for Category
│   │   │   │   ├── CustomerRestController.java # API for Customer
│   │   │   │   ├── OrderRestController.java # API for Order
│   │   │   │   ├── ProductRestController.java # API for Product
│   │   │   │   └── SellerRestController.java # API for Seller
│   │   │   ├── model/ #Contains the models for the project
│   │   │   │   ├── Category.java # Category Model
│   │   │   │   ├── Customer.java # Customer Model
│   │   │   │   ├── Order.java # Order Model
│   │   │   │   ├── Product.java # Product Model
│   │   │   │   └── Seller.java # Seller Model
│   │   │   ├── repositories/ # Contains the code for tables in database
│   │   │   │   ├── CategoryRepository.java # Entity for Category
│   │   │   │   ├── CustomerRepository.java # Entity for Customer
│   │   │   │   ├── OrderRepository.java # Entity for Order
│   │   │   │   ├── ProductRepository.java # Entity for Product
│   │   │   │   └── SellerRepository.java # Entity for Seller
│   │   │   └── services/ #contains the service layer for the project
│   │   │       ├── CategoryService.java # Service for Category
│   │   │       ├── CustomerService.java # Service for Customer
│   │   │       ├── OrderService.java # Service for Order
│   │   │       ├── ProductService.java # Service for Product
│   │   │       └── SellerService.java # Service for Seller
│   │   └── resources/ # contains the webpages and configuration file
│   │       ├── application.properties # Configuration file
│   │       └── static/
│   │           ├── css/ # contains the css files for the html pages
│   │           │   ├── index.css # Landing page styling
│   │           │   ├── manage_categories.css # Styling for category management page
│   │           │   ├── manage_products.css # Styling for product management page
│   │           │   ├── manage_sellers.css # Styling for seller management page
│   │           │   ├── product.css # Styling for single product detail page
│   │           │   ├── products.css # Styling for all products page
│   │           │   └── profile.css # Styling for customer/seller profile page
│   │           └── html/ # Contains all the html pages
│   │               ├── index.html # Landing page for customers
│   │               ├── manage_categories.html # For admins to manage categories
│   │               ├── manage_products.html # For admins to manage products
│   │               ├── manage_sellers.html # For admins to manage sellers
│   │               ├── product.html # Single product detail page
│   │               ├── products.html # All products with filters
│   │               └── profile.html # Customer/Seller profile page
│   └── test/
│       └── java/org/example/shopkoko/
│           └── ShopKokoApplicationTests.java
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md # This File
```

## Models

| Entity     | Description                                                                    |
| ---------- | ------------------------------------------------------------------------------ |
| `Category` | Defines a product into a category with an option of sub category as well.      |
| `Product`  | Contains all the attributes and details of a product.                          |
| `Seller`   | Contains all the attributes of a seller such as address and much more.         |
| `Customer` | Contains all the attributes of a customer such as address, Name and much more. |
| `Order`    | Links a customer to a product with a status and date.                          |

## REST API

| Endpoint          | Methods                | Description       |
| ----------------- | ---------------------- | ----------------- |
| `/api/products`   | GET, POST, PUT, DELETE | Manage products   |
| `/api/categories` | GET, POST, PUT, DELETE | Manage categories |
| `/api/sellers`    | GET, POST, PUT, DELETE | Manage sellers    |
| `/api/customers`  | GET, POST, PUT, DELETE | Manage customers  |
| `/api/orders`     | GET, POST, PUT, DELETE | Manage orders     |

## Pages

| URL                  | Description                                    |
| -------------------- | ---------------------------------------------- |
| `/`                  | Home — featured products, laptops, smartphones |
| `/products`          | All products with filters                      |
| `/product?id=`       | Single product detail                          |
| `/manage-products`   | Admin: add/edit/delete products                |
| `/manage-categories` | Admin: add/edit/delete categories              |
| `/manage-sellers`    | Admin: add/edit/delete sellers                 |
| `/profile`           | Customer profile with order history            |

## Extra Notes
- We wanted to do a shopping cart page as well but it needs a bit of extras which is not taught in the course yet. Thus we desisted from doing it. This was the use of another additional layer which would allow the users to guide to their own respective profile page.
- We wanted to do a user login as well but it needs a bit of extras which is not taught in the course yet. Thus we desisted from doing it. This was the use of another additional layer which would allow the users to login and get redirected to their own respective profile page. This included hashing of passwords, localstorage for login sessions, JWT and a lot more

## Merges

All the merges were done by @AssaULT9090 which is a bug on the github desktop. It is not able to rename my new account. The readme file is also created by me after conducting discussion with my teammates. @mh2923 and @yy1343 have contributed to the project and this file contains all the information after verifying the commits from their git branches. The webpages were designed together on calls with each other.