package com.cogent.modal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sauravi
 */

@Entity
@Table(name = "department")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Department id i.e. auto generated by database")
    private Long id;

    @Column(name = "department_name", nullable = false, length = 50)
    @ApiModelProperty(value = "Department name should be unique")
    private String departmentName;

    @Column(name = "code", nullable = false, length = 50)
    @ApiModelProperty(value = "Department Code should be unique")
    private String code;

    @Column(name = "status")
    @ApiModelProperty(value = "Y, N and D are only used")
    private Character status;

    @Column(name = "created_date")
    @ApiModelProperty
    private Date createdDate;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @Column(name = "created_by_id")
    private Long createdById;

    @Column(name = "last_modified_by_id")
    private Long modifiedById;
}
