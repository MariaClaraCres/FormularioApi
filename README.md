# FormularioApi
O projeto consiste em duas partes principais:

Backend (Spring Boot) :
Uma API RESTful que recebe dados de cadastro (nome, email e telefone) via método POST.
Os dados são salvos em um banco de dados H2 (em memória).
Fornece um endpoint para cadastrar novos usuários.

Frontend (Flutter) :
Um aplicativo móvel que permite ao usuário preencher um formulário com nome, email e telefone.
Os dados são enviados para o backend via requisição HTTP POST.
Exibe uma mensagem de sucesso ou erro após o envio dos dados.

Funcionalidades

Cadastro de Usuário :
O usuário pode preencher um formulário com os campos: Nome, E-mail e Telefone.
Os dados são validados antes de serem enviados para o backend.
Após o envio, uma mensagem de sucesso ou erro é exibida.

Backend :
Recebe os dados via método POST.
Salva os dados no banco de dados H2.
Retorna uma resposta 201 Created em caso de sucesso.

Estrutura do Projeto

Backend
Tecnologias :
Java 11+
Spring Boot
Spring Data JPA


Pré-requisitos
 
Backend :
JDK 11 ou superior instalado.
IntelliJ IDEA ou outra IDE compatível com Spring Boot.
Maven ou Gradle instalado (dependendo do sistema de build escolhido).

Frontend :
Flutter SDK instalado.
VS Code ou Android Studio configurado para desenvolvimento Flutter.
Emulador Android ou dispositivo físico para testes.
