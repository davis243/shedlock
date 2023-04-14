##Example using [ShedLock](https://github.com/lukas-krecan/ShedLock)

This project aims to show how it works ShedLock

To test this project you can run one instance 
```sh
./gradlew bootRun
```
and the other
```sh
./gradlew bootRun --args='--server.port=8888'
```

You can appreciate how the method between instances not execute at same time.
