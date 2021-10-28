# tdd-demo

Nesse hands-on teremos uma dinâmica introdutória a Test Driven Development (TDD), ou desenvolvimento orientado por testes.

## instruções

1 - Clonar esse projeto

2 - abrir na sua IDE de preferência (recomenda-se o intellij community editiion)

3 - executar o teste presente na classe Quadratic, na raiz do módulo tests. Esse teste deve passar.

Se você conseguiu executar com sucesso o teste, seu ambiente está pronto para a aula.

## sobre Kotlin

Iremos utilizar Kotlin, uma linguagem multi-paradigma, inter-operável com Java, mas que possibilita construção de códigos mais idiomáticos e com menos escrita de boiler plate.

Para uma rápida introdução a kotlin, acesse o seguinte tutorial:
https://play.kotlinlang.org/byExample/01_introduction

Para efeitos dessa aula, o conteúdo da introdução deve ser suficiente, principalmente para quem já conhece Java.

A maior parte do código que iremos escrever é bem parecida com Java. 

### Funções

Funções mais simples, que podem ser definidas em 1 linha, podem ser feitas nesse formato

`fun sum(a: Integer, val b: Integer) = a + b`

Ou você pode adotar um estilo mais parecido com java

`fun sum(a: Integer, val b: Integer) : Integer {
    return a + b
}`

### Operações com BigDecimals

**Soma**

`val result = BigDecimal(10).plus(BigDecimal(5)) // 15`


**Subtração**

`val result = BigDecimal(10).minus(BigDecimal(5)) // 5`


**Multiplicação**

`val result = BigDecimal(2).multiply(BigDecimal(4)) // 8`


**Divisão**

`val result = BigDecimal(8).divide(BigDecimal(2)) // 4`


**Raiz quadrada**

`val result = BigDecimal(16).sqrt(MathContext(10)) // 4`


**Potência**

`val result = BigDecimal(3).number.pow(2) // 9`

Esse resuminho tem 90% do kotlin que precisará ser escrito nessa aula!


## A Dinâmica

Iremos juntos explocar como usar TDD de acordo com 2 técnicas: Abordagem Londres e Detroit.

Para isso iremos utilizar um caso clássico de matemática fundamental: Equações completas de segundo grau. Iremos codificar a fórmula de Bhaskara utilizando ambas abordagens.

## lista de raízes para equações completas de segundo grau

Para uso na aula. Não se preocupe com isso antes ;)

### Duas raízez (Delta > 0)

a = 1

b = -1

c = -12

Resultado esperado = [4,-3]

a = 1

b = -5

c = 6

Resultado esperado = [3,2]

### Uma raíz (Delta = 0)

a = 4

b = -4

c= 1

Resultado esperado = [0.5]


### Nenhuma raiz real (Delta < 0)
a = 1

b = -4

c = 5

Resultado esperado = []
