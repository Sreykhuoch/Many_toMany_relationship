package co.istad.jparelationship2.request;


import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookPublisherRequest {

    private Integer bookId;
    private Integer publisherId;
    private LocalDate publishedDate;
}

