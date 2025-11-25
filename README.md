Sistema de Controle de Missões Lunares

Este projeto tem como objetivo simular o gerenciamento de missões lunares da agência fictícia Lunar Systems. O sistema foi desenvolvido em Java utilizando Orientação a Objetos e dividido em camadas, conforme solicitado no documento da atividade.

Objetivos do Projeto

Registrar missões, astronautas e naves.

Relacionar missão com tripulação e nave utilizada.

Aplicar regras de negócio definidas.

Armazenar dados utilizando persistência em arquivos.

Organizar o sistema em camadas (model, repository, service e view).

src/main/java/rv/missoes_lunares/
│
├── model/
│   Contém as classes que representam as entidades:
│   - MissaoDAO
│   - AstronautaDAO
│   - NaveDAO
│   - Tabelas de relacionamento
│
├── repository/
│   Responsável pela leitura, gravação e consulta dos dados:
│   - Repositórios de Missão, Nave e Astronauta
│   - Recorder.java / Reader.java
│   - Connection.java / Querys.java
│
├── service/
│   Contém validações e regras de negócio:
│   - Util.java
│
└── view/
    Interface textual do sistema:
    - Main.java

Regras de Negócio Implementadas

Astronautas devem ter idade mínima de 21 anos.

Cada missão possui um código único.

A nave deve ser compatível com o número de astronautas.

A missão possui datas de lançamento e retorno.

Persistência

O projeto utiliza persistência em arquivos, seguindo o modelo solicitado, permitindo salvar e ler os dados registrados.

Como Executar

Abra o projeto em uma IDE com suporte a Maven.

Compile o projeto.

Execute a classe Main.java localizada em view.
