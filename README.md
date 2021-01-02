# BasicJava

Repositório dedicado a base de Java, com conceitos basicos para aprendizagem.

## Operadores Aritméticos

|Operador|Significado|
|:--------:|-----------|
|+|soma|
|-|subtração|
|* |multiplicação|
|/|divisão("mod")|

#### Precedências:
- 1º * / %
- 2º + -

## Tipos Primitivos
|Descrição|Tipo|Tamanho|Valores|Valor Padrão|
|---------|:----:|:-------:|-------|:------------:|
|tipos numéricos inteiros|**byte**|8 bits|-128 a 127|0|
|tipos numéricos inteiros|**short**|16 bits|-32768 a 32767|0|
|tipos numéricos inteiros|**int**|32 bits|-2147483648 a 2147483647|0|
|tipos numéricos inteiros|**long**|64 bits|-9223372036854770000 a 9223372036854770000|0L|
|tipos numéricos ponto flutuante|**float**|32 bits|-1,4024E-37 a 3,4028E+38|0.0f|
|tipos numéricos ponto flutuante|**double**|64 bits|-4,94E-307 a 1,79E+308|0.0|
|um caracter Unicode|**char**|16 bits|'\u0000' a '\uFFFF'|'\u0000'|
|valor verdade|**boolean**|1 bit|{false, true}|false|

## Saída de Dados

Em Java temos usar alguns tipos de saída de dados conforme o tipo de entrada de dados.

|Sintaxe|Tipo|
|--|--|
|print|Tipo básico para imprimir a saída|
|println|Saída de dados com quebra de linha|
|printf|Saída de dados formatada|

### Marcadores
Para concatenar utilizando **printf** devemos utilizar alguns marcadores:
|Marcador|utilização|
|:--:|--|
|%f|Utilizado para ponto flutuante|
|%d|Utilizado para inteiro|
|%s|Utilizado para texto (String)|
|%n|Utilizado para quebra de linha|

Podemos limitar o número de casas decimais utilizando a sintaxe (%.2f -> delimita o número de casas decimais em 2)

## Entrada de Dados

Para fazermos a leitura dos dados informados através do teclado devemos criar uma variável utilizando a classe **Scanner**.

```
import java.util.Scanner; //importando a classe Scanner do módulo java.util
Scanner <nome_da_variavel> = new Scanner(System.in); //criando um objeto do tipo Scanner e atribuindo a variavel
<nome_da_variavel>.close(); //temos que sair do módulo após a utilização.
```

Para leitura de dados devemos utilizar alguns métodos:
|Método|Utilização|
|--|--|
|next()|Para leitura de uma String|
|nextInt()|Para leitura de número inteiro|
|nextDouble()|Para leitura de número ponto flutuante|
|next().charAt(0)|Para leitura de tipo char|
|nextLine()|Para leitura de String com espaços|

[sobre a classe Scanner](https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448)

# Estruturas Condicionais

Antes de iniciarmos com estruturas condicionais devemos ter em mente os operadores que temos na linguagem Java.

### Operadores comparativos
|Operador|Significado|
|--|--|
|>|Maior|
|<|Menor|
|>=|Maior ou Igual|
|<=|Menor ou Igual|
|==|Igual|
|!=|Diferente|

### Operadores lógicos
|Operador|Significado|
|:--:|:--:|
|&&|E|
|┃┃|OU|
|!|Não|

### Operadores de atribuição cumulativa
|Utilização|Forma Extensa|
|:--:|:--:|
|a += b;|a = a + b|
|a -= b;|a = a - b|
|a * = b;|a = a * b|
|a /= b;|a = a / b|
|a %= b;|a = a % b|

****

Agora que já vimos os operadores podemos iniciar o nosso conteúdo sobre **Estruturas Condicionais**

## Conceito
É uma **Estrutura de Controle** que permite definir um certo **bloco de comandos** dependente de uma **condição** para ser executado.

### Estrutura Condicional Simples - If

```
- if (<condicao>){
  <comando 1>
  <comando 2>
}
```

### Estrutura Condicional Composta - If/else

- 1º Sintaxe
```
if(<condicao>){
  <comando1>
  <comando2>
} else {
  <comando3>
}
```

*******

- 2º Sintaxe
```
if(<condicao1>){
  <comando1>
  <comando2>
} else if (<condicao2>){
  <comando3>
} else {
  <comando4>
}
```
### Sintaxe Opcional - Switch-case
Quando se tem várias opções de fluxo a serem tratadas com base no
valor de uma variável, ao invés de várias estruturas if-else encadeadas,
alguns preferem utilizar a estrutura switch-case.

- Sintaxe
```
switch ( expressão ) {
case valor1:
    comando1
    comando2
    break;
case valor2:
    comando3
    comando4
    break;
default:
    comando5
    comando6
    break;
}
```

### Expressão condicional - ternária
Estrutura opcional ao if-else quando se deseja decidir um **VALOR** com base em uma condição.

- Sintaxe
```
( condição ) ? valor_se_verdadeiro : valor_se_falso
```

### Escopo
[escopo de variavel](https://medium.com/@mauriciogeneroso/java-oca-1z0-808-1-4-java-b%C3%A1sico-escopo-de-vari%C3%A1veis-3e652ac873e)














