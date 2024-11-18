package spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_medication")
@Entity
public class MedicationEntity {

    @Id
    @Column(name = "id_medication")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "code")
    Long code;

    @Column(name = "name")
    String name;

    @Column(name = "lote")
    String medicationLote;

    @Column(name = "validate_date")
    Date validationDate;

    @Column(name = "supplier")
    Long supplierCode; //@TODO change to table relationship when this relationship it`s ready on database


}
