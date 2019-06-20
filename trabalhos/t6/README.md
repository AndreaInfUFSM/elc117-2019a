# Trabalho 6: ENADE UFSM Explorer em JavaFX

## Deadline

Domingo, 16 de junho, 23:55.

## Objetivo

Neste trabalho, você vai desenvolver um programa orientado a objetos, usando JavaFX, para explorar uma planilha com dados do desempenho dos seus veteranos no ENADE! O [ENADE (Exame Nacional de Desemenho de Estudantes)](http://inep.gov.br/enade) é uma avaliação do MEC aplicada a concluintes de cursos de graduação, com periodicidade trienal. A próxima avaliação da área de Computação será para concluintes em 2020. Os dados das avaliações anteriores são públicos, mas estão distribuídos em diferentes documentos. Alguns dados relevantes para os cursos da área de Computação da UFSM foram compilados em uma planilha, e seu programa permitirá explorar esses dados para sanar algumas curiosidades :-D. 

## Requisitos

O programa com interface gráfica deverá conter os seguintes **componentes**: 

  - Uma TableView com 9 colunas: Ano, Prova, Tipo Questão, Id Questão, Objeto, Acertos Curso, Acertos Região, Acertos Brasil, Dif. (Curso-Brasil). Essa TableView deverá ser preenchida automaticamente quando o programa inicia, da seguinte forma: (1) se existir um arquivo local (default: `enade.csv`), deve-se ler os dados deste arquivo; (2) se o arquivo local não existir, deve-se fazer download de uma planilha que está online, usando uma URL default: CC (https://docs.google.com/spreadsheets/d/e/2PACX-1vTO06Jdr3J1kPYoTPRkdUaq8XuslvSD5--FPMht-ilVBT1gExJXDPTiX0P3FsrxV5VKUZJrIUtH1wvN/pub?gid=0&single=true&output=csv) ou SI (https://docs.google.com/spreadsheets/d/e/2PACX-1vTO06Jdr3J1kPYoTPRkdUaq8XuslvSD5--FPMht-ilVBT1gExJXDPTiX0P3FsrxV5VKUZJrIUtH1wvN/pub?gid=1285855524&single=true&output=csv). Após o download, o arquivo será salvo em `enade.csv`. Os dados das 9 colunas da TableView serão provenientes das colunas B, C, D, E, F, I, J, K e L da planilha, respectivamente.

  - Quando uma linha da tabela (questão) for selecionada, o programa deverá abrir uma nova janela "modal" (`Modality.WINDOW_MODAL`), que vai se sobrepor à janela principal do programa (o usuário não poderá mais interagir com a janela principal). Nessa janela "modal", serão mostrados todos os dados anteriores sobre a questão selecionada, acrescidos de mais 2 atributos: Gabarito (coluna H da planilha) e Imagem (URL na coluna R da planilha), se houver. A URL na coluna R designa uma imagem da questão (um recorte feito a partir do arquivo da prova).

  - Uma barra de menus ([MenuBar](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/MenuBar.html) contendo um [Menu](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Menu.html) "File" e um [Menu](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Menu.html) "Help". 

  - No Menu "File", haverá três itens ([MenuItem](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/MenuItem.html)): 
    - "Reload": deverá recarregar os dados da planilha online. 
    - "Source": permitirá redefinir o valor default para a URL da planilha online. 
    - "Exit": deverá fechar a aplicação. 

  - No menu "Help", haverá somente um item "About", que mostrará o nome do programa e do autor.


O programa deverá tratar as diversas **exceções** que podem ocorrer, por exemplo caso não se consiga obter os dados por falha na rede, URL inválida, arquivo corrompido, etc.


## Personalizadas

Você pode implementar extensões a este trabalho para ganhar pontos em atividades personalizadas! Lembre-se que as atividades personalizadas sobre POO e programação concorrente valem 20% da nota do bimestre.

Algumas ideias:
- Implemente filtros para visualizar somente alguns dados da tabela. Por exemplo: filtrar por ano, por tipo de questão, etc.
- Apresente gráficos ([JavaFX Charts](https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/charts.htm)) com dados selecionados. Por exemplo, apresente um gráfico de barra comparando os percentuais de acerto do curso, da região e do Brasil para uma dada questão.
- Implemente uma tarefa concorrente que faça download das imagens das questões e/ou dos arquivos das provas e relatórios (colunas O, P, Q, R).


## Coding Style

Você já deve ter notado que códigos em Java costumam seguir convenções diferentes de C para nomes (de variáveis, de métodos, etc.) e para outros detalhes de "estilo" do código. Acostume-se com isso e procure seguir alguma convenção documentada, como por exemplo em: https://google.github.io/styleguide/javaguide.html (veja principalmente a seção 5, sobre Naming).

## Entrega

 1. Seu trabalho deverá ser entregue no seu **repositório** remoto da disciplina no GitHub. 

 2. Você deve ter um repositório local da disciplina, que é um clone do repositório remoto. Neste repositório local, crie uma pasta chamada `t6` (atenção: **letra minúscula**).

 3. Todos os arquivo do seu trabalho deverão ficar dentro da pasta `t6`, podendo estar em sub-pastas, se necessário. A função `main` deverá estar no arquivo `EnadeUFSMExplorer.java`, nomeado **exatamente** desta forma. 

 4. Arquivos gerados pelo seu IDE também devem ser entregues, em especial o arquivo contendo configurações para compilação do código (ex.: build.xml). 



## Material de Apoio

- [Prática com TableView](../../praticas/oo/java5)  
  Roteiro de aula prática sobre TableView, com exemplos e link para slides. O exemplo 6 ilustra a seleção de linha da tabela.

- [Opening a new Window in JavaFX](https://o7planning.org/en/11533/opening-a-new-window-in-javafx)  
  Exemplos de código com criação de nova janela usando JavaFX.

 
