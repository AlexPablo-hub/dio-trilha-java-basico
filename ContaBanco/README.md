# 💳 Desafio ContaBanco - Java

Este projeto é parte do desafio proposto no módulo de **Sintaxe em Java**, com o objetivo de praticar conceitos fundamentais da linguagem, como:

- Declaração de variáveis
- Entrada de dados via terminal com `Scanner`
- Uso do método `main`
- Impressão formatada com `System.out.printf`
- Organização de código em classe Java

---

## 📌 Desafio

Criar uma aplicação simples chamada `ContaBanco` que:

1. Solicita ao usuário os seguintes dados via terminal:
   - Número da conta (inteiro)
   - Número da agência (texto)
   - Nome do cliente (texto)
   - Saldo (decimal)

2. Após a entrada dos dados, imprime uma mensagem formatada de boas-vindas ao cliente, informando os dados da conta.

---

## 🛠️ Explicação da Implementação

#### 1. Configuração do Locale e Scanner
```java
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
```
Garante que o sistema utilize o ponto (.) como separador decimal, evitando problemas na leitura de valores double em sistemas configurados para português (como Windows em PT-BR).

#### 2. Utilização do try-with-resources garante que o recurso Scanner seja fechado automaticamente, sem necessidade de sc.close().
```java
try (Scanner sc = new Scanner(System.in))
```

#### 3. Coleta de dados do usuário
```java
System.out.print("Por favor, digite o número da Conta: ");
int numeroConta = sc.nextInt();
sc.nextLine(); // limpa o buffer
```
A leitura de dados foi feita com atenção aos tipos e ao buffer do Scanner, usando nextLine() após nextInt() para evitar problemas com quebras de linha e System.out.print foi usado para deixar o cursor na mesma linha da pergunta, melhorando a experiência do usuário.

#### 4. Mensagem de saída formatada
```java
System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
        nomeCliente, numeroAgencia, numeroConta, saldoConta);
```
printf foi utilizado para formatar os dados, com casas decimais fixas (%.2f) para o saldo e um \n no início pula uma linha, melhorando a visualização final da mensagem.

#### Exemplo de saida
```yaml
Por favor, digite o número da Conta: 1021
Por favor, digite o número da Agencia: 067-8
Por favor, digite o seu nome: ALEX PABLO
Por favor, digite o saldo da conta: 237.48

Olá ALEX PABLO, obrigado por criar uma conta em nosso banco, sua agencia é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

#### 👨‍💻 Desenvolvido por
Alex Pablo de Oliveira Moraes -  [**@AlexPablo-hub**](https://github.com/AlexPablo-hub)
