package moles.project.base.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    /**
     *  no role, logged
     * @return text
     */
    @RequestMapping(value = "/logged", method = RequestMethod.GET)
    public String getPermitLoged(){
        logger.info("Show when you logged");
        return "Show when you logged";
    }
    /**
     *  role user, logged
     * @return text
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getPermitRoleUser(){
        logger.info("Show when you have role User");
        return "Show when you have role User";
    }

    /**
     *  role admin, logged
     * @return text
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getPermitRoleAdmin(){
        logger.info("Show when you have role Admin");
        return "Show when you have role Admin";
    }

    /**
     *  no role , logged
     * @return text
     */
    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public String accessDenied(){
        logger.info("Dont have access");
        return "Dont have access";
    }
}
