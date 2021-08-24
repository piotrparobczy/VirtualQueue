package com.apator.virtualQueue.services;

import com.apator.virtualQueue.dto.CaseDto;
import com.apator.virtualQueue.model.Queue;
import com.apator.virtualQueue.repository.QueueRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class QueueServices {
    private final QueueRepository queueRepository;


    public QueueServices(QueueRepository queueRepository) {
        this.queueRepository = queueRepository;
    }

    public void createCase(CaseDto caseDto) {
        Queue queue = new Queue();
        queue.setUserNick(caseDto.getNickname());
        queue.setCaseType(caseDto.getType());
        queueRepository.save(queue);
    }
}
