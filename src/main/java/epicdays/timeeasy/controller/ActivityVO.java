package epicdays.timeeasy.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ApiModel(value = "activity vo")
@ToString
public class ActivityVO {

    @ApiModelProperty(
            value = "Unique technical identifier of this deliverer",
            example = "1",
            readOnly = true
    )
    private Long id;

    @ApiModelProperty(
            value = "name of the activty",
            example = "essen"
    )
    private String name;
}
