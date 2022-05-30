package jwsmai.geekbang.project;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserBehaviorEvent implements java.io.Serializable{
    private Integer userId;
    private Integer itemId;
    private String category;
    private String clientIp;
    private String action;
    private Long ts;
}
