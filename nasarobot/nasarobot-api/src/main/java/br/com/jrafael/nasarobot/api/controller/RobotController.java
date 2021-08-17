package br.com.jrafael.nasarobot.api.controller;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;
import br.com.jrafael.nasarobot.model.Robot;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping(value = "/rest/mars")
public class RobotController {

    @PostMapping(value = "/{command}")
    public ResponseEntity<String> post(@PathVariable String command) throws BusinessValidationException {
        Robot robot = new Robot();
        robot.sendCommandsByString(command);
        return ResponseEntity.ok(robot.toString());
    }
}
