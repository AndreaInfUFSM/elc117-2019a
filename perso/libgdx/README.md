# Personalizada: POO com Java e libGDX

Estas sugestões de atividades personalizadas são para quem se interessa por desenvolvimento de jogos para múltiplas plataformas (desktop, web, mobile). Para isso, você vai usar um framework em Java chamado [libGDX](https://libgdx.badlogicgames.com/).


## Atividade 1


### Preparação

1. Crie um clone do repositório [https://github.com/AndreaInfUFSM/java-libgdx-simple-drop-example](https://github.com/AndreaInfUFSM/java-libgdx-simple-drop-example). 
```
git clone https://github.com/AndreaInfUFSM/java-libgdx-simple-drop-example.git
```
Este repositório contém um jogo simples explicado em https://github.com/libgdx/libgdx/wiki/A-simple-game


2. Compile e execute o jogo:
```
cd java-libgdx-simple-drop-example
./gradlew desktop:run
```
Obs.: A primeira compilação é demorada.

2. Abra os 2 arquivos que contêm o código do jogo para desktop:
   - [desktop/src/com/badlogic/drop/desktop/DesktopLauncher.java](https://github.com/AndreaInfUFSM/java-libgdx-simple-drop-example/blob/master/desktop/src/com/badlogic/drop/desktop/DesktopLauncher.java) 
   - [core/src/com/badlogic/drop/Drop.java](https://github.com/AndreaInfUFSM/java-libgdx-simple-drop-example/blob/master/core/src/com/badlogic/drop/Drop.java)

3. Examine o código e responda às questões a seguir.


### Questões

Crie um documento em Markdown (.md) com respostas às seguintes questões:

1. Quais os nomes de classes definidas nos arquivos DesktopLauncher.java e Drop.java?
2. Explique como o conceito de herança se aplica a ambas as classes.
3. Em qual classe estão os atributos que representam as gotas que "caem" no balde?
4. Quais são os atributos do jogo que representam a imagem e a posição das gotas?
5. O que significam as anotações @Override em Drop.java?
6. Em Drop.java, no método spawnRaindrop():
7. É possível deduzir qual a visibilidade (public, private, protected) do atributo raindrop.x?
8. Ainda no método spawnRaindrop(), MathUtils é um nome de classe ou uma referência para um objeto?
9. raindrop é um nome de classe ou uma referência para um objeto?
10. Em spawnRaindrop(), por que lastDropTime pode ser usado sem estar declarado dentro deste método?

Entregue esta atividade separadamente no formulário de entrega de atividades personalizadas.


## Atividade 2

### Preparação

1. Crie um clone do repositório [https://github.com/AndreaInfUFSM/java-libgdx-extended-drop-example](https://github.com/AndreaInfUFSM/java-libgdx-extended-drop-example). 
```
git clone https://github.com/AndreaInfUFSM/java-libgdx-simple-drop-example.git
```
Este repositório contém uma extensão do jogo anterior, conforme explicado em https://github.com/libgdx/libgdx/wiki/Extending-the-simple-game

2. Compile e execute o jogo:
```
cd java-libgdx-extended-drop-example
./gradlew desktop:run
```

2. Abra os arquivos que implementam a versão estendida do jogo: 
   - [core/src/com/badlogic/drop/Drop.java](https://github.com/AndreaInfUFSM/java-libgdx-extended-drop-example/blob/master/core/src/com/badlogic/drop/Drop.java)
   - [core/src/com/badlogic/drop/GameScreen.java](https://github.com/AndreaInfUFSM/java-libgdx-extended-drop-example/blob/master/core/src/com/badlogic/drop/GameScreen.java)
   - [core/src/com/badlogic/drop/MainMenuScreen.java](https://github.com/AndreaInfUFSM/java-libgdx-extended-drop-example/blob/master/core/src/com/badlogic/drop/MainMenuScreen.java)

3. Observe as mudanças no código: agora o jogo Drop tem duas telas, uma tela inicial (MainMenuScreen) e outra tela com o jogo em si (GameScreen). Além disso, agora o jogo mostra a quantidade de gotas recolhidas no balde.

### Programação

1. Altere o jogo para mostrar também a quantidade de gotas que caírem fora do balde.

2. Altere o jogo para usar outras imagens de objetos que caem no balde (pelo menos 2 novas imagens). Na geração desses objetos no jogo, escolha aleatoriamente entre as imagens disponíveis.


Entregue esta atividade separadamente no formulário de entrega de atividades personalizadas.


## Atividade 3

Os jogos em libGDX podem ser compilados para uso a partir de um navegador. Isso é explicado em https://github.com/libgdx/libgdx/wiki/Gradle-on-the-Commandline#packaging-for-the-web

Por exemplo, para compilar o primeiro jogo para a Web:
```
cd java-libgdx-simple-drop-example
./gradlew html:dist
```

Então você pode usar um servidor Web local para servir o jogo (por exemplo, o módulo http.server do Python 3):
```
cd html/build/dist
python3 -m http.server 8000
```
E finalmente abrir o jogo no navegador, no endereço http://localhost:8000


Para gerar algo "entregável" no formulário de atividades personalizadas, você terá que hospedar o jogo no servidor da Inf, copiando-o para sua pasta public_html em portal.inf.ufsm.br. O jogo ficará acessível em uma URL como http://www.inf.ufsm.br/~andrea/libgdx/


