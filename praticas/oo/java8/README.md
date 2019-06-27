# Prática: Programação em Java



## Introdução

O GitHub oferece *web services* para que programas clientes explorem e operem sobre repositórios lá hospedados. É possível acessar alguns serviços por meio de uma API REST, em que habitualmente utilizamos requisições HTTP para manipular representações de recursos acessíveis pela web.

Assim, por exemplo, uma requisição HTTP GET em https://api.github.com/repos/google/gson/commits vai retornar a lista dos últimos 30 commits no repositório do projeto `gson` da organização `google`.

Ao contrário de *web services* mais antigos que representavam dados em XML e não usavam HTTP, APIs REST geralmente trabalham com representações textuais dos dados em formato [JSON](https://www.json.org/), que é mais leve que XML. Para manipular dados no formato JSON, há inúmeras bibliotecas nas mais variadas linguagens. 

Em Java, há algumas classes no SDK que representam objetos JSON, mas com funcionalidade limitada. Assim, vale a pena utilizar uma biblioteca externa, como por exemplo [Gson](https://github.com/google/gson). Nesta prática, usaremos esta biblioteca para alguns exercícios.

## Usando GSON

Você pode baixar um .jar desta biblioteca [aqui](https://search.maven.org/remotecontent?filepath=com/google/code/gson/gson/2.8.5/gson-2.8.5.jar) (versão 2.8.5). Há várias outras formas de adicioná-la ao seu projeto. Por exemplo, veja este [vídeo](https://www.youtube.com/watch?v=sYDl720USow) que mostra uma forma de usar a GSON com Netbeans.

O programa [DemoParseGithubWithGson.java](DemoParseGithubWithGson.java) ilustra o uso da GSON para obter uma lista de commits de um repositório e selecionar as datas desses commits. Uma forma simples de compilar e executar este programa no **Linux**, sem depender de ferramentas externas, é assim:
```
javac -cp .:gson-2.8.5.jar DemoParseGithubWithGson.java
java -cp .:gson-2.8.5.jar DemoParseGithubWithGson
```
No **Windows**, troque o separador ':' por ';':
```
javac -cp .;gson-2.8.5.jar DemoParseGithubWithGson.java
java -cp .;gson-2.8.5.jar DemoParseGithubWithGson
```

Observe que o programa mostra um cabeçalho da resposta onde constam informações de **paginação**. Isto existe porque o Github só retorna 30 commits por requisição, mas muitos repositórios têm bem mais do que isso. O cabeçalho, portanto, informa a próxima (next) e a última (last) páginas de commits. Por exemplo: https://api.github.com/repositories/32538871/commits?page=2 e https://api.github.com/repositories/32538871/commits?page=49.

## Exercícios

1. Adicione uma **estrutura de dados** ao programa para armazenar as datas dos commits. Depois percorra esta estrutura e mostre seu conteúdo.

2. Altere o programa para obter **mais uma página** de commits do repositório. Coloque os dados também na estrutura de dados.

3. Veja que o programa de demonstração não faz tratamento de exceção no meio do código, só faz `throws IOException` no método main. Remova isso do método main e compile o programa para ver as exceções que precisam ser tratadas (*checked exceptions*). Implemente o **tratamento de exceções** com try/catch e teste o programa em algumas situações excepcionais, por exemplo com URL inválida ou com URL de outro serviço web que retorne dados diferentes (por exemplo, este [aqui](https://api.chucknorris.io/jokes/random)).

4. Usando o programa de demonstração como referência, crie um programa com **2 threads cooperantes**: (a) uma que faz a requisição web e obtém um JsonArray com a resposta e (b) outra que processa o JsonArray e insere os elementos em uma estrutura de dados. 

5. Altere o programa anterior para obter **outros atributos dos commits**, por exemplo: `name` do `committer` ou `message` do `commit`.

6. Usando GSON, é fácil usar JSON para representar objetos em Java: as chaves e valores em JSON correspondem respectivamente a nomes e valores de atributos de instâncias de uma classe. Faça um programa seguindo as dicas [deste tutorial](http://tutorials.jenkov.com/java-json/gson.html#parsing-json-into-java-objects), definindo uma classe `Car` e fazendo a leitura/escrita de um objeto desta classe de/para o formato JSON.


