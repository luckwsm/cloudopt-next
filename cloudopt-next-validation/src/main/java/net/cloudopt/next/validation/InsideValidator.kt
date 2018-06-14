/*
 * Copyright 2017 Cloudopt.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
package net.cloudopt.next.validation

import net.cloudopt.next.validation.annotation.Inside

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

/*
 * @author: Cloudopt
 * @Time: 2018/6/14
 * @Description: Is used to verify whether a text is in an array
 */
class InsideValidator : ConstraintValidator<Inside, String> {

    lateinit var value: Array<String>

    override fun initialize(inside: Inside) {
        value = inside.value as Array<String>
    }

    override fun isValid(s: String, constraintValidatorContext: ConstraintValidatorContext): Boolean {
        for (text in value!!) {
            if (text == s) {
                return true
            }
        }
        return false
    }


}
