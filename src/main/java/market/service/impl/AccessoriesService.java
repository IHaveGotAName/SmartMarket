package market.service.impl;

import market.Utilites.Transformer;
import market.dao.impl.AccessoriesDAO;
import market.dto.AccessoriesDTO;
import market.entity.Accessories;
import market.service.api.CrudService;

import java.util.List;

/**
 * Created by ivegotaname on 04.12.16.
 */
public class AccessoriesService implements CrudService<AccessoriesDTO> {
    private static AccessoriesDAO accessoriesDAO = null;
    public static AccessoriesDAO getAccessoriesDAO(){
        if (accessoriesDAO == null){
            accessoriesDAO = new AccessoriesDAO();
        }
        return accessoriesDAO;
    }
    @Override
    public AccessoriesDTO findById(int id) {
            AccessoriesDTO accessoriesDTO = Transformer.accessoriesToAccessoriesDTO(getAccessoriesDAO().findById(id));
            return accessoriesDTO;
    }

    @Override
    public List<AccessoriesDTO> findAll() {
        List<AccessoriesDTO> accessoriesDTOs = Transformer.listAccessoriesToListAccessoriesDto(getAccessoriesDAO().findAll());
        return accessoriesDTOs;
    }

    @Override
    public void create(AccessoriesDTO accessoriesDTO) {
        Accessories accessories = Transformer.accessoriesDTOToAccessories(accessoriesDTO);
        getAccessoriesDAO().create(accessories);
    }

    @Override
    public void update(AccessoriesDTO accessoriesDTO) {
        getAccessoriesDAO().update(Transformer.accessoriesDTOToAccessories(accessoriesDTO));
    }

    @Override
    public void delete(AccessoriesDTO accessoriesDTO) {
        getAccessoriesDAO().delete(Transformer.accessoriesDTOToAccessories(accessoriesDTO));
    }
}
