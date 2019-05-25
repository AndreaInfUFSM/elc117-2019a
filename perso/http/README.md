# Personalizadas: HTTP Requests em Java


Estas sugestões de atividades personalizadas são para quem se interessa por sistemas Web. Para isso, vamos usar alguns recursos da linguagem Java para enviar requisições a serviços Web acessíveis via métodos [POST e GET](https://www.w3schools.com/tags/ref_httpmethods.asp).


## Atividade 1


1. Baixe o programa [DemoPost.java](DemoPost.java). Este programa envia uma requisição POST a um serviço Web que escreve em uma [planilha no Google](https://docs.google.com/spreadsheets/d/178zl7PujrfHqzeZEJ1IzSX_8tgw71nNeUcYaoPhr44Q/edit?usp=sharing). 

2. Compile e execute o programa:
   ```
   javac DemoPost.java
   java DemoPost
   ```
   Obs.: O programa depende de uma conexão Internet ativa. Se tudo der certo, você verá que uma linha será adicionada na planilha.

3. Examine o código e responda:
   1. Quais são as referências para objetos declaradas no código? De que classes são essas referências?
   2. A classe [URL](https://docs.oracle.com/javase/8/docs/api/java/net/URL.html) é pré-definida em Java. Em qual pacote ela está definida? Quantos construtores estão definidos nesta classe? Quantos métodos estão definidos nesta classe?
   3. O código [DemoPost.java](DemoPost.java) usa `new` para criar um objeto da classe URL, na linha 9. Nas linhas seguintes, não há mais uso de `new`, mas mesmo assim são usadas outras referências para objetos das classes HttpURLConnection e String. Como isso é possível?
   4. Altere o código para chamar o método `getClass()` do objeto referenciado por `con` e mostrar o resultado com `System.out.println`. Qual o resultado? Onde o método `getClass()` está definido?
   5. Em `con.getOutputStrem().write`, o método `write` se aplica a um objeto de qual classe?
   6. O que acontece se removermos os termos `throws IOException` deste código?

4. Altere o código para escrever outros dados na planilha: por exemplo, o número de horas que você já passou estudando POO :-D e seu nome de usuário no NCC.

5. Veja que a [planilha](https://docs.google.com/spreadsheets/d/178zl7PujrfHqzeZEJ1IzSX_8tgw71nNeUcYaoPhr44Q/edit?usp=sharing) tem uma quarta coluna que não está sendo preenchida pelo programa. Você consegue modificar o código para preenchê-la?



Entregue esta atividade separadamente no formulário de entrega de atividades personalizadas.


## Atividade 2

Em breve aqui: sugestão de atividade que envia requisição GET. :-D


