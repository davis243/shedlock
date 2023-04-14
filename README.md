## Example using [ShedLock](https://github.com/lukas-krecan/ShedLock)

This project aims to show how it works ShedLock,
I use the Redis as Database Provider


To test this project you can run one instance by console
```sh
./gradlew bootRun
```
and the other instance
```sh
./gradlew bootRun --args='--server.port=8888'
```

You can appreciate how the method between instances not execute at same time.
