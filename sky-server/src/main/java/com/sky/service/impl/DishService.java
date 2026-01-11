package com.sky.service.impl;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    public void savewithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishpageQueryDTO);

    void delete(List<Long> ids);

    //根据id查询菜品数据及对应的口味
    DishVO getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDTO dishDTO);
}
