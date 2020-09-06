## Lista de Exercícios

### Exercício 1: Clientes e contas

1. Definir uma nova classe Cliente contendo as seguintes propriedades:
    - nome
    - sobrenome

2. Definir uma nova classe Conta contendo as seguintes propriedades:
    - número da conta
    - saldo
    - titular (o titular é um objeto do tipo Cliente).

3. Criar uma função chamado depósito que tenha como parâmetro de entrada
quantia em dinheiro. Como estamos fazendo um depósito, a quantia de dinheiro
é somada ao saldo. A função deve imprimir na tela o tipo de transação realizada
e o novo saldo.

4. Criar uma função chamado saque que tenha como parâmetro de entrada
quantia em dinheiro. Como estamos fazendo um saque, a quantia é subtraída do
saldo. Caso o valor do saque a realizar seja maior que o saldo disponível, imprimir
na tela: “Saldo insuficiente”. Caso contrário, a função deve imprimir na tela o tipo
de transação realizada e o novo saldo.

5. Definir uma nova classe chamada Exercicio1 e criar uma função main. Dentro
da função main, criar dois clientes, passando nome e sobrenome, e criar uma
conta para cada um, inicializando número da conta, saldo e titular. Em seguida,
fazer um depósito e um saque em cada conta.

### Exercício 2: Jogadores e treinamento

1. Definir uma nova classe JogadorDeFutebol contendo as seguintes propriedades:
    - nome
    - energia
    - alegria
    - gols
    - experiência
    
2. Criar uma função chamada fazerGol em jogador, que tire 5 pontos de energia e
dê 10 pontos de alegria ao jogador, além de aumentar o número de gols em 1. O
método deve imprimir “GOOOOL!” na tela.

3. Criar uma função chamada correr em jogador, que tire 10 pontos de energia
dele. O método deve imprimir na tela: “Cansei”.

4. Definir uma nova classe SessaoDeTreinamento contendo as seguintes
propriedades:
    - experiência (ganha quando um treinamento é realizado)
    
5. Criar uma função chamado treinarA que tenha como parâmetro de entrada um
jogador de futebol. Como é um treinamento, o jogador precisa:
    - Correr
    - Fazer um Gol
    - Correr

Depois que o jogador fizer essas três coisas, a experiência dele deve aumentar,
somando um ponto na experiência. A função deve imprimir a experiência inicial e
a experiência final do jogador.

6. Definir uma nova classe chamada Exercicio2 e criar uma função main. Dentro
da função main, criar dois jogadores de futebol, configurando as propriedades
necessárias, e criar uma sessão de treinamento, também com as propriedades
necessárias. Os dois jogadores devem realizar um treinamento.

### Exercício 3: Atletas e prova

1. Definir uma nova classe Atleta contendo as seguintes propriedades:
    - nome
    - nível
    - energia

2. Definir uma nova classe Prova contendo as seguintes propriedades:
    - dificuldade
    - energiaNecessaria
    
3. Criar, na classe Prova, a função podeRealizar, que tenha como parâmetro de
entrada um objeto do tipo Atleta. A função deve retornar true caso o atleta possa realizar a 
prova e, caso contrário, false. Um atleta pode realizar a prova se tiver um nível maior ou igual à
dificuldade da prova, além de energia suficiente.

4. Definir uma nova classe chamada Exercicio3 e criar uma função main. Dentro
da função main, criar dois atletas, configurando as propriedades necessárias, e
criar três provas para cada um, também com os atributos necessários. Depois,
verificar se os atletas podem realizar essas provas.

### Exercício 4: Tripé

O tripé é um aparelho de três pés, com a parte superior circular ou triangular,
que permite estabilizar uma câmera e evitar os movimentos dela. Queremos
modelar o comportamento desse objeto.

1. Definir uma classe Tripé contendo as seguintes propriedades:
    - Dobrado: indica o estado atual do tripé (dobrado ou não)
    - alturaMinima
    - alturaMaxima
    - alturaAtual.
    
2. Definir a função definirAltura(novaAltura: Int), que receba uma altura e
modifique o valor da altura atual.

3. Definir a função dobrar(), que permita dobrar o tripé.

4. Definir a função desdobrar(), que permita desdobrar o tripé.
5. Definir a função guardar(), que permita deixar o tripé pronto para guardar. Ou
seja, ele deve estar dobrado e a altura atual deve ser a menor possível.

6. Definir a função prontoParaGuardar(), que permita verificar se o tripé está
pronto para ser guardado. Ou seja, ele deve estar dobrado e com a mínima altura
atual.

7. Definir a função usar(), que permita usar o tripé. Um tripé está pronto para usar
quando está desdobrado e com altura superior à metade da altura máxima.

8. Definir a função prontoParaUsar(), que permita verificar se o tripé está pronto
para ser usado. Ou seja, ele deve estar desdobrado e com altura superior à
metade da altura máxima.

9. Definir uma nova classe chamada Exercicio4 e criar uma função main. Dentro
da função main, criar um tripé e fazer testes com as funções definidas
anteriormente.