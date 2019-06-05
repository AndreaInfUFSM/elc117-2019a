# Prática: Interfaces Gráficas com JavaFX



## Preparação


1. Para estes exercícios, é necessário ter instalado o toolkit JavaFX, distribuído com um JDK ou baixado separadamente.

2. Estes exercícios tratam de **orientação a objetos** e **interfaces gráficas**. Além disso, são exercícios que ajudarão a introduzir a **programação concorrente** em Java, que será abordada das próximas aulas.


## JavaFX, MVC e Concorrência

1. Baixe o arquivo [threaddemo.zip](src/threaddemo.zip) e descompacte-o. Nele você encontrará o código referente a este [diagrama de classes](src/threaddemo/graph2.png). 

2. Compile tudo usando usando seu IDE preferido, ou faça isso diretamente num terminal:
   ```
   $ cd threaddemo
   $ javac *.java
   ```
3. Note que existem 2 classes que implementam o método main: [ThreadDemoFX](src/threaddemo/ThreadDemoFX.java) e [ThreadDemoSwing](src/threaddemo/ThreadDemoSwing.java). As demais classes são reusadas. Execute os programas separadamente e observe que o comportamento é semelhante, embora a interface gráfica seja ligeiramente diferente.
   ```
   $ java -cp . ThreadDemoFX
   $ java -cp . ThreadDemoSwing
   ```

4. Nos programas originais, cada área de texto é atualizada sempre do mesmo modo: incrementando um contador a cada segundo. **Sua tarefa** será mudar este comportamento, de modo que uma das áreas de texto mostre um novo número aleatório a cada segundo. Você deve tentar fazer isso alterando o mínimo possível as classes existentes. A classe Random será útil nesta tarefa.


## Usando TableView

1. O componente TableView do JavaFX representa uma tabela interativa na interface gráfica. Seu uso requer alguns passos descritos nestes [slides](https://docs.google.com/presentation/d/11uSC-d5hOS5ZkVusmx6GstCLF-zY_DzqqFKW0dBYS6U/edit?usp=sharing). Os programas abaixo, também disponíveis [aqui](src/tableview), ilustram o uso deste componente. A tabela a seguir sumariza os recursos destes exemplos:

  | Exemplo | Descrição |
  | --- | --- |
  | [TableViewExample1.java](src/tableview/TableViewExample1.java) | Tabela vazia |
  | [TableViewExample2.java](src/tableview/TableViewExample2.java)| Tabela com dados fixos | 
  | [TableViewExample3.java](src/tableview/TableViewExample3.java)| Botão para inserir dado fixo na tabela |
  | [TableViewExample4.java](src/tableview/TableViewExample4.java)| Botão para inserir dado lido de TextField |
  | [TableViewExample5.java](src/tableview/TableViewExample5.java)| Botão para remover linha da tabela |
  | [TableViewExample6.java](src/tableview/TableViewExample6.java)| Botão para substituir dado na tabela |
  | [TableViewExampleJoke.java](src/tableview/TableViewExampleJoke.java) | Bônus: tabela com piadas do Chuck Norris |
  | [TableViewExampleChart.java](src/tableview/TableViewExampleChart.java) | Bônus: tabela e gráfico de barras |



2. Usando como referência estes programas, crie um novo programa para cadastro de diferentes [blocos do jogo Minecraft](https://minecraft-pt.gamepedia.com/Bloco). Seu programa deverá permitir inserção, remoção e alteração de blocos, além de visualização em uma TableView. Cada bloco cadastrado deverá ter pelo menos 3 atributos à sua escolha, por exemplo: nome, transparência e resistência a explosão (veja exemplos de valores abaixo).

   | Nome   | Transparência  | Resistência a Explosão |
   | ------ | -------------  | ---------------------- |
   | Madeira | Não           | 10                     |
   | Vidro   | Sim           | 1.5 |
   | Cacto   | Não           | 2 |
   | Neve    | Não           | 0.5 |








