package clases;


public interface IQueue {
    public void enqueue(Nodo_Documento element);
    public Nodo dequeue();
    public Object process();
    public Nodo dispatch();
}
