# Aula POO 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![YouTube](https://img.shields.io/badge/YouTube-%23FF0000.svg?style=for-the-badge&logo=YouTube&logoColor=white)

# Sobre o projeto
Este projeto foi desenvolvido como parte de uma aula ministrada no meu canal do YouTube, onde abordo os principais conceitos de Programação Orientada a Objetos (POO). Durante a aula, exploramos temas fundamentais como:

- Pilares da POO (Encapsulamento, Herança, Polimorfismo e Abstração)
- Enums
- Interfaces
 
O projeto simula um sistema de carros, aplicando na prática cada um desses conceitos. É ideal para quem está começando no mundo da programação orientada a objetos ou para quem quer reforçar os conhecimentos nesses tópicos essenciais.

Acompanhe o vídeo completo no YouTube e veja como os conceitos são implementados no código!

Parte 1: https://www.youtube.com/watch?v=VcxaS74WnFg

# Material de apoio

## Antes de entendermos sobre POO, vamos revisar a sintaxe do java?

<img src="/assetsReadme/java.png" alt="banner" width="150">

### Tipos de dados
- int -> Inteiro de 32 bits em notação de complemento de dois. Pode assumir valores entre -231=2.147.483.648 e 231-1=2.147.483.647.
  
- long	 -> 	Inteiro de 64 bits em notação de complemento de dois. Pode assumir valores entre -263 e 263-1.

- double -> Representa números em notação de ponto flutuante normalizada em precisão dupla de 64 bits em conformidade com a norma IEEE 754-1985. O menor valor positivo representável é 4.94065645841246544e-324 e o maior é 1.7976931348623157e+308

- boolean	 -> Pode assumir o valor true ou o valor false.

- String -> Em Java, a classe String representa uma sequência imutável de caracteres, o que significa que seu valor não pode ser alterado após a criação. Strings podem ser criadas por literais ou pelo construtor da classe, e operações que parecem modificar o valor resultam em uma nova instância. A classe oferece diversos métodos úteis, como length() para obter o tamanho, substring() para extrair partes da string, e toUpperCase() para conversão para maiúsculas. Para comparar strings, o método equals() deve ser utilizado, pois o operador == compara referências e não os valores.

#### List X Set
- A diferença entre `List` e `Set` em Java está no comportamento e regras de armazenamento. Uma `List` permite elementos duplicados e preserva a ordem de inserção, além de permitir acesso por índices, como em um array. Já o `Set` não permite duplicatas, ou seja, cada elemento deve ser único, e em algumas implementações, como `HashSet`, a ordem de inserção não é garantida. Se você precisa de elementos únicos e não se importa com a ordem, `Set` é mais adequado; caso precise de ordenação e duplicatas, `List` é a escolha correta.

### Operadores 

#### Aritméticos
- `+` (adição)
- `-` (subtração)
- `*` (multiplicação)
- `/` (divisão)
- `%` (módulo - resto da divisão)

#### Atribuição
- `=` (atribuição simples)
- `+=` (atribuição com adição)
- `-=` (atribuição com subtração)
- `*=` (atribuição com multiplicação)
- `/=` (atribuição com divisão)
- `%=` (atribuição com módulo)

#### Comparação (Relacionais)
- `==` (igual a)
- `!=` (diferente de)
- `>` (maior que)
- `<` (menor que)
- `>=` (maior ou igual a)
- `<=` (menor ou igual a)

#### Lógicos
- `&&` (E lógico - AND)
- `||` (OU lógico - OR)
- `!` (não lógico - NOT)

#### Unários
- `+` (indica valor positivo)
- `-` (inverte o sinal do número)
- `++` (incrementa em 1)
- `--` (decrementa em 1)
- `!` (inverte um valor booleano)

#### Ternário
- `? :` (expressão condicional)
  - Exemplo: `(condição) ? valorSeVerdadeiro : valorSeFalso`

#### Instância e Tipo
- `instanceof` (verifica se um objeto é uma instância de uma classe)


# Voltando ao POO...


<img src="/assetsReadme/banner.png" alt="banner" width="350">


## O que é o paradigma da orientação a objetos? 

