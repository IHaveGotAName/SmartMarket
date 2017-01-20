package market.service.impl;

import market.Utilites.Transformer;
import market.dao.impl.ManufacturerDAO;
import market.dto.ManufacturerDTO;
import market.entity.Manufacturer;
import market.service.api.CrudService;

import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class ManufacturerService implements CrudService<ManufacturerDTO> {
    private static ManufacturerDAO manufacturerDAO = null;
    public static ManufacturerDAO getManufacturerDAO(){
        if (manufacturerDAO == null){
            manufacturerDAO = new ManufacturerDAO();
        }
        return manufacturerDAO;
    }
    @Override
    public ManufacturerDTO findById(int id) {
        ManufacturerDTO manufacturerDTO = Transformer.manufacturerToManufacturerDTO(getManufacturerDAO().findById(id));
        return manufacturerDTO;
    }

    @Override
    public List<ManufacturerDTO> findAll() {
        List<ManufacturerDTO> manufacturerDTOs = Transformer.listManufacturerToListManufacturerDto(getManufacturerDAO().findAll());
        return manufacturerDTOs;
    }

    @Override
    public void create(ManufacturerDTO manufacturerDTO) {
        Manufacturer manufacturer = Transformer.manufacturerDTOToManufacturer(manufacturerDTO);
        getManufacturerDAO().create(manufacturer);
    }

    @Override
    public void update(ManufacturerDTO manufacturerDTO) {
        getManufacturerDAO().update(Transformer.manufacturerDTOToManufacturer(manufacturerDTO));
    }

    @Override
    public void delete(ManufacturerDTO manufacturerDTO) {
        getManufacturerDAO().delete(Transformer.manufacturerDTOToManufacturer(manufacturerDTO));
    }
}
