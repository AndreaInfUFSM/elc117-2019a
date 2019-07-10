# Trabalho 5: RandomPicker e suas duas UIs

## Deadline

Domingo, 16 de junho, 23:55.

## Objetivo

Neste trabalho, você vai desenvolver dois programas em Java com a mesma funcionalidade principal, porém com diferentes interfaces com o usuário (*user interfaces* - UIs). A funcionalidade principal é a seleção de itens aleatoriamente a partir de uma data lista, sem reposição (isto é, a cada seleção obtém-se um novo item da lista, até esgotarem-se os itens). Um dos programas terá interface textual, por linha de comando, e o outro terá interface gráfica. Chamaremos estes programas de `RandomPickerCmd` e `RandomPickerGUI`, respectivamente. Ambos os programas deverão implementar o embaralhamento dos itens recebidos de duas formas: uma *offline* e outra *online*, usando o site [random.org](htto://random.org). Seu maior objetivo será empregar os conceitos de orientação a objetos para organizar seu código, de forma que algumas classes possam ser usadas pelos dois programas.

## RandomPickerCmd.java

- O programa com interface textual deverá receber um nome de arquivo na linha de comando. Exemplo de uso:
  ```
  java RandomPickerCmd names.txt
  ```

- Esse arquivo deverá conter uma lista de strings (um item por linha), como [neste exemplo](names.txt).

- O programa deverá embaralhar os itens recebidos e mostrar um item de cada vez, aguardando um comando do usuário (por exemplo, um Enter).


## RandomPickerGUI.java

O programa com interface gráfica deverá conter os seguintes componentes: 

  - Uma barra de menus ([MenuBar](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/MenuBar.html) contendo um [Menu](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Menu.html) "File" e um [Menu](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Menu.html) "Help". No Menu "File", haverá dois itens ([MenuItem](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/MenuItem.html)): "Open" e "Exit". O item "Open" deverá abrir um [FileChooser](https://docs.oracle.com/javafx/2/ui_controls/file-chooser.htm) para escolha do arquivo. O item "Exit" deverá fechar a aplicação. No menu "Help", haverá somente um item "About", que mostrará o nome do programa e do autor.

  - Uma [TextArea](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextArea.html) que deverá mostrar o conteúdo do arquivo aberto com "File -> Open". Essa mesma TextArea deverá permitir que o usuário digite strings ao invés de obtê-las de um arquivo.

  - Um botão "Shuffle" para embaralhar a lista, isto é, reordenar os itens aleatoriamente. A lista embaralhada não será mostrada ao usuário de uma só vez - o usuário usará o botão "Next" para obter um item da lista a cada clique.

  - Um botão "Next", inicialmente desabilitado. Quando o usuário clicar em "Shuffle", o botão "Next" será habilitado e causará a apresentação, na interface gráfica, de um item da lista embaralhada. Quando forem apresentados todos os itens (por sucessivos cliques em "Next"), o botão "Next" deverá ser desabilitado novamente.

  - Um label que mostrará um item de cada vez, conforme o usuário clicar em "Next".



## Embaralhamento

Para ambos os programas, o embaralhamento deverá ser implementado de duas formas: uma *offline* e outra *online*. A forma *offline* pode usar algum método do SDK do Java. A forma *online* deverá usar o site [random.org](http://random.org). Para isso, é fornecido um [exemplo de programa](DemoPostRandomOrg.java) que faz uma requisição web a esse site.

A escolha da implementação de embaralhamento deverá ser transparente ao usuário, ou seja, o próprio programa decidirá qual implementação utilizar. Para isso, o programa pode verificar, por exemplo, a disponibilidade do site random.org, a quantidade de itens a embaralhar, etc.

Embora seja suficiente implementar 2 formas de embaralhamento, seu código deverá ser organizado de forma a facilitar a adição, remoção ou localização de implementações de embaralhamento. 

## Coding Style

Você já deve ter notado que códigos em Java costumam seguir convenções diferentes de C para nomes (de variáveis, de métodos, etc.) e para outros detalhes de "estilo" do código. Acostume-se com isso e procure seguir alguma convenção documentada, como por exemplo em: https://google.github.io/styleguide/javaguide.html (veja principalmente a seção 5, sobre Naming).

## Entrega

 1. Seu trabalho deverá ser entregue no seu **repositório** remoto da disciplina no GitHub. 

 2. Você deve ter um repositório local da disciplina, que é um clone do repositório remoto. Neste repositório local, crie uma pasta chamada `t5` (atenção: **letra minúscula**).

 3. Todos os arquivo do seu trabalho deverão ficar dentro da pasta `t5`, podendo estar em sub-pastas, se necessário. Os arquivos RandomPickerCmd.java e RandomPickerGUI.java, que vão conter os métodos `main`, deverão ser nomeados exatamente desta forma. Os demais arquivos serão nomeados de acordo com seu conteúdo, seguindo as convenções para Java.

 4. Arquivos gerados pelo seu IDE também devem ser entregues, em especial o arquivo contendo configurações para compilação do código (ex.: build.xml). 
