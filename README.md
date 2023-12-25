# cardAdministration
## 起動方法
### BE（サーバーサイド）
spring_be/をプロジェクトとしてeclipseに読み込んでspringbootアプリケーションを実行。  
もしくはjavaアプリケーションの実行でMyApplication.javaを選択して実行

### DB
postgres

ルートディレクトリでdocker-compose up -d とすればpostgresqlコンテナが立ち上がる。  
`docker exec -it cardadministration-postgres-1 psql -h localhost -U postgres -d postgres` でコンテナ内に入れる

### FE
next_fe/に移動しnpm run devでアプリ起動。