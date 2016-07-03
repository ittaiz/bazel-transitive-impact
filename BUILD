java_library(
    name = "before_before_greeter",
    srcs = ["src/main/java/com/example/BeforeBeforeGreeting.java"],
)
java_library(
    name = "before_greeter",
    srcs = ["src/main/java/com/example/BeforeGreeting.java"],
    deps =  [
        ":before_before_greeter",
    ],
)
java_library(
    name = "greeter",
    srcs = ["src/main/java/com/example/Greeting.java"],
    deps =  [
        ":before_greeter",
    ],
)
java_test(
    name = "GreeterTest",
    size = "small",
    srcs = ["src/test/java/com/example/GreeterTest.java"],
    deps = [
        ":greeter"
    ],
)