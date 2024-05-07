# JavaDoc para o Projeto CaixaBranca

Este projeto inclui uma classe Java para gerenciar operações de login e verificação de usuário usando um banco de dados MySQL. O JavaDoc é uma ferramenta poderosa para gerar documentação do código-fonte Java automaticamente.

## Como Gerar a Documentação

1. **Clone o Repositório:** Clone este repositório para o seu ambiente local.

    ```bash
    git clone https://github.com/seu-usuario/caixa-branca-project.git
    ```

2. **Execute o Javadoc:** Navegue até o diretório do projeto e execute o comando Javadoc para gerar a documentação.

    ```bash
    javadoc -d docs caixabranca/*.java
    ```

    Isso criará um diretório `docs` contendo a documentação gerada.

3. **Navegue pela Documentação:** Abra o arquivo `index.html` localizado no diretório `docs` em um navegador da web para navegar pela documentação JavaDoc.

## Estrutura do Projeto

- `caixabranca/CaixaBranca.java`: Contém a classe Java para gerenciar operações de login.
- `docs/`: Diretório que conterá a documentação JavaDoc gerada.

## Navegando pela Documentação

- **CaixaBranca:** Esta classe fornece métodos para conectar ao banco de dados MySQL, verificar usuários e gerenciar informações de login.
  - `conectarBD()`: Método para conectar ao banco de dados.
  - `verificarUsuario(String login, String senha)`: Método para verificar as credenciais de login fornecidas.
  - Variáveis de instância: `nome` (Nome do usuário logado) e `result` (Resultado da verificação de usuário).

## Contribuindo

Sinta-se à vontade para enviar pull requests com melhorias ou correções para este projeto.
