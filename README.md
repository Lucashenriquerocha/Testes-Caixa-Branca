# Testes-Caixa-Branca

Este é um projeto Java que implementa um sistema básico de login utilizando JDBC para se conectar a um banco de dados MySQL. No entanto, há alguns erros no código que precisam ser corrigidos:

Erro na Classe do Driver MySQL:
A classe do driver MySQL está incorretamente especificada. Para corrigir, substitua "com.mysql.Driver.Manager" por "com.mysql.jdbc.Driver".
Tratamento de Exceção Ausente:
Dentro dos blocos catch, não há tratamento específico para as exceções. Recomenda-se adicionar e.printStackTrace() ou System.out.println(e.getMessage()) para depuração e rastreamento de erros.
Vazamento de Recursos:
A conexão com o banco de dados não é fechada após o uso, o que pode levar a vazamento de recursos. Adicione conn.close() ao final do método verificarUsuario() para fechar a conexão corretamente.
Vulnerabilidade de Injeção SQL:
O código atual concatena diretamente os valores dos parâmetros login e senha na consulta SQL, tornando-o vulnerável a ataques de injeção SQL. Em vez disso, use prepared statements para evitar essa vulnerabilidade.
Código Desnecessário:
As variáveis nome e result não são necessárias como variáveis de classe. Elas podem ser definidas dentro do método verificarUsuario().
