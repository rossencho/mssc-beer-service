package com.example.msscbeerservice.web.mappers;

import com.example.msscbeerservice.domain.Beer;
import com.example.msscbeerservice.web.models.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses=DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer neer);

    Beer beerDtoToBeer(BeerDto dto);
}
