package com.sunbasedata.exception;


import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorDetails {

    private String name;
    private LocalDate localDate;
    private String desc;

}
