package vn.edu.iuh.fit.demo.daos;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.List;

public abstract class AbstractDAO<T,ID> {

    private DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public AbstractDAO(DataSource dataSource){
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public abstract void insert(T entity);
    public abstract T findByID(ID id);
    public abstract List<T> findAll();

}
