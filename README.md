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

# Estrutura de repetição

### Enquanto - while

É uma **estrutura de controle** que **repete** um bloco de comandos **enquanto** uma condição for verdadeira. 
Quando usar: quando **não** se sabe previamente a quantidade de repetições que será realizada.

- Sintaxe:
```
while ( condição ) {
    comando 1
    comando 2
}
```

### Para - for

É uma estrutura de **controle que repete** um bloco de comandos para um certo intervalo de valores. 
Quando usar: quando **se sabe previamente** a quantidade de repetições, ou o intervalo de valores.

- Sintaxe
```
for ( início ; condição ; incremento) {
    comando 1
    comando 2
}
```
### Faça/Enquanto - Do/While

Menos utilizada, mas em alguns casos se encaixa melhor ao problema.
O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.

- Sintaxe
```
do {
  comando 1
  comando 2
} while ( condição );
```

# Programação Orientada a Objetos (POO)

Programação Orientada a Objetos é um paradigma muito utilizado na programação, pois facilita a compreensão do código através de classes e objetos,
que pode conter caracteristica em forma de campo conhecido como atributo e procedimento conhecido como métodos.


## Classe

Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real. 
Dentro dela é comum declararmos atributos e métodos, que representam, respectivamente, as características e comportamentos desse objeto. 
Neste documento será apresentado como declarar e utilizar uma classe em Java.

### É um tipo estruturado que pode conter (membros):
- Atributos (dados / campos)
- Métodos (funções / operações)

### A classe também pode prover muitos outros recursos, tais como:
- Construtores
- Sobrecarga
- Encapsulamento
- Herança
- Polimorfismo

### Sintaxe
```
<modificador de acesso> class NomeDaClasse {
  //Local onde atributos, construtores e métodos são criados.
}
```
## Object e toString

Toda Classe em Java é uma subclasse da classe Object

A classe Object possui os seguntes métodos:
- getClass - retorna o tipo do objeto
- equals - compara se o objeto é igual a outro
- hashCode - retorna um código hash do objeto
- toString - converte o objeto para String

## Membros estáticos

- Para constantes utilizar a palavra "final" e utilizar letras maiúsculas com "_" separando as palavras.

- O método "main" por padrão é static.

- Não posso colocar um método que não é estático em um estático.

- Com o modificador static não precisa de uma instância da classe "objeto", para poder acessar um método ou variável.

- Conhecida como classe utilitária

- Um recurso que pode ser usado

[para saber mais sobre classes estáticas](https://pt.stackoverflow.com/questions/90047/principal-objetivo-de-classes-utilit%C3%A1rias#:~:text=Classes%20utilit%C3%A1rias%20organizam%20c%C3%B3digo%2C%20separam,projeto%20criando%20uma%20classe%20utilit%C3%A1ria.)

## Construtores

Os construtores são responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida. 
Eles são obrigatórios e são declarados conforme a sintaxe abaixo:

```
public class Carro{

    /* CONSTRUTOR DA CLASSE Carro */
    public Carro(){
        //Faça o que desejar na construção do objeto
    }
}
```

- É uma operação especial da classe, que executa no momento da instanciação do objeto,

### Usos Comuns
- Iniciar valores dos atributos.
- Permitir ou obrigar que o objeto receba dados / dependência no momento da sua instanciação (injeção de dependência).
- Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
```
Product p = new Product()
```
- É possível especificar mais de um construtor na mesma classe (sobrecarga).

## Palavra this

- É uma referência para o próprio Objeto

### Uso comuns
- Diferenciar atributos de variáveis locais.
- Passar o próprio objeto como argumento de um método ou construtor.

## Encapsulamento

É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.

**Regra de ouro: o objeto deve sempre  estar em um estado consistente, e a própria classe deve garantir isso.**

### Regra geral básica
- Um objeto NÃO deve expor nenhum atributo (modificador de acesso private).
- Os atributos devem ser acessados por meio de métodos get e set. [Padrão JavaBeans] (https://en.wikipedia.org/wiki/JavaBeans)

## Modificadores de acesso

- https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
- **private:** o membro só pode ser acessado na própria classe.
- **(nada):** o membro só pode ser acessado nas classes do mesmo pacote.
- **protected:** o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes.
- **public:** o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está).












