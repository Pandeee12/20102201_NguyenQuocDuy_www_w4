package vn.edu.iuh.fit.demo.daos;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import vn.edu.iuh.fit.demo.entities.Manufacturer;

import javax.sql.DataSource;
import java.util.List;

public class ManufacturerDAO extends AbstractDAO<Manufacturer,Long> {

    public ManufacturerDAO(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Manufacturer entity) {
        String sql = "insert into manufacturer values(?,?)";
        jdbcTemplate.update(sql,entity.getId(),entity.getName(),entity.getEmail());
    }

    @Override
    public Manufacturer findByID(Long id) {
        String sql = "select * form manufacturer where id=?";
        return jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Manufacturer.class)
                ,id);
    }

    @Override
    public List<Manufacturer> findAll() {
        String sql = "select * from manufacturer";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Manufacturer.class));
    }
}
