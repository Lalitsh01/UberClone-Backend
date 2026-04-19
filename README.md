# UberAppClone — Backend (Spring Boot)

A production-style backend for a ride-booking application (similar to Uber / OLA) implemented with Spring Boot. This project models riders, drivers, rides, payments (wallet/cash), driver matching, fare calculation (distance + surge), and ratings.

**Highlights**
- RESTful API backend built with Spring Boot and Spring Data JPA.
- PostgreSQL as the primary datastore with schema and seed data in `data.sql`.
- JWT-based authentication and request filtering.
- Features: ride request & matching, dynamic fare calculation, wallet transactions, driver/rider ratings, and admin/driver/rider flows.

**Diagrams**
- UML Class Diagram: (see project docs or images folder)
- Flow Diagram: (see project docs or images folder)

**Quick project summary (for resume)**
- Backend implementation for a ride-booking platform supporting real-time-style matching, fare computation, wallet payments, and rating systems.
- Implemented secure REST APIs using Spring Boot, JWT authentication, and PostgreSQL for persistence.

**Key Features**
1. Ride request handling and nearest-driver / highest-rated-driver matching logic.
2. Fare calculation based on distance and configurable surge multiplier.
3. Wallet management with transactions and payment fallback to cash.
4. Ratings system for both drivers and riders with persistence.
5. Seed data loader (`data.sql`) for quick local setup.

**Tech stack**
- Java, Spring Boot, Spring Data JPA, Spring Security
- PostgreSQL
- JWT for authentication
- Maven (wrapper included)

**Run locally (quick start)**
1. Prerequisites: Java 17+, Maven, PostgreSQL.
2. Create a PostgreSQL database named `uber` and update `src/main/resources/application.properties` with your DB credentials if different.
3. From project root run (Windows):

   mvnw.cmd spring-boot:run

4. The server starts on port configured in `application.properties` (default 8081 in this repo).

**Configuration notes**
- Database URL, username and password are in `src/main/resources/application.properties`.
- The app seeds initial data from `data.sql` when `spring.sql.init.mode=always` is set.
- JWT secret is configured in `application.properties` as `jwt.secretKey` — rotate this for production and keep it secret.

**API overview (examples)**
- POST /api/auth/signup — register a new user
- POST /api/auth/login — obtain JWT token
- POST /api/rides/request — rider requests a ride
- POST /api/rides/{rideId}/start — driver starts a ride
- POST /api/rides/{rideId}/complete — complete a ride and trigger payment
- POST /api/wallet/topup — add funds to wallet
- GET /api/drivers/nearby — find nearby drivers

## UML Class Diagram
![UML Diagram](https://github.com/Lalitsh01/UberClone-Backend/blob/110ad91675b9c1f8d8d6f65774c1b9ffa55b9e00/UML%20Class%20Diagram.png)
## Flow Diagram
![Flow Diagram](https://github.com/Lalitsh01/UberClone-Backend/blob/110ad91675b9c1f8d8d6f65774c1b9ffa55b9e00/Flow%20Diagram.png)

