# cardAdministration
## 起動方法
BE（サーバーサイド）：spring_beをプロジェクトとしてeclipseに読み込んでspringbootアプリケーションを実行。もしくはjavaアプリケーションの実行でMyApplication.javaを選択して実行
postgres：ルートディレクトリでdocker-compose up -d とすればpostgresqlコンテナが立ち上がる。
FE：next_fe/に移動しnpm run devでアプリ起動。