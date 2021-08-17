# NASA robot App

## Módulos do Projeto

## 1. Common
Módulo principal que contém códigos reaproveitáveis em demais módulos do projeto.

### 1.1 infrastructure
Módulo que contém código utilitários para Controllers, repositórios e validadores.

### 1.2 auth-utils
Módulo com utilitários para adicionar camada segurança eme aplicações com o Spring security.

## 2. Nasarobot
Módulo principal do projeto com todas regras as negócio para mover e rotacionar um robô em Marte.

### 2.1 Nasarobot-Model
Módulo contendo regra de negócio.

### 2.3 nasarobot-Api
Módulo contendo código para execução da aplicação principal do projeto relacionados ao robô.

## Ambiente de Desenvolvimento

O projeto utiliza os seguintes componentes:

- Spring boot 2.5.3

O projeto utiliza o [apache maven](https://maven.apache.org/) como gerenciador de pacotes. Assim, para gerar o pacote de desenvolvimento é necessário executar o seguinte comando:

```
mvn clean package
```
O comando acima gera o executável do projeto no caminho **nasarobot/nasarobot-api/target/nasarobot-api.jar**.

## Execução do componente
O módulo nasarobot-api  possui três perfis de execução:

- dev: Para execução em ambiente de desenvolvimento.
- test: Para execução em ambiente de testes.
- prod: Para execução em ambiente de produção.

Para selecionar o perfil durante a execução do sistema, o comando abaixo deve ser executado:
```
java -jar <<arquivojar> -Dspring.profiles.active=<<perfil>>
```

ou via Maven:

```
mvn spring-boot:run -Drun.profiles=<<perfil>>
```

## Execução via Docker

Com docker em execução dentro do diretório no módulo principal contendo **docker-compose.yaml** basta executar o seguinte comando:

```
docker-compose up --build
```

O enderenço local da aplicação disponível será: 

```
http://localhost:8080/rest
```

Para acessar a documentação via Swagger:

```
http://localhost:8080/swagger-ui/#/

```

Para para aplicação:

```
docker-compose down

```


