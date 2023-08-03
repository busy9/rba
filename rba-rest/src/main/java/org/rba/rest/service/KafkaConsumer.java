package org.rba.rest.service;

import org.rba.rest.model.BModel;
import org.rba.rest.model.RModel;
import org.rba.rest.model.RbaModel;
import org.rba.rest.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @Autowired
    private RbaService rbaService;

    @Autowired
    private RbaRepository rbaRepository;

    @Autowired
    private RRepository rRepository;

    @Autowired
    private BRepository bRepository;

    @KafkaListener(topics = {"rba-data"}, groupId = "rba-group", autoStartup = "true", concurrency = "3")
    public void consume(Integer data) {
        logger.info("called for " + data);
        String rba = rbaService.parseIntToRBA(data);
        logger.info("received: {} -> {}", data, rba);
        if (rba == null) {
            return;
        }
        switch (rba) {
            case "R":
                rRepository.save(new RModel(rba));
                break;
            case "B":
                bRepository.save(new BModel(rba));
                break;
            case "RBA":
                rbaRepository.save(new RbaModel(rba));
                break;
            default:
                break;
        }
    }

}
