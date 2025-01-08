package com.generation.ottogennaioback.controller;

import com.generation.ottogennaioback.controller.helper.ControllerHelper;
import com.generation.ottogennaioback.model.dto.UsedItemDTOResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class UsedItemController
{
    @Autowired
    ControllerHelper ch;

    @GetMapping
    public List<UsedItemDTOResp> getItems(){return ch.findAllItems();}
}
