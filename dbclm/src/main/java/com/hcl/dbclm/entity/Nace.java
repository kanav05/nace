package com.hcl.dbclm.entity;

import java.io.Serializable;

import javax.persistence.*;


import lombok.*;

@Entity
@Table
@Builder
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Nace implements Serializable
{

    private static final long serialVersionUID = 7142776809034719356L;

    private Long id;
    @Column(name = "nacecode")
    private String naceCode;
    @Column(name = "nacelevel")
    private String level;
    private String description;
    private String parent;
    private String thisItemIncludes;
    private String thisItemAlsoIincludes;
    private String rulings;
    private String thisItemExcludes;
    private String referenceToISICRev;
}
