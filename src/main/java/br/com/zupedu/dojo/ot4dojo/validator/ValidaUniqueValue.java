package br.com.zupedu.dojo.ot4dojo.validator;

import javax.validation.Constraint;

@Constraint(validatedBy = {Uniqu})
public @interface UniqueValue {
}