A **Programação Orientada a Objetos (POO)** é um paradigma que organiza o software em torno de **objetos**, que são instâncias de **classes** que combinam dados (atributos) e comportamentos (métodos). Seus pilares principais são: **encapsulamento**, que protege os dados internos e permite acesso controlado; **herança**, que permite que uma classe derive características de outra; **polimorfismo**, que permite o uso de objetos de diferentes tipos de forma intercambiável; e **abstração**, que foca nos detalhes essenciais enquanto oculta a complexidade.

## Os Pilares da POO

<img src="/assetsReadme/pilares.png" alt="banner" width="400">

___

### Encapsulamento
<img src="/assetsReadme/encapsulamento.png" alt="banner" width="400">

**Encapsulamento** é um dos pilares da Programação Orientada a Objetos (POO) que consiste em ocultar os detalhes internos de uma classe e controlar o acesso aos seus atributos e métodos. Isso é feito utilizando **modificadores de acesso** como `private`, `protected` e `public`, que definem quais partes do código podem interagir com os dados de um objeto. O objetivo é proteger o estado interno de um objeto, permitindo que ele seja manipulado apenas através de métodos específicos, conhecidos como **getters** e **setters**, garantindo maior segurança, manutenção e modularidade do código.

| Modificador       | Classe | Pacote | Subclasse | Global |
|----------------|:-----:|:-------:|:--------:|:-----:|
| `public`       |   ✔   |    ✔    |    ✔     |   ✔   |
| `protected`    |   ✔   |    ✔    |    ✔     |   ✘   |
| *Sem Modificador*  |   ✔   |    ✔    |    ✘     |   ✘   |
| `private`      |   ✔   |    ✘    |    ✘     |   ✘   |

___


### Abstração
<img src="/assetsReadme/abstracao.png" alt="banner" width="400">

**Abstração** na Programação Orientada a Objetos (POO) é o princípio que foca em expor apenas os detalhes essenciais de um objeto, ocultando a complexidade desnecessária. Ela permite que os programadores trabalhem com conceitos mais genéricos, simplificando a implementação. A abstração é realizada por meio de **classes abstratas** e **interfaces**, que definem um conjunto de funcionalidades que devem ser implementadas pelas classes concretas. O objetivo é facilitar o design do sistema, promovendo flexibilidade, reuso e um entendimento mais claro do comportamento dos objetos sem precisar saber todos os detalhes internos.

___

### Herança
<img src="/assetsReadme/heranca.png" alt="banner" width="400">

**Herança** na Programação Orientada a Objetos (POO) é um mecanismo que permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse), promovendo **reuso de código**. Com a herança, a subclasse pode estender ou modificar o comportamento da superclasse, adicionando novas funcionalidades ou alterando métodos existentes. Isso facilita a criação de hierarquias de classes e a modelagem de relações "é um" (por exemplo, um "Carro" é um tipo de "Veículo"), além de promover organização e modularidade no código.

___

### Polimorfismo
<img src="/assetsReadme/polimorfismo.png" alt="banner" width="400">

**Polimorfismo** na Programação Orientada a Objetos (POO) é a capacidade de um objeto assumir diferentes formas, permitindo que métodos com o mesmo nome funcionem de maneiras distintas dependendo do contexto. Isso pode ser feito de duas maneiras principais: **sobrecarga de métodos** (vários métodos com o mesmo nome, mas diferentes parâmetros) e **sobrescrita de métodos** (uma subclasse redefine um método da superclasse). O polimorfismo promove flexibilidade e reutilização de código, pois permite que diferentes tipos de objetos sejam tratados de maneira uniforme, mas com comportamentos específicos.

___

# O que é uma interface
Uma interface em Java é um contrato que define um conjunto de métodos que uma classe deve implementar.

Uma interface em Java permite a reutilização de código ao definir um conjunto de métodos que diferentes classes podem implementar. Isso facilita a criação de implementações diversas para o mesmo comportamento, promovendo flexibilidade e interoperabilidade.

   ```
   public interface Movimentacao {
       void acelerar();
       void freiar();
   }
   ```



  
# Tecnologias utilizadas
 - Java
  





# Como executar o projeto

## Back end
Pré-requisitos: Java 21

```bash
# clonar repositório
git clone https://github.com/Ital023/AulaPOO-YTB.git
```

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Ital023" title="Github do Ítalo Miranda">
        <img src="https://avatars.githubusercontent.com/u/113559117?v=4" width="100px;" alt="Foto do Ítalo Miranda no GitHub"/><br>
        <sub>
          <b>Ítalo Miranda</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
