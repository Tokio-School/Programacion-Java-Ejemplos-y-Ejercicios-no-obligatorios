package ejem02_interfazFuncional2;

@FunctionalInterface
interface TwoParameters<T, U> {
    void performAction(T parameter1, U parameter2);
}
