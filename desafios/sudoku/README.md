# Sudoku Game - JavaFX

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://openjdk.org/projects/jdk/21/)
[![JavaFX](https://img.shields.io/badge/JavaFX-21-orange.svg)](https://openjfx.io/)

Um jogo de Sudoku desenvolvido com JavaFX, incluindo geração de tabuleiros, validação e diferentes níveis de dificuldade. Feito para fins de estudo.

## 📋 Pré-requisitos

- JDK 21 ([Download Oracle](https://www.oracle.com/br/java/technologies/downloads/#java21))
- Maven 3.9+ (opcional, mas recomendado)
- Git (opcional)

## 🚀 Como Executar o Projeto

### Método 1: Usando Maven

```bash
# Clone o repositório (se aplicável)
git clone https://github.com/seu-usuario/sudoku-javafx.git
cd sudoku-javafx

# Execute com Maven
mvn clean javafx:run
```

### Método 2: Executando diretamente no IntelliJ

1. Abra o projeto no IntelliJ IDEA
2. Configure o SDK para Java 21
3. Localize a classe `com.ricardo.sudoku.MainApp`
4. Clique com o botão direito e selecione "Run 'MainApp'"

### Método 3: Executando o JAR

```bash
mvn clean package
java --module-path "caminho/para/javafx-sdk-21/lib" --add-modules javafx.controls,javafx.fxml -jar target/sudoku-1.0-SNAPSHOT.jar
```

## 📦 Dependências Principais

- JavaFX 21 (UI)
- ControlsFX 11.2.1 (Componentes extras)
- BootstrapFX 0.4.0 (Estilos CSS)
- JUnit 5.10.2 (Testes)

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/ricardo/sudoku/
│   │   ├── controllers/ # Controladores FXML
│   │   ├── models/ # Lógica do jogo
│   │   ├── services/ # Serviços
│   │   └── MainApp.java # Classe principal
│   └── resources/
│       ├── com/ricardo/sudoku/
│       │   ├── views/ # Arquivos FXML
│       │   └── styles/ # Arquivos CSS
├── test/ # Testes unitários
pom.xml # Configuração Maven
```

## ⚙️ Configuração Especial

Se encontrar erros relacionados ao JavaFX, configure as VM Options:

```bash
--module-path "caminho/para/javafx-sdk-21/lib" --add-modules javafx.controls,javafx.fxml
```

## 🎯 Funcionalidades

- Geração aleatória de tabuleiros
- Diferentes níveis de dificuldade
- Validação automática
- Interface moderna com BootstrapFX
- Sistema de pontuação
- Temporizador