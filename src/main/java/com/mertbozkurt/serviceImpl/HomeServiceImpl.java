package com.mertbozkurt.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mertbozkurt.dto.DtoHome;
import com.mertbozkurt.dto.DtoRoom;
import com.mertbozkurt.entities.Home;
import com.mertbozkurt.entities.Room;
import com.mertbozkurt.repository.HomeRepository;
import com.mertbozkurt.service.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService{

	@Autowired
	private HomeRepository homeRepository;
	
	@Override
	public DtoHome findHomeById(Long id) {
		DtoHome dtoHome = new DtoHome();
	    Optional<Home> optional = homeRepository.findById(id);
	    if(optional.isEmpty()) {
		   return null;
	    }
	    Home dbHome = optional.get();
	    List<Room> dbrooms = optional.get().getRoom();
	    
	    BeanUtils.copyProperties(dbHome, dtoHome);
	    if(dbrooms != null && !dbrooms.isEmpty()) {
	    
	    	for (Room room : dbrooms) {
				DtoRoom dtoRoom = new DtoRoom();
				BeanUtils.copyProperties(room, dtoRoom);
				dtoHome.getRooms().add(dtoRoom);
	    		
			}
	    }
	    return dtoHome;
	}

	
	
}
