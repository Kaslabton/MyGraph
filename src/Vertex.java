public class Vertex extends GraphObject {
    public Vertex(String name){
        super(name);
    }
    public Vertex(String name, int weight){
        super();
    }
    public boolean equals(Edge other){
        return this.getName().equals(other.getName());
    }
}
