# Prática: Programação Concorrente em Java




1. Baixe o arquivo [threadabc.zip](threadabc.zip), que contém os arquivos para este exercício.

2. LEIA ISSO ANTES: Neste programa, **3 threads** atualizam concorrentemente um **array compartilhado**, inserindo caracteres A, B ou C na próxima posição livre. Cada thread insere 20 caracteres, portanto no final de cada rodada a contagem de caracteres no array deve ser: A=20 B=20 C=20.

3. Execute o programa várias vezes e observe como a ordem de execução das threads pode variar. Além disso, observe que o resultado final nem sempre é correto (problema de **inconsistência de dados**).

4. Corrija o programa, utilizando um método `synchronized`. Identifique primeiro a classe que representa o objeto compartilhado, depois identifique o método que deve ser executado em exclusão mútua. 

