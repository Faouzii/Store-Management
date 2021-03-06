package hu.klayton.wade.sm.service;

import hu.klayton.wade.sm.dto.WareHouseDTO;

import java.util.List;

/**
 * @author Walter Krix <wkrix89@gmail.hu>
 */
public interface WareHouseService {
    List<WareHouseDTO> findAll();

    void save(WareHouseDTO wareHouseDTO);

    void delete(Long id);

    WareHouseDTO findOne(Long id);
}
