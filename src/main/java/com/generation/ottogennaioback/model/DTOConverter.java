package com.generation.ottogennaioback.model;

import com.generation.ottogennaioback.model.dto.UsedItemDTOResp;
import com.generation.ottogennaioback.model.entities.UsedItem;
import org.springframework.stereotype.Service;

@Service
public class DTOConverter
{
    public UsedItemDTOResp toUsedItemDTO(UsedItem usedItem)
    {
        UsedItemDTOResp res = new UsedItemDTOResp();
        res.setId(usedItem.getId());
        res.setName(usedItem.getName());
        res.setPrice(usedItem.getPrice());
        res.setProvince(usedItem.getProvince());
        res.setWeight(usedItem.getWeight());

        return res;
    }
}
