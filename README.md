### Spring e aws

###### Comandos aws cli
```
aws configure --profile nome do usuario iam
aws s3 ls (listar os buckets)
aws s3 mb s3://devfabricio (criar um bucket)
aws s3 rb s3://devfabricio (remover um bucket)
aws s3 cp teste.txt s3://fabriciotest/pasta que deseja (enviando um arquivo)
aws s3 cp teste.txt s3://fabriciotest/pasta que deseja  -- delete (o que apagar da minha pasta, apaga que esta no s3)
aws s3 sync . s3://fabriciotest (sincronizar os arquivos para um bucket)
```
