package moles.project.base.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author michal.oles
 * this is rest send string with permition
 */
@RestController
@RequestMapping("info")
public class PermitInformationController {

    private static final Logger logger = LoggerFactory.getLogger(PermitInformationController.class);
    /**
     *  not role
     * @return text
     */
    @RequestMapping
    public String getPermitAllInfo(){
        logger.info("This is not protection info");
        return "This is not protection info";
    }
}
