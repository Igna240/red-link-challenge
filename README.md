# Banking Transactions Microservices Project

This project consists of a set of microservices designed to manage banking transactions using a CQRS architecture, along with CRUD microservices for user and currency management.

## Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Microservices](#microservices)
- [Curls](#contact)

## Overview

This project implements a microservices architecture to handle banking transactions using the CQRS (Command Query Responsibility Segregation) pattern. It also includes CRUD services for managing users and currencies.

## Architecture

![Project Architecture](https://github.com/Igna240/red-link-challenge/blob/main/diagrams/software-architecture-cqrs.png?raw=true)

The system is composed of the following microservices:

- *Transaction CQRS*: Implements the CQRS pattern for managing transactions.
- *User CRUD*: Provides CRUD operations for user management.
- *Currency CRUD*: Provides CRUD operations for managing different currencies.

## Microservices

- *rl-transaction-commander*:
  UML
  ![Trial Commander UML](https://github.com/Igna240/red-link-challenge/blob/main/diagrams/uml_redlink.drawio.png?raw=true)
  

## Prerequisites

- Docker
- Maven

## Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/Igna240/red-link-challenge.git
   cd red-link-challenge

2. Generate .jar files of ´rl-transaction-commander´ and ´rl-transaction-processor´ Microservices
   ```bash
   cd rl-transaction-commander
   mvn clean package

3. run docker-compose
   ```bash
   docket-compose up -d

## Curls

```bash
curl --location 'http://localhost:8090/api/transactions/card' \
--header 'Transaction-Type: bank' \
--header 'Content-Type: application/json' \
--data '{
 "cardId": "43211234",
 "userId": "113411",
 "amount": 100,
 "currency": "USD",
 "status": "COMPLETED",
 "createdAt": "2024-10-15T10:20:00Z",
 "merchant": {
 "name": "Amazon",
 "merchantId": "12309"
 },
 "mcc_code": 5411
}'
  
