# Trabalho 7: Analisador de repositórios do GitHub

## Deadline

Domingo, 7 de julho, 23:55.

## Objetivo

Neste trabalho, você vai desenvolver programas que usam a REST API do GitHub para obter dados sobre um conjunto de repositórios e mostrar esses dados de diferentes formas.

## Requisitos mínimos (1000 pontos)

1. O programa `GitHubAnalyzerGUI` deverá ter uma **interface gráfica** com os seguintes componentes: 

   - Uma barra de menus contendo um menu "File", um menu "Tools" e um menu "Help". 

   - O menu "File" deverá conter os seguintes itens: 
     - "Open": deverá abrir um FileChooser para seleção de um arquivo de texto. Esse arquivo deverá conter uma lista de URLs de repositórios no GitHub, um por linha. As URLs deverão ser lidas e apresentadas na interface gráfica em um componente como ListView ou TableView.
     - "Exit": deverá fechar a aplicação. 

   - O menu "Tools" terá pelo menos o seguinte item:
     - "Commit analyzer": deverá fazer requisições ao GitHub para obter a lista completa de commits de cada repositório, para depois extrair a data e a mensagem associada a cada commit. Seu ponto de partida será a [aula prática java8](../../praticas/oo/java8), lembrando que os resultados da REST API são paginados, portanto serão necessárias várias requisições para obter todos os dados. As requisições devem ser feitas uma por vez, mas o conjunto de requisições deve ser processado por uma thread separada da thread principal do programa, pois do contrário a interface gráfica poderá bloquear caso as requisições levem muito tempo para ser processadas. Após a obtenção dos dados, deverão ser exibidos, para cada repositório, o número de commits e o tamanho médio das mensagens desses commits (calculado a partir do tamanho de cada mensagem). Essas informações podem ser apresentadas na mesma janela ou em uma janela separada. **Atenção!** O GitHub limita a quantidade de requisições por hora (veja [aqui](https://developer.github.com/v3/#rate-limiting)), então é recomendável que, para testes, você armazene os resultados de algumas requisições em arquivos e obtenha as informações a partir deles.

    - No menu "Help", haverá somente um item, "About", que mostrará o nome do programa e do autor.


2. O programa deverá tratar as diversas **exceções** que podem ocorrer, por exemplo caso o programa não consiga obter os dados por falha na rede, URL inválida, etc.


## Requisitos adicionais (1000 pontos)


1. O programa `GitHubAnalyzerCmd` será semelhante ao anterior, porém com interface por linha de comando. Este programa receberá o nome do arquivo com a lista de repositórios e produzirá o resultado do "Commit analyzer" na saída padrão.

2. No "Commit Analyzer" de ambos os programas (GUI e Cmd), mostre também as seguintes informações gerais sobre o conjunto de repositórios: (a) repositório com o maior número de commits, (b) repositório com o menor número de commits, (c) repositório com o commit mais recente entre todos os repositórios e (d) repositório com o commit mais antigo entre todos os repositórios. Para a análise das datas, você precisará convertê-las da representação em String para outra classe que permita comparação.

## Personalizadas


Você pode implementar extensões a este trabalho para ganhar pontos em atividades personalizadas! Lembre-se que as atividades personalizadas sobre POO e programação concorrente valem 20% da nota do bimestre.

Algumas ideias:

1. Estude a [REST API do GitHub](https://developer.github.com/v3/repos/commits/) e descubra outros dados que você pode obter a partir dos commits. Use dados à sua escolha para implementar outro item no menu Tools.

2. Apresente alguns dados na forma de gráficos. Por exemplo, mostre um gráfico de barras com os totais de commits por repositório.



## Coding Style

Você já deve ter notado que códigos em Java costumam seguir convenções diferentes de C para nomes (de variáveis, de métodos, etc.) e para outros detalhes de "estilo" do código. Acostume-se com isso e procure seguir alguma convenção documentada, como por exemplo em: https://google.github.io/styleguide/javaguide.html (veja principalmente a seção 5, sobre Naming).

## Entrega

 1. Seu trabalho deverá ser entregue no seu **repositório** remoto da disciplina no GitHub. 

 2. Você deve ter um repositório local da disciplina, que é um clone do repositório remoto. Neste repositório local, crie uma pasta chamada `t7` (atenção: **letra minúscula**).

 3. Todos os arquivo do seu trabalho deverão ficar dentro da pasta `t7`, podendo estar em sub-pastas, se necessário. As funções `main` devem ficar nos arquivos`GitHubAnalyzerGUI.java` e `GitHubAnalyzerCmd.java`, nomeados **exatamente** desta forma. 

 4. Arquivos gerados pelo seu IDE também devem ser entregues. Em especial, inclua o arquivo contendo configurações para compilação do código (ex.: build.xml). 



## Material de Apoio

- [Prática com a REST API do GitHub](../../praticas/oo/java8)  
  Roteiro de aula prática mostrando como enviar requisições ao GitHub e processar a resposta JSON usando a biblioteca GSON.
  
  
