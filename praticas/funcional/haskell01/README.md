# Prática: Programação funcional em Haskell

## 1. Preparação

Para este exercício você vai usar o ambiente GHC, que inclui um compilador e um interpretador para Haskell.
Ele está disponível para Windows, Linux e MacOS em http://www.haskell.org/platform/.

Se você instalar a plataforma Haskell no **Windows**, abra o WinGhci, que é uma interface gráfica para o interpretador Haskell.

Se você instalar a plataforma Haskell no **Linux**, use o GHCi, que é o interpretador Haskell:
```
user@host:~$ ghci
GHCi, version 8.4.1: http://www.haskell.org/ghc/  :? for help
Loading package ghc-prim ... linking ... done.
Loading package integer-gmp ... linking ... done.
Loading package base ... linking ... done.
Prelude>
```

## 2. Primeiros passos

### 2.1. Interação básica

- Usando o interpretador no modo interativo, basta escrever chamadas de funções na linha de comando. O interpretador vai executar as funções e mostrar o resultado. As funções já devem estar definidas, ou você pode declará-las usando `let`.

- Para definir novas funções, é preferível colocá-las em um arquivo de programa, por exemplo `prog.hs`.
Depois, este arquivo precisa ser **carregado** no interpretador:
  - No Linux: `Prelude> :load prog.hs` ou `Prelude> :l prog.hs`
  - No Windows: `Ctrl-L` vai abrir uma tela de seleção do programa

- Para sair do interpretador: `Prelude> :q` ou `Ctrl-D`.

### 2.2. Execução no interpretador

1. Copie as funções abaixo para um arquivo de programa Haskell (.hs):

   ```haskell
   -- Eleva um numero ao quadrado
   -- Aqui temos um comentario!
   square :: Int -> Int
   square x = x^2
  
   -- Verifica se um numero eh par (usa if/then/else para expressar funcao condicional)
   -- A funcao 'mod' retorna resto da divisao inteira
   isEven :: Int -> Bool
   isEven n = if mod n 2 == 0 then True else False
   -- Ou simplesmente:
   -- isEven n = mod n 2 == 0

   -- Gera um numero a partir de um caracter 
   -- Note esta estrutura condicional em Haskell, usando'guardas' (|)
   encodeMe :: Char -> Int
   encodeMe c 
      | c == 'S'  = 0
      | c == 'N'  = 1
      | otherwise = undefined

   -- Calcula o quadrado do primeiro elemento da lista
   -- Note que '[Int]' designa uma lista de elementos do tipo Int 
   squareFirst :: [Int] -> Int
   squareFirst lis = (head lis)^2

   -- Verifica se uma palavra tem mais de 10 caracteres
   isLongWord :: String -> Bool -- isso é o mesmo que: isLongWord :: [Char] -> Bool
   isLongWord s = length s > 10
   ```

2. Abra o interpretador Haskell e teste as funções em cada um dos casos abaixo. 

   ```haskell
   square 2 + 1
   square (2+1)
   isEven 8
   isEven 9
   encodeMe 'S'
   squareFirst [-3,4,5]
   isLongWord "test"
   ```

3. As aplicações de funções abaixo vão gerar **erros**. Deduza qual o motivo.

   ```haskell
   sQuare 2
   square 'A'
   isEven 8.1
   encodeMe "A"
   squareFirst []
   isLongWord 'test'
   ```

## 3. Programação

Para fazer os exercícios abaixo, você vai usar [**funções de alta ordem (map, filter, etc.)**](https://docs.google.com/presentation/d/1UKi2vkIMiNdScn_m7CidoSBzZ9b4j1ppCSPKYYFjxIk/edit?usp=sharing) e [**funções anônimas**](https://docs.google.com/presentation/d/1zxqEsvCegZhxfwjjxElIkNjY-pqmLvpEnq9Mt0YBR9Y/edit?usp=sharing).

1. Crie uma função `sumSquares :: Int -> Int -> Int` que calcule a soma dos quadrados de dois números x e y.

2. Crie uma função `hasEqHeads :: [Int] -> [Int] -> Bool` que verifique se 2 listas possuem o mesmo primeiro elemento. Use a função `head` e o operador lógico `==` para verificar igualdade.

3. Escreva uma função que receba uma lista de nomes e adicione a string "Super " no início de cada nome. Use o operador `++` para concatenar strings (ou qualquer lista).

4. Crie uma função que receba uma string e retorne o número de espaços nela contidos. Dica: aplique 2 funções consecutivamente.

5. Escreva uma função que, dada uma lista de números, calcule `3*n^2 + 2/n + 1` para cada número n da lista. Dica: defina uma [**função anônima**](https://docs.google.com/presentation/d/1zxqEsvCegZhxfwjjxElIkNjY-pqmLvpEnq9Mt0YBR9Y/edit?usp=sharing).

6. Escreva uma função que, dada uma lista de números, selecione somente os que forem negativos.

7. Escreva uma função que receba uma lista de números e retorne somente os que estiverem entre 1 e 100, inclusive. Dica 1: defina uma [**função anônima**](https://docs.google.com/presentation/d/1zxqEsvCegZhxfwjjxElIkNjY-pqmLvpEnq9Mt0YBR9Y/edit?usp=sharing). Dica 2: use o operador `&&` para expressar um 'E' lógico.

8. Escreva uma função que, dada uma lista de idades de pessoas no ano atual, retorne uma lista somente com as idades de quem nasceu depois de 1980. Para testar a condição, sua função deverá subtrair a idade do ano atual.

9. Escreva uma função que receba uma lista de números e retorne somente aqueles que forem pares.

10. Crie uma função `charFound :: Char -> String -> Bool` que verifique se o caracter (primeiro argumento) está contido na string (segundo argumento). Exemplos de uso da função:
   ```
   > charFound 'a' ""  
   False  
   > charFound 'a' "uau"  
   True  
   ```

11. Crie uma função que receba uma lista de nomes e retorne outra lista com somente aqueles nomes que terminarem com a letra 'a'. Dica: conheça o [list monster](http://s3.amazonaws.com/lyah/listmonster.png), do autor Miran Lipovača :-)

12. A função `takeWhile :: (a -> Bool) -> [a] -> [a]` é uma **função de alta ordem**. Ela recebe uma função condicional e uma lista, retornando o "menor prefixo" (isto é, porção inicial) da lista que satisfaça a condição dada. Teste os exemplos abaixo no GHCi e depois crie um novo exemplo:
   ```
   > takeWhile (< 5) [1,2,3,4,5]
   > takeWhile (/=' ') "Fulana de Tal"
   ```

## Para saber mais

Consulte as seções abaixo no livro [Learn you a Haskell for Great Good!](http://learnyouahaskell.com), de Miran Lipovača:
- [Funções de alta ordem (map, filter, etc.)](http://learnyouahaskell.com/higher-order-functions) 
- [Funções anônimas](http://learnyouahaskell.com/higher-order-functions#lambdas)
