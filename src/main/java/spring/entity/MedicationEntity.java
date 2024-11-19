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
    private Long id;

    @Column(name = "code")
    private Long code;

    @Column(name = "name")
    private String name;

    @Column(name = "lote")
    private String medicationLote;

    @Column(name = "validate_date")
    private Date validationDate;

    @ManyToOne
    @JoinColumn(name = "id_supplier")
    private SupplierEntity supplierCode;


}
