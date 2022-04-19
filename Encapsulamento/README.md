## ENCAPSULAMENTO

> CONCEITO
O objetivo do Encapsulamento é garantir que os dados "sensíveis" estão escondidos dos usuários e as vezes dos programadores. Para conseguir isso você deve:
- declarar variáveis/atributos de classe como privados
- fornecer métodos públicos para acesso (GET) e atualização (SET) do valor de uma variável privada

> BENEFÍCIOS
- Melhor controle dos atributos e métodos de classe
- Atributos de classe podem ser feitos somente leitura (se você usar apenas o método get) ou somente gravação (se você usar apenas o método set)
- Flexível: o programador pode alterar uma parte do código sem afetar outras partes
- Maior segurança de dados

> MODIFICADORES
- public: A instrução é acessível em todas as classes do projeto
- private: A instrução só é acessível dentro da classe declarada
- default: A instrução só é acessível no mesmo pacote. Isso é usado quando você não especifica um modificador. 
- protected: A instrução é acessível no mesmo pacote e subclasses.
