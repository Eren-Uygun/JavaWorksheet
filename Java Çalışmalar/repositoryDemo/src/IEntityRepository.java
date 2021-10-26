public interface IEntityRepository<T extends IEntity > { //sadece IEntity ile implement edilen classları kabul edecektir.
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
