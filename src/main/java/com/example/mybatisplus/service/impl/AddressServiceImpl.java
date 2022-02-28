package com.example.mybatisplus.service.impl;

import com.example.mybatisplus.model.domain.Address;
import com.example.mybatisplus.mapper.AddressMapper;
import com.example.mybatisplus.service.AddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gzx
 * @since 2022-02-28
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

}
