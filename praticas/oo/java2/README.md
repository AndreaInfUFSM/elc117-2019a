# Prática de POO
Esta prática tem por objetivo exercitar os conceitos de programação orientada a objetos, fixando os conteúdo de Abstração e Encapsulamento. Os exercícios foram preparados por [Marco Antoni](https://github.com/marcoantoni/docenciaI), como parte de suas atividades de Docência Orientada no Mestrado em Ciência da Computação da UFSM.

## Parte I
1. Para começar, baixe a classe [Data.java](Data.java) que contém uma estrutura minimalista de uma classe para representar uma data usando orientação a objetos.

2. Crie um novo arquivo chamado AppData.java dentro da pasta onde o arquivo anterior foi baixado. Este arquivo deve conter o método `public static void main(String args[])`.

3. Dentro do método principal, crie um objeto chamado dataNascimento da classe Data passando como parâmetro 3 inteiros que represtam respectivamente o dia, mes e ano de uma determinada data.

   Tente compilar esse código. Qual foi o motivo deste erro? 

   Corrija o método construtor para que ele receba os parâmetros passados na criação do objeto. Acrescente os atributos mes e ano do tipo int seguindo à estrutura existente na classe Data e ajuste o método construtor para ele inicialize os atributos da classe.

4. Agora vamos exibir os atributos da data criada, para isso adicione o seguinte código  dentro do método `main` em AppData.
   ```java
   System.out.println(dataNascimento.dia + "/" + dataNascimento.mes + "/" +     dataNascimento.ano);
   ```

   Recompile e execute novamente o arquivo AppData e veja que a saída será os valores que foram passados na criação do objeto. 

5. Modifique os valor dos atributos do objeto com a instrução abaixo e exiba os dados na tela depois de modificar os atributos do objeto.
   ```java
   dataNascimento.dia = 40;
   ```

6. Isso mudou o valor do atributo permitindo inserir um valor inválido para uma data. Vamos **encapsular** os atributos para impedir que eles sejam acessados diretamente. Para isso acrecente a palavra reservada `private` antes do tipo do dado nos atributos da classe `Data.java`. Recompile o código e veja os erros de saída `AppData.java:X: error: dia has private access in Data`. Isto indica que não podemos mais acessar diretamento o atributo pois ele foi encapsulado.

Comente as linhas onde é feito o acesso direto aos atributos.

7. Agora vamos criar um método chamado `setData` responsável validar e  atribuir os valores a data. Sempre utilizamos o método `set` para alterar o valor de qualquer atributo que esteja encapsulado.
   ```java
   public void setData(int dia, int mes, int ano){
        int diasmes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes > 0 && mes < 13){
		this.mes = mes;
		// validando o dia de acordo com o mes
		if (dia > 0 && dia <= diasmes[mes+1]){
			this.dia = dia;
		} else {
			System.out.println("Dia inválido");
			this.dia = 1;
		} 
	} else {
		System.out.println("Mês inválido");
		this.mes = 1;
	}

	if (ano > 0){
		this.ano = ano;
	} else {
		System.out.println("Ano inválido");
		this.ano = 1900;
	}
   }
   ```

8. Vamos adicionar um método `get` para pegar o valor dos atributos. Sempre utilizamos o método `get` para pegar o conteúdo de qualquer atributo que esteja encapsulado.
   ```java
   public String getData(){
   	return dia + "/" + mes + "/" + ano;
   }
   ```

9. Chame os métodos `setData` e `getData` dentro do método principal de AppData
   ```java
   dataNascimento.setData(2, 6, 2019);
   
   System.out.println( dataNascimento.getData() );
   
   ```

10. Compile e execute os códigos. Tente passar valores inválidos ao método `setData`


## Parte II - Implementação de uma classe
A segunda prática tem por objetivo exercitar os conceitos de Abstração, Encapsulamento e utilizar o conceitos da linguagem Java além de fazer o reaproveitamento de código (um dos objetivos da OO).

1. Implemente uma classe chamada Pessoa contendo os atributos `nome, cpf, sexo e dataNascimento`. O atributo dataNascimento deve ser do tipo `Data` (classe utilizada anteriormente).

2. Codifique o método construtor para que ele inicialize todos os atributos da classe e também crie os métodos `get` e `set` para cada atributo da classe. 

3. Codifique um método chamado apresentarPessoa() que escreve na tela todos os atributos da classe. Para exibir a data de nascimento, você deve usar método `getData()` da classe Data. 

4. Altere o método construtor da classe **Data** para que ele execute o método `setData` ao ser executado.

5. Crie um método chamado **ehBissexto** do tipo `boolean` que retorna **true** se o ano for bissexto e depois altere o método `setData` para validar o dia inicializado do mês de fevereiro. O método não deve receber nenhum parâmetro (utilizar o valor gravado nos aributos da classe).

4. Crie um método **static** chamado somarDias na classe Data que recebe uma **Data** como parâmetro e o número de dias a somar e **retorne** uma nova data ```return new Data(dd, mm, ano);```. A nova data deve considerar os anos bissextos. 
 
