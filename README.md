# Banking Transactions Microservices Project

This project consists of a set of microservices designed to manage banking transactions using a CQRS architecture, along with CRUD microservices for user and currency management.

## Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Microservices](#microservices)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

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

## Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/Igna240/red-link-challenge.git
   cd red-link-challeng
   docket-compose up -d
