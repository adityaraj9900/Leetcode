let createHelloWorld=function() {
    const kutti="Hello World"
    return function(...args) {
        return kutti;
    }
};
