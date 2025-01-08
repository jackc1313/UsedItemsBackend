package com.generation.ottogennaioback.controller.helper;

import com.generation.ottogennaioback.model.DTOConverter;
import com.generation.ottogennaioback.model.dto.UsedItemDTOResp;
import com.generation.ottogennaioback.model.entities.UsedItem;
import com.generation.ottogennaioback.model.repositories.UsedItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControllerHelperImpl implements ControllerHelper
{
    @Autowired
    DTOConverter dtoConverter;
    @Autowired
    UsedItemRepository uRepo;

    @Override
    public List<UsedItemDTOResp> findAllItems()
    {
        List<UsedItem> items = uRepo.findAll();
        List<UsedItemDTOResp> res = new ArrayList<>();

        for(UsedItem u : items)
            res.add(dtoConverter.toUsedItemDTO(u));

        return res;
    }
}
