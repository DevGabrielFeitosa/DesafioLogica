# Desafios de Lógica

![Badge de Tecnologia](https://img.shields.io/badge/tecnologia-Java-blue.svg)

Desafios para testar os conhecimentos de lógica de programação em Java.

- Desafio dos resistores
- Desafio Snail

## 📋 Pré-requisitos

Para inicializar o projeto corretamente, é necessário ter:

- Java JDK 1.8.102+ ou superior instalado. (download [aqui](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html))
- IntelliJ IDEA. (versão recomendada: 2023, download [aqui](https://www.jetbrains.com/idea/download/))
- Git instalado. (download [aqui](https://git-scm.com/downloads))

## 📦 Estrutura do Projeto
```bash
DesafioLogica
│
├── DesafioResistores
│   └── src
│       ├── br
│       │   └── com
│       │       └── service
│       │                └── enums
│       │                └── ResistorService.java ##Regras de negócio aqui
│       │
│       └── Main.java ##Rode o código nessa classe
│
├── DesafioSnail
│   ├── src
│   │   └── br
│   │        └── com
│   │            └── service
│   │                 └── MatrixService.java ##Regras de negócio aqui
│   │   
│   └── Main.java ##Rode o código nessa classe
│
│
└── README.md
```

## 🚀 Como rodar o projeto

### Passo 1: Clonar o Repositório

```bash
git clone https://github.com/DevGabrielFeitosa/DesafioLogica.git
```

### Passo 2: Abrir o Projeto no IntelliJ IDEA

No IntelliJ IDEA, vá para File > Open... e selecione o diretório clonado.
Aguarde o IntelliJ IDEA carregar todas as dependências e compilar o projeto.

### Passo 3: Você pode rodar o projeto diretamente no IntelliJ IDEA

Com o JDK instalado, vá em File > Project Structure, no menu esquerdo acesse Project e selecione o caminho do seu SDK, geralmente fica em C:\Program Files\Java\jdk-1.8.102.

Clique em Apply, navegue até a main que está dentro do DesafioResistores, ou na main que está dentro de DesafioSnail.

Dentro da main, no menu superior, clique no ícone de Run (seta verde) ou pressione Shift + F10 para executar a aplicação.

Aparecerá uma mensagem de ação no console logo abaixo, interaja para realizar alguma ação.

### 📚 Tecnologias Utilizadas

- Java 1.8.102 - Linguagem principal
- IntelliJ IDEA 2023 - IDE recomendada
- Git - Controle de versão
