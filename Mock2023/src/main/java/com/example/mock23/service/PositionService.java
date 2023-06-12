package com.example.mock23.service;

import com.vti.entity.Position;
import com.vti.entity.PositionName;
import com.vti.repository.IPositionRepository;
import com.vti.service.IService.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
	@Autowired
	private IPositionRepository positionRepository;

	@Override
	public Position getPositionByID(short id) {
		return positionRepository.findById(id).get();
	}

	@Override
	public List<Position> getAllPosition() {
		return positionRepository.findAll();
	}

	@Override
	public Position getPositionByName(PositionName positionName) {
		return positionRepository.findByName(positionName);
	}

	@Override
	public void createPosition(Position position) {
		positionRepository.save(position);
	}

}
