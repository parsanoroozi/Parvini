public class QueryBuilder {

    private String select;
    private String from;
    private String where;
    public QueryBuilder select(String select){
        this.select = "SELECT "+select;
        return this;
    }
    public QueryBuilder from(String from){
        this.from = " FROM "+from;
        return this;
    }
    public QueryBuilder where(String where){
        this.where = " WHERE "+where;
        return this;
    }
    public void print(){
        System.out.println(select+from+where);
    }
}
