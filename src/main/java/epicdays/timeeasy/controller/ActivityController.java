package epicdays.timeeasy.controller;

import epicdays.timeeasy.persistence.repository.ActivityRepository;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("/activities")
@RestController
public class ActivityController {

    private ActivityRepository repository;

    @ApiOperation(value = "get all activities", code = 201)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK")})
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<ActivityVO>> createDeliverer() {
        return null;
    }
}
