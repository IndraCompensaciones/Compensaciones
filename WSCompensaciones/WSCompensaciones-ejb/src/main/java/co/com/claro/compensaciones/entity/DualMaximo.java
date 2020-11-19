package co.com.claro.compensaciones.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "DUAL")
@Table(name = "SYS.DUAL")
public class DualMaximo {
    @Id
    @Column(name = "DUMMY")
    private String dummy;

    public DualMaximo() {
    }

    public DualMaximo(String dummy) {
        this.dummy = dummy;
    }

    public String getDummy() {
        return dummy;
    }

    public void setDummy(String dummy) {
        this.dummy = dummy;
    }
}
