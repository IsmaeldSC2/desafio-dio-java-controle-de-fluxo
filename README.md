
# 🚀 DIO - Trilha Java Básico

## 📌 Desafio: Controle de Fluxo

Este é um desafio de projeto proposto pela [Digital Innovation One (DIO)](https://www.dio.me).  
Nele, exploramos cenários com estruturas condicionais, repetições e tratamento de exceções.  
Ao final, foi implementado um pequeno sistema contador que permite exercitar todo o conteúdo abordado nas aulas.

---

## 📋 Descrição do Desafio

O objetivo do desafio é praticar estruturas de controle de fluxo (`if`, `for` e `try/catch`) com tratamento de exceção personalizado.

### 🧠 Regras do Desafio

- O sistema deve receber dois números inteiros via terminal.
- O segundo número deve obrigatoriamente ser **maior** que o primeiro.
- O programa imprime a quantidade de interações com base na diferença dos dois números.
- Se o primeiro número for maior que o segundo, uma **exceção personalizada** deve ser lançada com a seguinte mensagem:

```
O segundo parâmetro deve ser maior que o primeiro
```

---

## 🧾 Exemplo de uso

```
Digite o primeiro parâmetro
5
Digite o segundo parâmetro
9

Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
```

---

## ⚙️ Tecnologias utilizadas

- Java 17+
- IntelliJ IDEA / VS Code
- Git e GitHub

---

## 🗂 Estrutura do Projeto

- `Contador.java` → Classe principal do programa
- `ParametrosInvalidosException.java` → Classe de exceção personalizada

---

## 🙋‍♂️ Autor

**Ismael dos Santos Costa**  
Estudante de Sistemas de Informação na UFOP  
Curso: Trilha Java Básico - DIO  
[LinkedIn](https://www.linkedin.com)

---

## 📁 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```

2. Compile e execute:
   ```bash
   javac Contador.java ParametrosInvalidosException.java
   java Contador
   ```

---

## 💡 Aprendizados

- Manipulação de entrada via terminal
- Criação de exceções personalizadas
- Estrutura de controle `try/catch`
- Estrutura de repetição `for`
