package project;

class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String msg) {
        super("Array dimension error.\n" + " " + msg);
    }

}
