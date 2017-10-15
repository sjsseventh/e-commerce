# Suub - E-commerce

O projeto consiste em um sistema de e-commerce que possui como objetivo permitir que o usuário após as validações, entre no sistema, adicione produtos ao seu carrinho e faça o checkout de suas compras. Para o desenvolvimento desse sistema e-commerce foram utilizados os seguintes patterns:

Proxy: foi utilizado para que quando o usuário faça a requisição do login, é necessário validar os dados. Dessa forma, temos uma camada que protege uma classe fazendo uma regra de negócio para validar logo, o usuário não consegue definir a sequência de passos.

Composite: foi utilizado para possibilitar ao usuário adicionar tanto itens simples quanto compostos ao seu carrinho, assim que todos os produtos são tratados da mesma forma.

Template: para que o usuário realize o pagamento do carrinho, é necessário seguir uma sequência de passos os quais ele tem que seguir, podendo ou não variar algum dos passos.

Strategy: para que o usuário realize o pagamento no cartão ele pode escolher entre débito ou crédito e, se necessário alterar a estratégia em tempo de execução sem que seja preciso recriar o objeto. 


