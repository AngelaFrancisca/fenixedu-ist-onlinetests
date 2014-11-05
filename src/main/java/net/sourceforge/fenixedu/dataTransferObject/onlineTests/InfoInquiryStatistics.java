/**
 * Copyright © 2002 Instituto Superior Técnico
 *
 * This file is part of FenixEdu Core.
 *
 * FenixEdu Core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu Core.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 9/Fev/2004
 *
 */
package org.fenixedu.academic.dto.onlineTests;

import java.util.List;

import org.fenixedu.academic.dto.DataTranferObject;
import org.fenixedu.academic.domain.onlineTests.StudentTestQuestion;

/**
 * 
 * @author Susana Fernandes
 * 
 */
public class InfoInquiryStatistics extends DataTranferObject {
    private StudentTestQuestion infoStudentTestQuestion;

    private List optionStatistics;

    public InfoInquiryStatistics() {
    }

    public List getOptionStatistics() {
        return optionStatistics;
    }

    public StudentTestQuestion getInfoStudentTestQuestion() {
        return infoStudentTestQuestion;
    }

    public void setOptionStatistics(List list) {
        optionStatistics = list;
    }

    public void setInfoStudentTestQuestion(StudentTestQuestion question) {
        infoStudentTestQuestion = question;
    }

}