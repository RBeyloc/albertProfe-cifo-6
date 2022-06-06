package io.company.model;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Entity(name="RareBook")
@Table(name="RARE_BOOK_TABLE")
public class RareBook extends Book{

    @Column(name="HAND_MADE")
    private boolean handMade;
    @Column(name="HAND_NUMBERED")
    private boolean handNumbered;
    @Column(name="numberCollection")
    private String numberCollection;
    @Column(name="COLLECTION")
    private boolean collection;

    //example: https://www.etsy.com/listing/927526995/daemonologie-by-king-james-rare-occu
}
