public interface InterfaceLearning {
    void learn();
    default String getName(){
        return this.getClass().getSimpleName();
    }
}
