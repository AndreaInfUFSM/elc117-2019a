# Trabalho 4: Resolva um mistério em Prolog

## Deadline

Quarta, 8 de maio, 23:59.

## O Mistério

Em uma manhã de sábado, o inspetor Hercule Poirot foi requisitado para solucionar um mistério da morte de Anita, que foi assassinada no apartamento que dividia com algumas pessoas.

 O inspetor viu indícios de que o crime aconteceu na sexta ou na quinta-feira e foi cometido por apenas uma pessoa. Ele também viu três possíveis motivos para o crime: dinheiro, ciúme ou insanidade. Além disso, o agressor devia ser alguém que dividia o apartamento com Anita.

Poirot estabeleceu que as armas do crime poderiam ser:
- O bastão de baseball que foi roubado do amigo pobre de Anita, Bernardo, na quinta-feira em Porto Alegre ou na quarta-feira em Santa Maria; OU
- O martelo que foi roubado da caixa de ferramentas do apartamento na quarta ou na quinta-feira.


O assassino entrou no quarto de Anita utilizando a chave que roubou dela. Esta chave foi roubada na ~~quarta-feira~~ **segunda-feira** em Santa Maria ou na terça-feira em Porto Alegre. Dinheiro foi roubado do quarto de Anita e sua amiga Bia, que é pobre, tem uma cópia da chave.
Anita tem um relacionamento com Bernardo, que por sua vez teve um relacionamento com a garota rica Caren. Além disso, Anita teve um relacionamento com Pedro, que é pobre e namorou com a garota rica Alice. Alice namorou com o igualmente rico Henrique. Henrique tinha sido noivo de Maria, que é pobre. Maria costumava sair com Adriano, que é rico, e já namorou com a menina rica Caren.

Pedro estava em Santa Maria na segunda e na terça-feira, em Porto Alegre na quarta, em Santa Maria novamente na quinta e depois voltou ao apartamento. 
Caren ficou em Porto Alegre de segunda a quarta-feira, esteve em Santa Maria na quinta e na sexta ficou no apartamento.
Henrique esteve no apartamento na segunda, em Porto Alegre na terça e depois voltou para o apartamento.
Bia passou a segunda-feira no apartamento, esteve em Porto Alegre na terça e quarta e foi para Santa Maria na quinta, então retornou para o apartamento na sexta-feira.
Adriano estava em Santa Maria quarta-feira e ficou no apartamento o resto da semana.
Alice estava em Porto Alegre terça e quarta-feira e no apartamento segunda, quinta e sexta-feira.
Bernardo estava em Santa Maria segunda e terça-feira, em Porto Alegre na quarta-feira, em Santa Maria novamente na quinta-feira e no apartamento na sexta.
Maria esteve em Santa Maria de terça a quinta-feira e no apartamento na segunda e na sexta-feira.
Adriano e Maria já visitaram um psiquiatra para tratar transtornos psicóticos.



## O Trabalho

Sua tarefa é escrever um programa em Prolog que ajude Hercule Poirot a encontrar o(a) assassino(a)!

Algumas dicas:

1. Use predicados para definir onde cada pessoa estava em cada dia e com quem já se relacionou. Defina também quem é vítima, pobre ou insano. Por exemplo:
   ```prolog
   insano(adriano).
   vitima(anita).
   ```

2. Para responder quem é o assassino, você pode usar a regra: `assassino(X) :- motivo(X), acesso(X).`
  - O motivo do crime pode ser: ciúmes, insanidade ou dinheiro.
  - O predicado ``acesso`` deve verificar se ``X``: 
    - Pode ter roubado a arma.
    - Pode ter roubado a chave.
    - Estava no apartamento no momento do crime.


## Entrega

 1. Seu trabalho será entregue no seu **repositório** remoto da disciplina no GitHub. 

 2. Você deverá ter um repositório local da disciplina, que será um clone do repositório remoto. No seu repositório local, crie uma pasta chamada `t4` (atenção: **letra minúscula**).

 3. Coloque o arquivo `t4.pl` do seu trabalho dentro desta pasta. 
